/**
�������̽� ���̹� ��Ģ
I�������̽���(�빮�� "I" + �������̽���)
�������̽� ���� ����� �̸��� �ǹ̷� ���̹� �Ѵ�.

�������̽��� ��ɿ� ���� ����� �Ҷ� ����Ѵ�.
����� Ŭ������ �����Ҷ� ����Ѵ�.

 * 
 */
package example1.interfaces;

/**
 * @author bituser
 *
 */
public interface IExampleA {

	//(1)�߻� �żҵ常 �ۼ� �ȴ�.
	void foo();			//�߻� �޼ҵ��.
	
	//(2)������ ������ �޼ҵ�� static ������ �żҵ� �ۿ� �ü� ����.
	//� ���ǿ��� ���Ǵ°�?
	static void goo(){
		System.out.println("IExample interface A");
	}
	
	//(3)�ɹ����� ������ ������ �� �� ����.
	int a = 10;			//�Ͻ������� public static final�� �پ� �ִ�.(����̴�.)
	
}
