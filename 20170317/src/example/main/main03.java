package example.main;

import example.generic.classes.generic.Apple;
import example.generic.classes.generic.Mygeneric;
import example.generic.classes.generic.Orange;

public class main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//��ü�� ���鶧 �������� < >�� Ŭ������ ���� �����Ѵ�.
		Mygeneric<Apple, Orange> myGeneric = new Mygeneric<>(new Apple(), new Orange());
		
		//Ÿ���� �Ϲ�ȭ
		myGeneric.setT(new Apple());
		myGeneric.setU(new Orange());
		myGeneric.<String>foo("hello");
		
		System.out.println(myGeneric.foo(new Apple()));
		
		System.out.println(myGeneric.<Integer>foo(123));
	}

}
