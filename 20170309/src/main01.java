/**
 객체의 생성 및 소멸
  필드와 메소드
 */

/**
 * @author bituser
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setNum(10);
		a.printNum();
		
		a = new A();			//기존의 a 변수는 gabage collector의 대상이 되어 소멸 함, 그와 동시에 a에 새로운 객체 A를 할당하였
		a.printNum();
		
		A a1 = new A();
		
		a1.setNum(100);
		a1.printNum();
		
		//메모리 주소값에 대한 개념 중요!!!
		A a2 = a1;
		
		a2.setNum(200);
		a2.printNum();
		a1.printNum();
		
	}

}
//파일을 생성하기 귀찮으니 아래에 생성 하였음.
class A{
	private int num;
	
	
	public void setNum(int num){
		this.num = num;
	}
	public void printNum(){
		System.out.println("num : "+ num);
	}
	//지역변수 매개변수
	//매개변수의 사용 - 해당 메소드 까지
	public void foo(int a){
		//지역변수 사용 - 해당 매소드 까지
		int b = 10;
		if(b == 10){
			//int b = 20;	//선언 불가능
			int c = 10;
		}
		
		//c = 10;				//if문 안에 선언된 c는 사용 불가능
		
		{
			int d;				//자주사용되는 문법은 아니지만 d 도 블럭 밖에서 사용불가능
		}
		//d = 10;
	}
	
	// 메소드의 오버로딩
	//동일한 이름의 매소드를 매개변수를 다르게하여 여러게 정의 하는것
	//매개변수의 종류 또는 순서 또는 개수가 다르면 오버로딩 조건이 성립한다.
	
	public void goo(){
		System.out.println("goo() 호출");
	}
	//메소드 이름이 같아도 유일한 형태의 매개변수를 갖는다면 정의 할수 있다 => 오버로딩
	public void goo(int num){
		System.out.println("goo(num) 호출 " + num);
	}
	//매개변수의 이름은 오버로딩 가능 조건에 해당되지 않는다.
	/*
	public void goo(int aaa){
	}
	*/
	public void goo(double d_num){
		System.out.println("goo(double) 호출" + d_num);
	}
	public void goo(int num, double d_num){
		System.out.println("goo(num, double) 호출" + num + d_num);
	}
	//순서가 달라도 오버로딩 성립 가능
	public void goo(double d_num, int num){
		System.out.println("goo(d_num, num) 호출" + d_num + num);
	}
	
	
	
	
	
	
	
	
	
}