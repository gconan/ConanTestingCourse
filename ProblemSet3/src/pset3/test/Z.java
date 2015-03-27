package pset3.test;

public class Z {

	public static void main(String[] a){
		B(a);
		D();
		//Y.foo(a);
	}
	
	static void B(String[] b){
		A();
	}
	
	static void A(){
		D();
		return;
	}
	
	static void D(){
		return;
	}
	
}
