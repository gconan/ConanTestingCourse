package pset1;

import static org.junit.Assert.*;

import org.junit.Test;

import pset1.SLList.Node;

public class SLListAddTester {
	
	/**
	 * makes a list that looks like: {true, null}
	 * check that the header is not null (add correctly places new element at the beginning)
	 * check that the header's element is correct
	 * check that the one element points to null
	 */
	@Test
	public void test0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		
		Boolean nodeCondition = true;	//in case you want to check for false vs true
		
		l.add(nodeCondition);
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		assertTrue(l.header != null);
		// your code goes here
		
		//{nodeCondition->null}
		assertTrue(l.header.getClass() == Node.class);
		assertEquals(l.header.elem, nodeCondition);
		assertNull(l.header.next);
		assertTrue(l.repOk());//dont want to rely on another method for correctness
	}

	@Test
	public void test1() {
		SLList l = new SLList();
		assertTrue(l.repOk());
		l.add(true);
		assertTrue(l.repOk());
		l.add(false);
		assertTrue(l.repOk());
		// write a sequence of assertTrue method invocations that
		// perform checks on the values for all the declared fields
		// of list and node objects reachable from l
		//{false, true->null}
		assertTrue(l.header != null);
		
		//your code goes here
		assertTrue(l.header.getClass() == Node.class);
		assertTrue(l.header.next.getClass() == Node.class);
		assertTrue(l.repOk()); //dont want to rely on another method for correctness
		assertFalse(l.header.elem);
		assertNotNull(l.header.next);
		assertTrue(l.header.next.elem);
		assertNull(l.header.next.next);
	}
}
