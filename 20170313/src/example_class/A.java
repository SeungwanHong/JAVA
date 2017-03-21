package example_class;

//더이상 상속이 불가능 한 클래스
//종단 클래스
//잘 안쓴다. 단정 짓기 힘들기 때문에
//final 메소드 재정의 할 수 없는 매소드이다.
public class A {

	private int num;
	
	public A(int num){
		this.num = num;
	}

	
	//재정의를 했다는 표시가 더 확실해진다.
	//재정의를 하지 않으면 에러가 발생하게된다.
	//web 프로그래밍 시에 자주 사용하게 된다.
	//jdbc 프로그래밍 시에 자주 사용하게 된다.
	//toString
	//일반 적으로 맴버변수의 내용을 출력하는데 사용하게 된다.
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[num] " + this.num;
	}
	source -> generate to string
	*/
	
	//오버라이드 되어서 이기 때문에;
	//
	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
}
