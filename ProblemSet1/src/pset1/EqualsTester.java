package pset1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * According to the contract for java.lang.Object any correct Java program must
 * satisfy certain properties with respect to the equals methods; these
 * properties include1: P1: For any non-null reference value x, x.equals(null)
 * should return false; P2: It is reflexive: for any non-null reference value x,
 * x.equals(x) should return true; P3: It is symmetric: for any non-null
 * reference values x and y, x.equals(y) should return true if and only if
 * y.equals(x) returns true; and P4: It is transitive: for any non-null
 * reference values x, y, and z, if x.equals(y) returns true and y.equals(z)
 * returns true, then x.equals(z) should return true; You are to implement a
 * test suite that checks three of the four properties, namely, P1, P2, and P3
 * , with respect to the equals methods implemented in the three classes
 * pset1.C, pset1.D, and java.lang.Object. Specifically, implement test methods
 * in the following class EqualsTester such that: (1) each test method has
 * exactly one invocation of assertTrue(...) or assertFalse(...); (2) each
 * property is tested with respect to each of the three equals methods, e.g.,
 * the test suite must have three test methods for P1; (3) each property is
 * tested with respect to each combination of the three object types (C, D, or
 * Object) for the inputs to equals, e.g., the test suite must have at least
 * nine tests for P3:
 * 
 * @author conangammel
 *
 */
public class EqualsTester {
	/*
	 * P1: For any non-null reference value x, x.equals(null) should return
	 * false.
	 */
	// your test methods for P1 go here
	/*
	 * P2: It is reflexive: for any non-null reference value x, x.equals(x)
	 * should return true.
	 */
	// your test methods for P2 go here
	/*
	 * P3: It is symmetric: for any non-null reference values x and y,
	 * x.equals(y) should return true if and only if y.equals(x) returns true.
	 */
	// your test methods for P3 go here
	/*
	 * P4: It is transitive: for any non-null reference values x, y, and z, if
	 * x.equals(y) returns true and y.equals(z) returns true, then x.equals(z)
	 * should return true.
	 */
	// you do not need to write tests for P4
	
//*********************************tests****************************
	
	
	@Test
	public void CconsistencyTest(){
		C c = new C(9);
		for(int i=0; i<100; i++){
			assertTrue(c.equals(c));
		}
	}
	
	@Test
	public void DconsistencyTest(){
		D d = new D(9,8);
		for(int i=0; i<100; i++){
			assertTrue(d.equals(d));
		}
	}
	
	@Test
	public void OconsistencyTest(){
		Object o = new Object();
		for(int i=0; i<100; i++){
			assertTrue(o.equals(o));
		}
	}
	
	//*******P1 NullTests*************
	
	@Test
	public void Object_nullTest() {
		assertFalse(new Object().equals(null));
	}
	
	@Test
	public void C_nullTest(){
		C c = new C(3);
		assertFalse(c.equals(null));
	}
	
	@Test
	public void D_nullTest(){
		D d = new D(3,4);
		assertFalse(d.equals(null));
	}
	
	//*********P2 ReflexiveTests*********
	@Test
	public void Object_ReflexiveTest(){
		Object o = new Object();
		assertTrue(o.equals(o));
	}
	
	@Test
	public void C_reflexiveTest(){
		C c = new C(3);
		assertTrue(c.equals(c));
	}
	
	@Test
	public void D_reflexiveTest(){
		D d = new D(3,4);
		assertTrue(d.equals(d));
	}
	
	//***********P3 SymmetricTests*********
	
	@Test
	public void CC_SymmetricTest1(){
		C c = new C(3);
		C c2 = new C(3);
		assertTrue(c.equals(c2) && c2.equals(c));
	}
	
	@Test
	public void CC_SymmetricTest2(){
		C c = new C(3);
		C c2 = new C(4);
		assertFalse(c.equals(c2) && c2.equals(c));
	}
	
	@Test
	public void DD_SymmetricTest1(){
		D d = new D(3,4);
		D d2 = new D(3,4);
		assertTrue(d.equals(d2) && d2.equals(d));
	}
	
	@Test
	public void DD_SymmetricTest2(){
		D d = new D(4,5);
		D d2 = new D(4,4);
		assertFalse(d.equals(d2) && d2.equals(d));
	}
	
	@Test
	public void OO_SymmetricTest1(){
		Object o = new Boolean(true);
		Object o2 = new Boolean(true);
		assertTrue(o.equals(o2) && o2.equals(o));
	}
	
//combos
	
	@Test
	public void CD_SymmetricTest1(){
		C c = new C(3);
		D d = new D(4,4);
		assertFalse(c.equals(d));
	}
	
	@Test
	public void CD_SymmetricTest2(){
		C c = new C(3);
		D d = new D(3,4);
		assertFalse(d.equals(c));
	}
	
	@Test
	public void CO_SymmetricTest1(){
		C c = new C(3);
		Object o = new Object();
		assertFalse(c.equals(o));
	}
	
	@Test
	public void CO_SymmetricTest2(){
		C c = new C(3);
		Object o = new Object();
		assertFalse(o.equals(c));
	}
	
	@Test
	public void DO_SymmetricTest1(){
		Object o = new Object();
		D d = new D(3,4);
		assertFalse(o.equals(d));
	}
	
	@Test
	public void DO_SymmetricTest2(){
		Object o = new Object();
		D d = new D(3,4);
		assertFalse(d.equals(o));
	}
	
//*********P3 Transitive******************
	//dont have to do this one
	
	
}