

import example_class.A;
import example_class.Person;

public class main02 {

	public static void main(String[] args){
		//1) toString
		//�Ϲ������δ� �ɹ������� ������ ����ϴµ� ����ϰ� �ȴ�.
		//2) equals
		//
		A a1 = new A(10);
		A a2 = new A(10);
		
		String str = a1.toString();
			
		System.out.println(a1);
		System.out.println(str);
	
		//A == B => A�� B�� ����? => A����B���� ������?
		if(a1 == a2)	{
			System.out.println("a1�� a2�� ����.");
		}
		else{
			System.out.println("a1�� a2�� �ٸ���.");
		}
		
		//Person
		
		Person p1 = new Person("A", 25, "0313");
		Person p2 = new Person("A", 25, "0313");
		
		
		if(p1 == p2)	{
			System.out.println("���� ���.");
		}
		else{
			System.out.println("�ٸ����.");
		}
		
		//Object Ŭ������ equals ���
		//p1�� �������� p2�� ���ϰڴ�.
		//p2.equals(p1) => p2�� �������� p1�� ���ϰڴ�.
		if(p1.equals(p2))	{
			System.out.println("���� ���.");
		}
		else{
			System.out.println("�ٸ����.");
		}
	}
	
}
