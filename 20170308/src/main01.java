/**
객체와 클래스
패키지
사용하고자 하는 클래스의 패키지가 다를 겨웅에는 import를 이용하여 클래스를 사용 가능하게 해야 한다.
 * 
 */
import  example_class.Person;
/**
 * @author bit
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		//new 키워드를 이용하여 클래스를 인스턴스화 한다.
		//인스턴스화 한 순간 heap 메모리에 객체를 위한 메모리 공각이 할당되고
		//메모리 주소값을 발생 시킨다.
		Person p1 = new Person();
		//heap 메모리 주소값 출력
		System.out.println(p1);
		// (.) 접근 연산자
		p1.age = 10;
		p1.name = "이름";
		p1.job = "직업";
		p1.printPersonInfo();
		
		p1.changePersonAge(20);
		String p1Name = p1.getPersonName();
		String p1Job = p1.changePersonJob("B");
		p1.printPersonInfo();
		
	}

}
