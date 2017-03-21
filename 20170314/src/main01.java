import example1.classes.ExampleA;
import example1.interfaces.IExampleA;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ExampleA a = new ExampleA();
		
		a.foo();
		a.koo();
		IExampleA.goo();
	}

}


/*
인터페이스

클래스가 아니다.
(엄격히 따지면 추상클래스에 추상 매소드만 있는 형태이다.)
다중상속
클래스보다 가벼움



객체지향 프로그램을 하다보면 어쩔 수 없는 상황이 있다.
자바의 언어의 특징상 어쩔 수 없는 부분이 있다.

파이썬은
객체, 절차, 함수 지향 프로그래밍 짬뽕 해놨음

상속을 줄이겠다.

절차 지향 방식
메인에 함수 처리해서 프로그래밍을 하겠다.
ex) 건물을 지을때 
바닥을 만들고 -> 벽을 세우고 -> 문구멍을 나둔다. -> 문을 만들어 넣는다(문을 위에서부터 순차적으로)
그러면, 단점은
유지보수가 힘들다. => 한쪽벽에 애러가 났다. 그걸 수정하고 나니 나머지 벽들도 애러가 날수도 있다.

객체지향 방식(인터페이스 X)
A사(host) - 우리가 건물을 만들테니.
B사(client) - 너네는 문을 만들어 와.
B사는 알고 A사는 모르는 내용
클래스명
매소드 명
ex) 경첩 위치가 달라.
A사가 격는 문제점
B가 완료 할때 까지 다음일을 못한다.
정확한 기능 사용 불가
객체지향 방식(인터페이스 O)
A사
B사
C사
인터페이스 - 이름 , 약속
*/