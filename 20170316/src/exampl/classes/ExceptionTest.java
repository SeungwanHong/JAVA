package exampl.classes;

public class ExceptionTest {

	//cheked Exception
	//Exception 클래스 상속 받은 예외
	
	//foo라는 매소드를 호출 했을때 
	//MyException 예외가 날 수 있으니 처리해라!!
	public void foo(int n) throws MyException{
		if(n<0){
			//예외 발생
			//예외 발생시에 예외 객체를 만들어서 catch문에 던저진다.
			throw new MyException();
		}
	}
	//RuntimeException 클래스를 상속받은 예외는 throws를 반드시 써 줄 필요는 없다.
	public void goo(int n){
		if(n<0){
			throw new MyRuntimException("음수가 매개변수로 들어올 수 없습니다.");
		}else{
			System.out.println("foo(int) : " + n);
		}
		
	}
}
