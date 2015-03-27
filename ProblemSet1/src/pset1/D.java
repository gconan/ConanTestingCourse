package pset1;

public class D extends C {
	int g;

	public D(int f, int g) {
		super(f);
		this.g = g;
	}

	
//**********************************EQUALS METHODS (USED FOR TESTING MY TESTS********************	

	/** 
	 * Eclipse's Equals method
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!super.equals(obj)) {
			return false;
		}
		if (!(obj instanceof D)) {
			return false;
		}
		D other = (D) obj;
		if (g != other.g) {
			return false;
		}
		return true;
	}
	
	/**
	 * a correct implementation
	 */
//	@Override
//	public boolean equals(Object o) {
//		// assume this method is implemented for you
//		if(o instanceof D){
//			return ((this.f == ((D)o).f) && (this.g==((D)o).g));
//		}else{
//			return false;
//		}
//	}
	
	/**
	 * incorrect implementation
	 */
//	@Override
//	public boolean equals(Object o) {
//		return false;
//	}
	
	
//**********************************HASH CODE METHODS (USED FOR TESTING MY TESTS********************	
	
	/** 
	 * Eclipse's HashCode method
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + g;
		return result;
	}
	
	/**
	 * a correct implementation
	 */
//	@Override
//	public int hashCode() {
//		int code = 0;
//		code = this.f * 31 + 'D' * 31 + this.g * 97;
//		return code;
//		// assume this method is implemented for you
//	}

	/**
	 * incorrect implementation
	 */
//	@Override
//	public int hashCode() {
//		return f;
//		// assume this method is implemented for you
//	}
}