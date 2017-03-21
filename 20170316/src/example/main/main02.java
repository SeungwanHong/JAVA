package example.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main02 {
	//디버그중 ture, 디버그 끝나면 false
	public static final boolean isDebug = false;
	
	public static void main(String[] args) {

		//사용자의 키보드로부터 입력을 받게 해주는 Scanner
		
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 0;

		// if(num1 == 0 || num2 == 0){
		// System.out.println("num에 0이 들어 갔습니다.");
		// }else{
		// int result = num1/num2;
		// System.out.println(result);
		// }

		// 예외처리 try ~catch ~finally
		// try : 예외 발생 가능 문장
		// catch : try에서 발생한 예외를 처리하는 구간 여러개가 올 수 있다. ->else if와 비슷
		// finally : try에서 모든 코드가 제대로 실행 되던 아니던 무조건 실행 되어야 할 문장
		// 보통 try가 끝날 때 실행 할 문장과 catch가 끝날 때 실행할 문장이 온다.

		try{
			num2 = scan.nextInt();
			int result = num1 / num2;				//예외를 던지면
			System.out.println(result);
		}
		//catch에서 받는다.
		catch(ArithmeticException e){
			if(isDebug){
				System.out.println(e.getMessage());
			}
			System.out.println("재수에 0을 입력하면 안됩니다.");
		}catch(InputMismatchException e){
			if(isDebug){
				System.out.println(e.getMessage());
			}
			e.printStackTrace();
			System.out.println("정수 형태를 입력해주세요");
		}
		//예외 객체 활용
		//getMessage()		=>어떤 애러가 났는지만 알려준다.
		//printStackTrace()	=>애러 위치및 애러 내용을 알려준다.
		
	}
}
