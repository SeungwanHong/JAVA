/**
인터페이스 네이밍 규칙
I인터페이스명(대문자 "I" + 인터페이스명)
인터페이스 명은 약속의 이름의 의미로 네이밍 한다.

인터페이스는 기능에 대하 약속을 할때 사용한다.
상속은 클래스를 구성할때 사용한다.

 * 
 */
package example1.interfaces;

/**
 * @author bituser
 *
 */
public interface IExampleA {

	//(1)추상 매소드만 작성 된다.
	void foo();			//추상 메소드다.
	
	//(2)구현된 형태의 메소드는 static 형태의 매소드 밖에 올수 없다.
	//어떤 조건에서 사용되는가?
	static void goo(){
		System.out.println("IExample interface A");
	}
	
	//(3)맴버변수 형태의 변수도 올 수 없다.
	int a = 10;			//암시적으로 public static final이 붙어 있다.(상수이다.)
	
}
