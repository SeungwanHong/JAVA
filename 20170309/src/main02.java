/**
생성자 및 디폴트 생성자
 * 
 */

/**
 * @author bituser
 *
 */
public class main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA aaa1 = new AAA();		//AAA() -> 생성자 호출
		AAA aaa2 = new AAA(1);		//AAA(int) -> 생성자 호출
		aaa2 = aaa1;
		aaa2 = new AAA(2);
		
		AAA aaa3 = new AAA(10.234,10);
		
	}

}
class AAA{
	
	private int num = -1;
	private double d_num = -1;
	//생성자
	// -> 클래스를 이용해 객체를 만들 때 벌어지는 일들을 적어 놓은것.
	//생성자는 객체 하나당 한번만 호출이 된다.
	//new 키워드와 함께 사용된다.
	//항상 public 키워드가 와야하며, 리턴 형태가 없고 클래스 이름을 사용한다.
	// * 생성자명 = 클래스명
	//매개변수를 지정할 수 있다.
	//오버로딩이 가능하다.
	
	//생성자를 정의 해주지 않으면 컴파일러가 디폴트 생성자를 만든다.
	//생성자를 하나라도 정의 해주면 컴파일러는 디폴트 생성자를 만들지 않는다.
	// *디폴트 생성자 : 아무일도 하지 않는 기본적인 생성자. 오직 객체를 만드는 일만 한다.
	
	//디폴트 생성자, 개발자가 정의 하지 않아도 아래의 형태를 컴파일러가 자동으로 만들어 낸다.
	//	public AAA(){	}
	
	public AAA(){
		System.out.println("AAA 객체 생성!");
	}
	public AAA(int i){
		System.out.println("AAA(int) 객체 생성 " + i);
	}
	public AAA(double d_num, int num){
		
		System.out.println(this.num);
		System.out.println(this.d_num);
		
		this.num = num;
		this.d_num = d_num;
		System.out.println("AAA(int) 객체 생성 " + d_num + ", " +num);
	}
	
}