package Example;

public abstract class Duck {
	protected String kind;
	
	public Duck(String kind){
		this.kind = kind;
	}
	public abstract void sound();
	public void printKind(){
		System.out.println(this.kind);
	}

}
