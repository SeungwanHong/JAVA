package example_class3;

public abstract class AA {
	
	private int n;
	
	//자식 클래스에서만 추상화 클래스의 생성자를 호출 할 수 있다.
	//일반적인 상속과 같이 자식클래스에서 생성자에 대한 책임을 저야 한다.
	public AA(int n){
		this.n = n;
	}
	//자식클래스에서 반드시 오버라이딩 해야한다.
	protected abstract void foo();
	
	//자식 클래스에서 필요시(선태적으로) 오버라이딩을 할 수 있다.
	protected void goo(){
		System.out.println("AA_goo()");
	}

}
