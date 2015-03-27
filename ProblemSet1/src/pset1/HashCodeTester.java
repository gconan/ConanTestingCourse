package pset1;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * The contract for java.lang.Object additionally requires the following
 * property that relates equals and hashCode1 : P5 : If two objects are equal
 * according to the equals(Object) method, then calling the hashCode method on
 * each of the two objects must produce the same integer result. Implement test
 * methods in the following class HashCodeTester such that: (1) each test method
 * has exactly one invocation of assertTrue(...) or assertFalse(...); (2) the
 * property is tested with respect to each combination of the three object types
 * (C, D, or Object) for the inputs to equals, so the test suite must have at
 * least nine tests:
 * 
 * @author conangammel
 *
 * P5: If two objects are equal according to the equals(Object) method,
 * then calling the hashCode method on each of the two objects must
 * produce the same integer result. 
 */
public class HashCodeTester {
	// your test methods go here TODO 2.2
	
	@Test
	public void CHashCodeconsistentcyTest(){
		C c = new C(9);
		for (int i=0; i<100; i++){
			assertTrue(c.hashCode()==c.hashCode());
		}
	}
	
	//TODO
	@Test
	public void testThatifCEqualThenHashCode(){
		C c = new C(9);
		C c2 = new C(9);
		if(c.equals(c2)){
			assertTrue(c.hashCode() == c2.hashCode());
		}
		//dont want to fail, this is not checking equals method
	}
	
	@Test
	public void DHashCodeconsistentcyTest(){
		D d = new D(9,8);
		for (int i=0; i<10; i++){
			assertTrue(d.hashCode() == d.hashCode());
		}
	}
	
	@Test
	public void testThatifDEqualThenHashCode(){
		D d = new D(9,8);
		D d2 = new D(9,8);
		if(d.equals(d2)){
			assertTrue(d.hashCode() == d2.hashCode());
		}
		//dont want to fail, this is not checking equals method
	}
	
	@Test
	public void C_D_ObjectHashCodeNotEqualTest(){
		C cOb = new C(3);
		D dOb = new D(3, 4);
		assertFalse(cOb.hashCode() == dOb.hashCode());
	}
	
	//TODO
	@Test
	public void twoSameCObjectsHashCodesAreEqual(){
		C cOb = new C(3);
		C cOb2 = new C(3);
		assertTrue(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void twoDifferentCObjectsHashCodeTest(){
		C cOb = new C(4);
		C cOb2 = new C(3);
		assertFalse(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void twoSameDObjectsHashCodesAreEqual(){
		D cOb = new D(3,4);
		D cOb2 = new D(3,4);
		assertTrue(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void twoDifferentDObjectsHashCodeTest(){
		D cOb = new D(4,3);
		D cOb2 = new D(3,4);
		assertFalse(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void twoSameObjectsHashCodesAreEqual(){
		Object o = new Object();
		assertTrue(o.hashCode() == o.hashCode());
	}
	
	@Test
	public void twoDifferentObjectsHashCodeTest(){
		Object o = new Object();
		Object o2 = new Object();
		assertFalse(o.hashCode() == o2.hashCode());
	}
	
	@Test
	public void CDCDInheritanceHashCodeTest(){
		C cOb = new D(4,3);
		C cOb2 = new D(4,3);
		assertTrue(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void CDCDInheritanceHashCodeTest2(){
		C cOb = new D(4,5);
		C cOb2 = new D(4,3);
		assertFalse(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void CCCDInheritanceHashCodeTest(){
		C cOb = new C(4);
		C cOb2 = new D(4,3);
		assertFalse(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void CCCDInheritanceHashCodeTest2(){
		C cOb = new C(5);
		C cOb2 = new D(4,3);
		assertFalse(cOb.hashCode() == cOb2.hashCode());
	}
	
	@Test
	public void CDHashCodeTest(){
		C c = new C(5);
		D d = new D(4,3);
		assertFalse(c.hashCode() == d.hashCode());
	}
	
	@Test
	public void DCHashCodeTest(){
		C c = new C(5);
		D d = new D(4,3);
		assertFalse(d.hashCode() == c.hashCode());
	}
	
	@Test
	public void COHashCodeTest(){
		C c = new C(5);
		Object o = new Object();
		assertFalse(c.hashCode() == o.hashCode());
	}
	
	@Test
	public void OCHashCodeTest(){
		C c = new C(5);
		Object o = new Object();
		assertFalse(o.hashCode() == c.hashCode());
	}
	
	@Test
	public void DOHashCodeTest(){
		D c = new D(5,9);
		Object o = new Object();
		assertFalse(c.hashCode() == o.hashCode());
	}
	
	@Test
	public void ODHashCodeTest(){
		D d = new D(5,5);
		Object o = new Object();
		assertFalse(o.hashCode() == d.hashCode());
	}
	
//*************************************************Equals tests, but with hashcode equals too*********************************************
	@Test
	public void CC_SymmetricTest1(){
		C c = new C(3);
		C c2 = new C(3);
		if(c.equals(c2) && c2.equals(c)){
			assertTrue(c.hashCode()==c2.hashCode());
		}else{
			fail("not equal, didnt check hash code");
		}
	}
	
	@Test
	public void DD_SymmetricTest1(){
		D d = new D(3,4);
		D d2 = new D(3,4);
		if(d.equals(d2) && d2.equals(d)){
			assertTrue(d.hashCode() == d2.hashCode());
		}else{
			fail("not equal, didnt check hash code");
		}
		
	}
	
	@Test
	public void OO_SymmetricTest1(){
		Object o = new C(3);
		Object o2 = new C(3);
		if(o.equals(o2) && o2.equals(o)){
			assertTrue(o.hashCode() == o2.hashCode());
		}else{
			fail("not equal, didnt check hash code");
		}
		
	}
}