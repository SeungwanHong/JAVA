package example.main;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper Class
		//�⺻ �ڷ����� Ŭ����ȭ
		
		//int�� �⺻ �ڷ���
		int a1 = 10;
		
		//�ڽ� ����
		Integer w_a1 = new Integer(10);
		Integer w_a2 = new Integer("10");
		
		int  w_a3 = Integer.valueOf("10");
		int  w_a4 = Integer.valueOf(10);
		
		Double w_d1 = new Double("1.23");
		
		//���� ��ڽ�
		System.out.println(w_a1 + w_a2);
		//��ڽ�
		System.out.println(w_a1.intValue() + w_a2.intValue());
		
		//���� �ڽ�
		Integer auto_boxing = 10;
		
	}

}
/*
��Ű������ �� �ҹ���
Ŭ������ ù ö�ڴ� �빮�� ���� ĳ�����̽�
������ ĳ�����̽� �Ǵ� _(�����)
�żҵ�� ĳ�����̽�

url�� �Ųٷ� ������ ���·� ���� �����
kr.co.google.���� �̸�


�ڽ̰� ��ڽ� ����
����ڽ̰� ���� ��ڽ��� �������ش�.


*/
