import Example.B;

public class main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		B b1 = new B();
		b1.m_num++;
		b1.S_num++;
		
		System.out.println(b1.m_num);
		System.out.println(b1.S_num);
		
		B b2 = new B();
		b2.m_num++;
		b2.S_num++;
		
		System.out.println(b1.m_num);
		System.out.println(b1.S_num);
		
		//B.S_num++;
		System.out.println(b1.S_num);		
		
		b1.foo();					//일반 맴버 매소드는 참조변수를 이용하여 호출
									//why? 객체가 만들어 져야만 사용 가능한 상태가 되기 때문이다.
		B.goo();					//정적 메소드는 프로그램이 시작할 때 이미 사용 가능한 상태
									//따라서 참조 변수가 필요없다.(정적 변수도 마찬가지)
		
	}

}
