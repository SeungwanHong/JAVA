/**
�ڷ����� ����
 * 
 */

/**
 * @author bit
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*�ڷ����� ����
		 * �ڷ��� : ���� �Ǵ� ǥ���� �ڷ��� ����
		 * ���� : ���� ������(�ڷ�, ��)�� ����Ǵ� ���� �̸�
		 * �޸�  �ּҰ�: ������ �޸𸮿� ������ �Ҵ� �Ǿ��� �� �ش� ��ġ�� ǥ���ϴ� �ּ� ��
		 * 			 16���� ������ �̷���� �ִ�.*/
		/*
		 * (1) char �ڷ���
		 * (����) �� �����ϰų� ��Ÿ���� �ڷ���
		 *  *���ڶ� - A , B, C, ��, ��
		 *  �ϳ��� ���ڸ� �մ� ������ 
		 */
		char ch1 = 'A';		//������ �ʱ�ȭ
		char ch2;
		ch2 = 'B';
		//�ʱ�ȭ ���� ���� ������ ����� �� ����.
		
		char ch3;	//���� ������ ������ �ʱ�ȭ�� ���� �ʾ��� ��
		
		System.out.println(ch1);
		System.out.println(ch2);
		//System.out.println(ch3);
		/*
		 * (2) int �ڷ���
		 * (��ȣ�ִ� ����)�� �����ϰų� ��Ÿ���� �ڷ���
		 *�ڹ��� ��� ������ int �ڷ����� �������� ����Ǳ� ������ ��� ������ ������ int�� �����Ѵ�.
		 *ex) short + short = int ���·� ��ȯ
		 */
		int num1 = 10;
		int num2 = -10;
		int num3 = 0;
		
		//int num4 = 10.123;	//error!! ����(int��)�� �Ǽ��� �� �� ����.
		
		/*
		 * (3) double��
		 * (��ȣ �ִ� �Ǽ�)�� �����ϰų� ��Ÿ���� �ڷ���
		 */
		double d1 = 10.5;
		double d2 = -10.5;
		double d3 = 10;	//�Ǽ��� �ڷ��� double���� ���� �ڷᰡ ��� �� �� �ִ�.
		
		/* �ڷ��� ����ȯ
		 * 
		 */

		int a = 10;		//4byte int ����
		double d = a;	//8byte double���� ���� �ڷ��� a�� ������ �ִ� ���� d�� ����(�ʱ�ȭ) / ���� ������ �ִ� �����͸� ū ������ ������ �ű� ���� ���ٸ� ������ �ʿ� ����. / ������(�Ͻ���) ����ȯ �߻�
		
		double dd = 10.123;
		/* int a = dd; //���� !!!
		 * int a = (int)dd //type casting 
		 * */
		int a1 = (int)dd;		//ū �ڷ������� ���� �ڷ������� �ű� ���� �ַ�!!!�߻� / �������� �ս��� ���� �ϴ��� ���� �ű� ���� ����� ����ȯ ����� ���� / ����� ����ȯ�� ���� ����(�ڷ���) <- type casting
		
		char uni_ch = 97;		//�����ڵ忡 �����Ǵ� ������ �ʱ�ȭ
		System.out.println(uni_ch);
		int uni_int = 'A';
		System.out.println(uni_int);
		
		char uni_ch2 = 'A'+1;
		System.out.println("*"+(uni_ch+1));
		System.out.println("*"+uni_ch);
		System.out.println("*"+(int)uni_ch);
		System.out.println(uni_ch2);
		uni_ch2 = 'A'+1;
		System.out.println(uni_ch2);
		
		byte b1;				//1byte -128~127
		b1 = (byte)128;
		
		String str = "Hello";
		System.out.println(str);
		
		//���� ��� ��ġ
		//����� ����
		
		//num of apple -> numOfApple		//camel case
		
	}

}
