package example.main;

import exampl.classes.ExceptionTest;
import exampl.classes.MyException;

public class main04 {
	public static void main(String[] args) {
		ExceptionTest exceptionTest = new ExceptionTest();
		
		try {
			exceptionTest.foo(-10);			//�ݵ�� ���ܸ� ó���ض�
												//Exception Ŭ������ ����� Checked Exception �̱� ������
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		exceptionTest.goo(-10);
	}
}
