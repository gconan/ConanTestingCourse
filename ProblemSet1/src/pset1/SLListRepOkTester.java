package pset1;

import static org.junit.Assert.*;
import org.junit.Test;
import pset1.SLList.Node;

/**
 * Consider testing the method repOk by writing a test suites that consists of
 * valid or invalid lists. Specifically, implement test methods in the following
 * class SLListRepOkTester such that: (1) each test allocates exactly one list
 * l; (2) each test method makes exactly one invocation l.repOk(); (3) each test
 * method invokes assertTrue(l.repOk()) or assertFalse(l.repOk()) as its last
 * statement; (4) no invocation of add is made in any test method; (5) the test
 * suite as a whole consists of all singly-linked list data structures , whether
 * acyclic or not , that can possibly be constructed using up to 2 nodes.
 * 
 * @author conangammel
 *
 */
public class SLListRepOkTester {
	@Test
	public void t0() {
		SLList l = new SLList();
		assertTrue(l.repOk());
	}
	
	/**
	 * {n1->null} rep  ok
	 */
	@Test
	public void t1_0() {
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		n.next = null;
		l.header = n;
		assertTrue(l.repOk());
	}
	
	/**
	 * {n1->n1} rep not ok
	 */
	@Test
	public void t1() {
		SLList l = new SLList();
		Node n = new Node();
		n.elem = true;
		n.next = n;
		l.header = n;
		assertFalse(l.repOk());
	}
	
	/**
	 * {n1->n2, n2->null} rep ok
	 */
	@Test
	public void t2(){
		Node one = new Node();
		Node two = new Node();
		one.elem = true;
		two.elem = false;
		one.next=two;
		two.next=null;
		SLList l = new SLList();
		l.header = one;
		assertTrue(l.repOk());
	}
	
	/**
	 * {n1->n2, n2->n1} rep not ok
	 */
	@Test
	public void t3(){
		Node one = new Node();
		Node two = new Node();
		one.elem = true;
		two.elem = false;
		one.next=two;
		two.next=one;
		SLList l = new SLList();
		l.header = one;
		assertFalse(l.repOk());
	}
	
	
	/**
	 * {n1->n2, n2->n3, n3->n4, n4->n2} rep not ok
	 */
	@Test
	public void t4(){
		Node one = new Node();
		Node two = new Node();
		Node three = new Node();
		Node four = new Node();
		one.elem = true;
		two.elem = false;
		three.elem = true;
		four.elem = false;
		one.next=two;
		two.next=three;
		three.next=four;
		four.next=two;
		
		SLList l = new SLList();
		l.header = one;
		assertFalse(l.repOk());
	}
	
	
	
	
	
}