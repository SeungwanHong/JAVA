package example.main;

public class main05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a1 = new B();
		A a2 = new C();
		
		B b1 = new B();
		
		//��ü�� �������� �̷���� �ִ��� �Ǵ��ϴ� instanceof ������
		// A instanceof B => A��ü�� BŬ������ �̷���� �ִ°�?(=�θ� �� �ִ°�?)
		
		if (a1 instanceof B) {
			System.out.println("a1��  BŬ������� �θ��� �ִ�.");
		}
		if(a2 instanceof C){
			System.out.println("a2��  CŬ������� �θ��� �ִ�.");
		}
		if(b1 instanceof A){
			System.out.println("b1��  AŬ������� �θ��� �ִ�.");
		}
	}

}

class A{	}
class B extends A{}
class C extends A{}
class D extends A{}