package exampl.classes;

// ����� ���� Exception
public class MyException extends Exception{

	//(1)getMessage �������̵�
	//(2)�����ڿ��� ���� �ż��� �Է�
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "�Ű������� ���� �Դϴ�.";
	}
	
	
	
}
