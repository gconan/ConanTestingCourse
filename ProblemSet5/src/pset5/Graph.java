package pset5;

import java.util.HashSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Map;
import java.util.Set;
//CONANS CODE
public class Graph {
	private Set<Integer> nodes; // set of nodes in the graph
	private Map<Integer, TreeSet<Integer>> edges;
	// map between a node and a set of nodes that are connected to it by outgoing edges
	// class invariant: fields "nodes" and "edges" are non-null;
	//                  "this" graph has no node that is not in "nodes"
	
	/**Used this set for recursion to avoid cycles in graphs*/
	private Set<Integer> nodesTouched;
	public Graph() {
		nodes = new TreeSet<Integer>();
		edges = new TreeMap<Integer, TreeSet<Integer>>();
	}
	
	public String toString() {
		return "nodes: " + nodes + "\n" + "edges: " + edges;
	}
	
	public void addNode(int n) {
		// postcondition: adds the node "n" to this graph
		nodes.add(n);
	}
//	
//	public void printGraph(){
//		for(Integer node: nodes){
//			System.out.println("Node "+node+" has edges:");
//			for(Integer edgeNode: edges.get(node)){
//				System.out.println("\tto node "+edgeNode);
//			}
//			System.out.println();
//		}
//	}
	
	/**
	 * postcondition: adds a directed edge "from" -> "to" to this graph
	 */
	public void addEdge(int from, int to) {
		//add both nodes to the set (if they exist, then they are not duplicated)
		addNode(from);
		addNode(to);
		
		//if the tree set does not exist, create one
		if(edges.get(from)==null){
			edges.put(from, new TreeSet<Integer>());
		}
		//add "to" to the tree set of from, indicating an outgoing edge from "from" to "to"
		edges.get(from).add(to);
	}

	/**
	 *  postcondition: returns true if:
	 *   (1) "sources" is a subset of "nodes"
	 *   (2) "targets" is a subset of "nodes"
	 *   (3) for each node "m" in set "targets", there is some node "n" in set "sources" such that there is a
     *   		directed path that starts at "n" and ends at "m" in "this"; and false otherwise
     *     
	 * @param sources
	 * @param targets
	 * @return
	 * @throws IllegalArgumentException
	 */
	public boolean reachable(Set<Integer> sources, Set<Integer> targets) throws IllegalArgumentException{
		//null checks
		if(sources == null || targets == null) throw new IllegalArgumentException();
		
		//Subset checks
		if(!isSubSetOfNodes(sources) || !isSubSetOfNodes(targets)){
			return false;
		}
		
		//empty checks
		if(targets.isEmpty()){
			//if targets is empty, then regardless of whether sources is empty or not, 
			//return true since anything&nothing can reach empty set
			return true;
		}else if(sources.isEmpty()){
			//targets is not empty at this point, so if sources is empty, return false
			return false;
		}
		
		//kept logic simple here. For all targets, if it is not reachable by any of the sources, return false
		for(Integer target: targets){
			if(!isReachableBySet(sources, target)){
				return false;
			}
		}
		//if the loop terminates without returning, then return true since every target was reachable
		return true;
	}

	protected boolean isReachableBySet(Set<Integer> sources, int target) {
		for(Integer source: sources){
			//check if any of the sources can reach target
			this.nodesTouched = new HashSet<Integer>();
			if(recurrsiveReachable(source, target)){
				//if so, return true
				return true;
			}
		}
		//if none of the sources reach the target, return true
		return false;
	}
	
	private boolean recurrsiveReachable(int s, int t){
		if(s==t){
			//a node can reach itself
			return true;
		}
		if(edges.get(s)==null){
			//if the node has no outgoing edges, return false
			return false;
		}
		if(edges.get(s).contains(t)){
			//if the target is an immediate neighbor to the source, return true
			return true;
		}
		
		for(Integer nextSource: edges.get(s)){
			//depth first search style recursion, call this method with each immediate neighbor 
			//to see if they contain the target in their set of edges
			if(this.nodesTouched.contains(nextSource))return false;//already checked that node
			this.nodesTouched.add(nextSource);
			
			if(recurrsiveReachable(nextSource, t)){
				return true;
			}
		}
		return false;
	}

	protected boolean isSubSetOfNodes(Set<Integer> sources) {
		TreeSet<Integer> nodeCopy = new TreeSet<Integer>();
		nodeCopy.addAll(nodes);
		return !nodeCopy.addAll(sources);
	}
}

