package example.generic.classes.generic;

public class Mygeneric <T,U>{

	private T t;
	private U u;
	
	public Mygeneric(T t, U u){
		this.t = t;
		this.u = u;
	}
	public T getT() {
		return t;
	}


	public U getU() {
		return u;
	}


	public void setT(T t) {
		this.t = t;
	}


	public void setU(U u) {
		this.u = u;
	}

	public <K> K foo(K k){
		return k;
	}

	@Override
	public String toString() {
		return t.toString() + " " + u.toString();
	}

	

}
