package example_class;

public class Base {
	protected int num;		//자식 클래스 및 같은 패키지에 있는 클래스들에게만 공개
	
	public void foo(){
		System.out.println("A.foo() 호출");
	}

}
