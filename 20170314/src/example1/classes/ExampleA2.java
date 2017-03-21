package example1.classes;

import example1.interfaces.IExampleA3;

//IExampleA3가 IExampleA,IExampleA2를 확장한 형태이다. 
//3가지 메소드를 다 상속받아서 정의를 해줘야한다.
public class ExampleA2 implements IExampleA3{

	@Override
	public void foo() {
		// TODO Auto-generated method stub
		System.out.println("ExampleA.foo()");
	}

	@Override
	public void koo() {
		// TODO Auto-generated method stub
		System.out.println("ExampleA2.koo()");
	}

	@Override
	public void moo() {
		// TODO Auto-generated method stub
		System.out.println("ExampleA3.moo()");
	}

}
