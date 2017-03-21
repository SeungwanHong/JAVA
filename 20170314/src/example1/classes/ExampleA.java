/*
인터페이스 상속에는 개수에 제한이 없다

 */
package example1.classes;

import example1.interfaces.*;

public class ExampleA implements IExampleA, IExampleA2{

	@Override
	public void foo() {
		IExampleA.goo();
		System.out.println("ExampleA.foo()");
		
	}

	@Override
	public void koo() {
		System.out.println("ExampleA2.koo()");
		
	}

}
