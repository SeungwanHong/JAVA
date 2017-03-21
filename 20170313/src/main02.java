

import example_class.A;
import example_class.Person;

public class main02 {

	public static void main(String[] args){
		//1) toString
		//일반적으로는 맴버변수의 내용을 출력하는데 사용하게 된다.
		//2) equals
		//
		A a1 = new A(10);
		A a2 = new A(10);
		
		String str = a1.toString();
			
		System.out.println(a1);
		System.out.println(str);
	
		//A == B => A와 B가 같냐? => A값과B값이 같은가?
		if(a1 == a2)	{
			System.out.println("a1과 a2가 같다.");
		}
		else{
			System.out.println("a1과 a2가 다르다.");
		}
		
		//Person
		
		Person p1 = new Person("A", 25, "0313");
		Person p2 = new Person("A", 25, "0313");
		
		
		if(p1 == p2)	{
			System.out.println("같은 사람.");
		}
		else{
			System.out.println("다른사람.");
		}
		
		//Object 클래스의 equals 사용
		//p1을 기준으로 p2를 비교하겠다.
		//p2.equals(p1) => p2를 기준으로 p1을 비교하겠다.
		if(p1.equals(p2))	{
			System.out.println("같은 사람.");
		}
		else{
			System.out.println("다른사람.");
		}
	}
	
}
