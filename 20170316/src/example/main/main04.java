package example.main;

import exampl.classes.ExceptionTest;
import exampl.classes.MyException;

public class main04 {
	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		
		try {
			exceptionTest.foo(-10);			//반드시 예외를 처리해라
												//Exception 클래스를 상속한 Checked Exception 이기 때문에
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exceptionTest.goo(-10);
	}
}
