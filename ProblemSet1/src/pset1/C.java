package pset1;

public class C {
	int f;

	public C(int f) {
		this.f = f;
	}


//****************************equals*************************
	
	/** Eclipse generated
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof C)) {
			return false;
		}
		C other = (C) obj;
		if (f != other.f) {
			return false;
		}
		return true;
	}

	/**
	 * a correct implementation
	 * does not cover the case where Object o is of type D
	 */
//	@Override
//	public boolean equals(Object o) {
//		// assume this method is implemented for you
//		if(o instanceof C){
//			return (this.f == ((C)o).f);
//		}
//		return false;
//	}
	
	/**
	 * incorrect implementation
	 */
//	@Override
//	public boolean equals(Object o) {
//		return false;
//	}
	
//**********************hash codes************************
	
	/** Eclipse generated
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + f;
		return result;
	}
	
	/**
	 * a correct implementation
	 */
//	@Override
//	public int hashCode() {
//		int code = 0;
//		code = this.f * 31 + 'C'*31;
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