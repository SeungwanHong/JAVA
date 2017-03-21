package example.main;

public class main05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new B();
		A a2 = new C();
		
		B b1 = new B();
		
		//객체가 무엇으로 이루어져 있는지 판단하는 instanceof 연산자
		// A instanceof B => A객체가 B클래스로 이루어져 있는가?(=부를 수 있는가?)
		
		if (a1 instanceof B) {
			System.out.println("a1은  B클래스라고 부를수 있다.");
		}
		if(a2 instanceof C){
			System.out.println("a2은  C클래스라고 부를수 있다.");
		}
		if(b1 instanceof A){
			System.out.println("b1은  A클래스라고 부를수 있다.");
		}
	}

}

class A{	}
class B extends A{}
class C extends A{}
class D extends A{}