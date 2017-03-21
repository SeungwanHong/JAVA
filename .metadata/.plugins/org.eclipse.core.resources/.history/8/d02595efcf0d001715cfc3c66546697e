/**

객체 설계 방법
 * 
 */
package example_class;

/**
 * @author bit
 *
 */
public class Person {
	//객체 설계 방법
	//(1)클래스를 만들 때는 항상 데이터부터
	// => 맴버변수 부터 만들자.
	public int age;
	public String name;
	public String job;
	
	//(2)기능에 대한 정의
	// => 메소드 정의
	
	//1 매개변수 x 리턴값 x
	public void printPersonInfo(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(job);
	}
	//2 매개변수 o 리턴값 x
	public void changePersonAge(int age){
		this.age = age;
		System.out.println("나이가 변경 되었습니다.");
	}
	//3 매개변수 x 리턴값 o
	public String getPersonName(){
		System.out.println("이름이 호출 되었습니다.");
		return name;
	}
	//4 매개변수o 리턴값 o
	public String changePersonJob(String job){
		this.job = job;
		System.out.println("직업이 변경 되었습니다.");
		return job;
	}
	

}
