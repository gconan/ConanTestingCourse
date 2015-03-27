package pset3.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import pset3.CFG;
import pset3.GraphGenerator;

public class TestReachabilityOnZ {
		
	@Test
	public void testB_D() throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		CFG d = gg.createCFGWithMethodInvocation("pset3.test.Z");
		assertTrue(d.isReachable("B", "pset3.test.Z", "D", "pset3.test.Z"));
	}
	@Test
	public void testMain_D() throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		CFG d = gg.createCFGWithMethodInvocation("pset3.test.Z");
		assertTrue(d.isReachable("main", "pset3.test.Z", "D", "pset3.test.Z"));
	}
	@Test
	public void testA_B() throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		CFG d = gg.createCFGWithMethodInvocation("pset3.test.Z");
		assertFalse(d.isReachable("A", "pset3.test.Z", "B", "pset3.test.Z"));
	}
	@Test
	public void testD_Main() throws ClassNotFoundException {
		GraphGenerator gg = new GraphGenerator();
		CFG d = gg.createCFGWithMethodInvocation("pset3.test.Z");
		assertFalse(d.isReachable("D", "pset3.test.Z", "main", "pset3.test.Z"));
	}
	
	/**
	 * doesnt work, idk how to get the method to allow more than one class
	 */
//	@Test
//	public void testClassZmain_Yfoo() throws ClassNotFoundException {
//		assertTrue(d.isReachable("main", "pset3.test.Z", "foo", "pset3.test.Y"));
//	}

}
