package exampl.classes;

public class ExceptionTest {

	//cheked Exception
	//Exception Ŭ���� ��� ���� ����
	
	//foo��� �żҵ带 ȣ�� ������ 
	//MyException ���ܰ� �� �� ������ ó���ض�!!
	public void foo(int n) throws MyException{
		if(n<0){
			//���� �߻�
			//���� �߻��ÿ� ���� ��ü�� ���� catch���� ��������.
			throw new MyException();
		}
	}
	//RuntimeException Ŭ������ ��ӹ��� ���ܴ� throws�� �ݵ�� �� �� �ʿ�� ����.
	public void goo(int n){
		if(n<0){
			throw new MyRuntimException("������ �Ű������� ���� �� �����ϴ�.");
		}else{
			System.out.println("foo(int) : " + n);
		}
		
	}
}
