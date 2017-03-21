package Example;

public class B {

	public int m_num;					//클래스가 생성될 때 생성이 됨(할당이 됨)
	public static int S_num;			//프로그램을 시작 할 때부터 이미 사용 가능 하게 됨.
											//즉 B 클래스가 객체가 되지 않아도 사용 할 수 있는 변수
	
	//정적 변수를 사용하는 예
	//연산 횟수 카운팅
	
	/*
	정적변수는 프로그램이 시작되면 메모리에 할당이된다.
	그리고 프로그램이 끝나면 할당이 해제된다.
	정적 변수는 <인스턴스.정적변수> 에서 워닝!!!
	 */
	public void foo(){
		System.out.println("맴버 매소드 foo() 호출");
		goo();
	}
	public static void goo(){
		System.out.println("정적 매소드 goo() 호출");
		//foo();
		//인스턴스화가 되어 있는지 알수 없기 때문에;
	}
	
	//정적 매소드 내부에서 일반 맴버 변수나 매소드를 사용 할 수있을까? X
	//일반 맴버 매소드에서 정적 매소드나 정적 변수를 사용할 수 있을까? O
}
