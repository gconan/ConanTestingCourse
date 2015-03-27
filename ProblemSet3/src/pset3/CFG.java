package pset3;

import java.util.*;

import org.apache.bcel.classfile.JavaClass;
import org.apache.bcel.classfile.Method;

public class CFG {
	Set<Node> nodes = new HashSet<Node>();
	Map<Node, Set<Node>> edges = new HashMap<Node, Set<Node>>();
	public static class Node {
		int position;
		Method method;
		JavaClass clazz;
		Node(int p, Method m, JavaClass c) {
			position = p;
			method = m;
			clazz = c;
		}
		public Method getMethod() {
			return method;
		}
		public JavaClass getClazz() {
			return clazz;
		}
		public boolean equals(Object o) {
			if (!(o instanceof Node)) return false;
			Node n = (Node)o;
			return (position == n.position) && method.equals(n.method) && clazz.equals(n.clazz);
		}
		public int hashCode() {
			return position + method.hashCode() + clazz.hashCode();
		}
		public String toString() {
			return clazz.getClassName() + "." + method.getName() + method.getSignature() + ": " + position;
		}
	}
	public void addNode(int p, Method m, JavaClass c) {
		addNode(new Node(p, m, c));
	}
	private void addNode(Node n) {
		nodes.add(n);
		Set<Node> nbrs = edges.get(n);
		if (nbrs == null) {
			nbrs = new HashSet<Node>();
			edges.put(n, nbrs);
		}
	}
	public void addEdge(int p1, Method m1, JavaClass c1, int p2, Method m2, JavaClass c2) {
		Node n1 = new Node(p1, m1, c1);
		Node n2 = new Node(p2, m2, c2);
		addNode(n1);
		addNode(n2);
		Set<Node> nbrs = edges.get(n1);
		nbrs.add(n2);
		edges.put(n1, nbrs);
	}
	public void addEdge(int p1, int p2, Method m, JavaClass c) {
		addEdge(p1, m, c, p2, m, c);
	}
	public String toString() {
		return nodes.size() + " nodes\n" + "nodes: " + nodes + "\n" + "edges: " + edges;
	}
	public boolean isReachable(String methodFrom, String clazzFrom, String methodTo, String clazzTo) {
		Set<Method> methSet = new HashSet<Method>();
		Set<JavaClass> classSet = new HashSet<JavaClass>();
		
		Method init;
		for(Node n: nodes){
				methSet.add(n.getMethod());
				classSet.add(n.getClazz());
		}
		
//		System.out.println(methSet.toString());
//		System.out.println(classSet.toString());
//		System.out.println(getClass(classSet, clazzFrom).getClassName());
		
		Node start = new Node(0, getMeth(methSet, methodFrom), getClass(classSet, clazzFrom));
		Node end = new Node(0, getMeth(methSet, methodTo), getClass(classSet, clazzTo));
		ArrayList<Method> calls = new ArrayList<Method>();
		calls.add(start.method);
		return startRecursion(start, calls, end);
	}
	
	private boolean startRecursion(Node start, ArrayList<Method> calls, Node end){
		if(edges.get(start).contains(end)) return true;	//base case
		
		ArrayList<Boolean> bools = new ArrayList<Boolean>();
		
		if(start.position==-1){//go back to the method that called you
			for(Node n: edges.get(start)){
				if(n.method.equals(calls.get(calls.size()-1))){
					calls.remove(calls.size()-1);
					bools.add(startRecursion(n, calls, end));
				}
			}
			return bools.contains(true);
		}else if(edges.get(start).isEmpty()){
			return false;
		}else{
			for(Node n: edges.get(start)){
				if(start.method!=n.method){//add previous method to call stack so that we no where to return after next method is done
					calls.add(start.method);
				}
				bools.add(startRecursion(n, calls, end));
			}
			return bools.contains(true);
		}
	}
	
	private JavaClass getClass(Set<JavaClass> classSet, String clazzFrom) {
		for(JavaClass c: classSet){
			if(c.getClassName().contains(clazzFrom)){
				return c;
			}
		}
		return null;
	}
	public Method getMeth(Set<Method> s, String method){
		for(Method m: s){
			if(m.getName().contains(method)){
				return m;
			}
		}
		return null;
	}
	
	public void print(){
		System.out.println("CFG:");
		for(Node n: this.nodes){
			System.out.println("\tNode in Method: "+n.getMethod().toString());
			System.out.println("\t\t"+"Position: "+n.position);
			System.out.println("\tEdges:");
			System.out.println("\t\t"+edges.get(n)+"\n");
		}
	}
}