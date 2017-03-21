package exampl.classes;

// 사용자 정의 Exception
public class MyException extends Exception{

	//(1)getMessage 오버라이드
	//(2)생성자에서 예외 매세지 입력
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "매개변수가 음수 입니다.";
	}
	
	
	
}
