package example1.classes;

import example1.interfaces.IExampleA3;

//IExampleA3�� IExampleA,IExampleA2�� Ȯ���� �����̴�. 
//3���� �޼ҵ带 �� ��ӹ޾Ƽ� ���Ǹ� ������Ѵ�.
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
