package pset1;

import java.util.HashSet;
import java.util.Set;

public class SLList {
	Node header;

	static class Node {
		boolean elem;
		Node next;
	}

	boolean repOk() {
		// postcondition: returns true iff <this> is an acyclic list, i.e.,
		// there is no path from a node to itself
		Set<Node> visited = new HashSet<Node>();
		Node n = header;
		while (n != null) {
			if (!visited.add(n)) {
				return false;
			}
			n = n.next;
		}
		return true;
	}
	
	/**
	 * precondition: this.repOk()
	 * postcondition: adds <e> in a new node at the beginning of the
	 * list; the rest of the list is unmodified
	 * O(1)
	 * @param e
	 */
	void add(boolean e) {
		// your code goes here
			Node n = new Node();
			n.elem = e;
			n.next = this.header;
			this.header = n;
		
	}
}







