

import example_class3.BB;

public class main03 {
	
	public static void main(String[] args) {
		
		//AA a1 = new AA(10);	//추상 클래스는 객체로 만들 수 없다.
		/*
		//익명 클래스 -> 람다식과 연관(함수지향 프로그래밍)
		AA a2 = new AA(10){
			
			@Override
			protected void foo(){
				System.out.println("Etse");
			}
			
		};*/
		BB b1 = new BB(10,20);
	}
}
