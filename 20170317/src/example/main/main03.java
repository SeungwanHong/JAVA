package example.main;

import example.generic.classes.generic.Apple;
import example.generic.classes.generic.Mygeneric;
import example.generic.classes.generic.Orange;

public class main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//객체를 만들때 동적으로 < >의 클래스를 같이 생성한다.
		Mygeneric<Apple, Orange> myGeneric = new Mygeneric<>(new Apple(), new Orange());
		
		//타입의 일반화
		myGeneric.setT(new Apple());
		myGeneric.setU(new Orange());
		myGeneric.<String>foo("hello");
		
		System.out.println(myGeneric.foo(new Apple()));
		
		System.out.println(myGeneric.<Integer>foo(123));
	}

}
