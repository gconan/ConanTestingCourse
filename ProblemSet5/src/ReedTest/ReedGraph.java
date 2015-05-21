package ReedTest;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class ReedGraph {
	private Set<Integer> nodes; // set of nodes in the graph
	private Map<Integer, TreeSet<Integer>> edges;
	// map between a node and a set of nodes that are connected to it by outgoing edges
	// class invariant: fields "nodes" and "edges" are non-null;
	//                  "this" graph has no node that is not in "nodes"
	public ReedGraph() {
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
	public void addEdge(int from, int to) {
		// postcondition: adds a directed edge "from" -> "to" to this graph
		// your code goes here
		//...
		if(!nodes.contains(from) || !nodes.contains(to)) 
			nodes.add(from);
			nodes.add(to);
		if(!edges.containsKey(from)){ //create a new TreeSet and add it to edges
			TreeSet<Integer> ts = new TreeSet<Integer>();
			ts.add(to);
			edges.put(from, ts);
			return;
		} else if(edges.get((Integer) from).contains((Integer) to)){ 
			return; //graph already contains the edge
		} else {
			edges.get(from).add(to); //add edge
			return;
		}
	}
public boolean reachable(Set<Integer> sources, Set<Integer> targets) throws IllegalArgumentException{
		
		if (sources == null || targets == null) throw new IllegalArgumentException();
		
		//Check for postconditions (1) & (2)
		if ( !nodes.containsAll(sources) || !nodes.containsAll(targets) )
			return false;
		
		if(sources.containsAll(targets))return true;
				
		//Will hold all nodes with edges leading directly to a target and then be
		//used to recursively backtrack through the graph to source nodes
		Set<Integer> heads = new TreeSet<Integer>(); 
		for( Integer n: targets )
		{
			if( n != null )
				heads.addAll(findSources(n));
		}
		
		if(!heads.isEmpty() && sources.containsAll(heads))
			return true;
		else
		{
			//Remove any values in "heads" found in "sources" 
			for(Integer m: heads )
			{
				if( !m.equals(null) )
					if( sources.contains(m) )
						heads.remove(m);
			}
			
			//Recursive call to Reachable with values left in "heads" as target set
			b= reachable( sources, heads );
		}
		return false;
	}
public Set<Integer> findSources( Integer target )
{
	if( !nodes.contains(target)) throw new IllegalArgumentException();
	if( target == null ) throw new IllegalArgumentException();

	Set<Integer> sources = new TreeSet<Integer>();
	//	Iterator<Integer> iNode = nodes.iterator();
	Iterator<Integer> iNode = nodes.iterator();


	while(iNode.hasNext())
		//	for(Iterator<Integer> i = nodes.iterator(); i.hasNext(); )
	{
		Integer n = (Integer) iNode.next();
		if( n != null && edges.containsKey(n) )
			if( edges.get(n).contains(target) /*&& n != null*/ )
				sources.add(n);
	}

	return sources;
}
	
}
