package pset5;

import static org.junit.Assert.*;

import java.util.HashSet;
import java.util.TreeSet;
import java.util.Set;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GraphTester {
    // tests for method "addEdge" in class "Graph"
    @Test public void tae0() {
        Graph g = new Graph();
        g.addEdge(0, 1);
        //g.printGraph();
        assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
    }
    // your tests for method "addEdge" in class "Graph" go here
    // you must provide at least 4 sources methods;
    // each sources method must have at least 1 invocation of addEdge;
    // each sources method must have at least 1 sources assertion;
    // your sources methods must provide full statement coverage of your
    //   implementation of addEdge and any helper methods
    // no sources method directly invokes any method that is not
    //   declared in the Graph class as given in this homework
    // tests for method "reachable" in class "Graph"
    
    @Test
    public void tae1(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(2, 3);
    	assertEquals(g.toString(), "nodes: [0, 1, 2, 3]\nedges: {0=[1], 1=[2], 2=[3]}");
    }
    
    @Test
    public void tae2(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 3);
    	g.addEdge(2, 3);
    	assertEquals(g.toString(), "nodes: [0, 1, 2, 3]\nedges: {0=[1], 1=[2, 3], 2=[3]}");
    }
    
    @Test
    public void tae3(){
    	Graph g = new Graph();
    	for(int i=1; i<100; i++){
    		g.addEdge(0, 1);
    	}
    	assertEquals(g.toString(), "nodes: [0, 1]\nedges: {0=[1]}");
    }
    
    
    
    
    
    @Test public void tr0() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer> nodes = new TreeSet<Integer>();
        nodes.add(0);
        assertTrue(g.reachable(nodes, nodes));
    }
    // your tests for method "reachable" in class "Graph" go here
    // you must provide at least 6 sources methods;
    // each sources method must have at least 1 invocation of reachable;
    // each sources method must have at least 1 sources assertion;
    // at least 2 sources methods must have at least 1 invocation of addEdge;
    // your sources methods must provide full statement coverage of your
	// implementation of reachable and any helper methods
	// no sources method directly invokes any method that is not
	// declared in the Graph class as given in this homework
    
    @Test(expected=IllegalArgumentException.class)
    public void tr1() {
        Graph g = new Graph();
        Set<Integer>empty = null;
        g.reachable(empty, empty);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void tr2() {
        Graph g = new Graph();
        Set<Integer>empty = null;
        Set<Integer>empty2 = new TreeSet<Integer>();
        g.reachable(empty2, empty);
    }
    
    @Test
    public void test_noEdges(){
    	Graph g = new Graph();
		g.addNode(0);
		g.addNode(1);
		g.addNode(2);
		g.addNode(3);
		Set<Integer>sources = new TreeSet<Integer>();
        sources.add(0);
        sources.add(1);
        sources.add(2);
        
        Set<Integer>targets = new TreeSet<Integer>();
        targets.add(3);
    	
        assertFalse(g.reachable(sources, targets));
    	
    }
    
    @Test
    public void tr1_5() {
        Graph g = new Graph();
        Set<Integer>empty = new TreeSet<Integer>();
        assertTrue(g.reachable(empty, empty));
    }
    
    @Test
    public void tr2_5() {
        Graph g = new Graph();
        g.addNode(0);
        Set<Integer>sources = new TreeSet<Integer>();
        sources.add(0);
        Set<Integer>empty_targets = new TreeSet<Integer>();
        assertTrue(g.reachable(sources, empty_targets));
    }
    
    @Test
    public void tr2_55() {
        Graph g = new Graph();
        Set<Integer>sources = new TreeSet<Integer>();
        sources.add(0);
        Set<Integer>empty_targets = new TreeSet<Integer>();
        assertFalse(g.reachable(sources, empty_targets));
    }
    
    @Test
    public void tr1_55() {
        Graph g = new Graph();
        Set<Integer>sources = new TreeSet<Integer>();
        Set<Integer>targets = new TreeSet<Integer>();
        targets.add(0);
        assertFalse(g.reachable(sources, targets));
    }
    
    
    
    @Test
    public void tr3(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	Set<Integer>sources = new HashSet<Integer>();
    	sources.add(0);
    	sources.add(1);
    	sources.add(2);
    	assertFalse(g.reachable(sources, sources));
    }
    
    @Test
    public void tr4(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	sources.add(1);
    	targets.add(0);
    	targets.add(1);
    	targets.add(2);
    	assertFalse(g.reachable(sources, targets));
    }
    
    @Test
    public void tr5(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	sources.add(1);
    	targets.add(0);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void tr6(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(1);
    	targets.add(0);
    	assertFalse(g.reachable(sources, targets));
    }
    
    @Test
    public void tr7(){
    	Graph g = new Graph();
    	g.addNode(1);
    	g.addNode(0);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(1);
    	targets.add(0);
    	assertFalse(g.reachable(sources, targets));
    }
    
    @Test
    public void tr8(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	targets.add(2);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void tr9(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(2, 5);
    	g.addNode(3);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	targets.add(3);
    	assertFalse(g.reachable(sources, targets));
    	
    }
    
    @Test
    public void tr10(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(5, 6);
    	g.addEdge(6, 7);
    	g.addEdge(7, 8);
    	g.addEdge(7, 9);
    	g.addEdge(7, 10);
    	g.addEdge(9, 11);
    	g.addEdge(10, 11);
    	
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	targets.add(8);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void tr11(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(5, 6);
    	g.addEdge(6, 7);
    	g.addEdge(7, 8);
    	g.addEdge(7, 9);
    	g.addEdge(7, 10);
    	g.addEdge(9, 11);
    	g.addEdge(10, 11);
    	
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(0);
    	targets.add(11);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void tr12(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(5, 6);
    	g.addEdge(6, 7);
    	g.addEdge(7, 8);
    	g.addEdge(7, 9);
    	g.addEdge(7, 10);
    	g.addEdge(9, 11);
    	g.addEdge(10, 11);
    	
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	sources.add(4);
    	targets.add(2);
    	assertFalse(g.reachable(sources, targets));
    }
    
    @Test
    public void tr13(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(5, 6);
    	g.addEdge(6, 7);
    	g.addEdge(7, 8);
    	g.addEdge(7, 9);
    	g.addEdge(7, 10);
    	g.addEdge(9, 11);
    	g.addEdge(10, 11);
    	
    	Set<Integer>sources = new HashSet<Integer>();
    	sources.add(0);
    	
    	Set<Integer>targets = new HashSet<Integer>();
    	targets.add(2);
    	targets.add(3);
    	targets.add(4);
    	targets.add(5);
    	targets.add(6);
    	targets.add(7);
    	targets.add(8);
    	targets.add(9);
    	targets.add(10);
    	targets.add(11);
    	
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void tr14(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(1, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(5, 6);
    	g.addEdge(6, 7);
    	g.addEdge(7, 8);
    	g.addEdge(7, 9);
    	g.addEdge(7, 10);
    	g.addEdge(9, 11);
    	g.addEdge(10, 11);
    	
    	Set<Integer>sources = new HashSet<Integer>();
    	sources.add(2);
    	sources.add(3);
    	sources.add(4);
    	sources.add(5);
    	sources.add(6);
    	sources.add(7);
    	sources.add(8);
    	sources.add(9);
    	sources.add(10);
    	sources.add(11);
    	Set<Integer>targets = new HashSet<Integer>();
    	targets.add(1);
    	
    	assertFalse(g.reachable(sources, targets));
    }
    
    @Test
    public void testCycle(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(2, 1);
    	g.addEdge(3, 4);
    	g.addEdge(1, 3);
    	g.addEdge(4, 5);
    	g.addEdge(3, 5);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	
    	sources.add(0);
    	targets.add(4);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void testCycle2(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 2);
    	g.addEdge(2, 1);
    	g.addEdge(0, 0);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	
    	sources.add(0);
    	targets.add(2);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void testCycle3(){
    	Graph g = new Graph();
    	g.addEdge(1, 2);
    	g.addEdge(2, 3);
    	g.addEdge(2, 4);
    	g.addEdge(4, 1);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	
    	sources.add(4);
    	targets.add(3);
    	assertTrue(g.reachable(sources, targets));
    }
    
    @Test
    public void testCycle4(){
    	Graph g = new Graph();
    	g.addEdge(0, 1);
    	g.addEdge(1, 0);
    	g.addEdge(1, 1);
    	g.addEdge(0, 0);
    	g.addNode(2);
    	Set<Integer>sources = new HashSet<Integer>();
    	Set<Integer>targets = new HashSet<Integer>();
    	
    	sources.add(0);
    	targets.add(2);
    	assertFalse(g.reachable(sources, targets));
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}


