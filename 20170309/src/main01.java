/**
 ��ü�� ���� �� �Ҹ�
  �ʵ�� �޼ҵ�
 */

/**
 * @author bituser
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.setNum(10);
		a.printNum();
		
		a = new A();			//������ a ������ gabage collector�� ����� �Ǿ� �Ҹ� ��, �׿� ���ÿ� a�� ���ο� ��ü A�� �Ҵ��Ͽ�
		a.printNum();
		
		A a1 = new A();
		
		a1.setNum(100);
		a1.printNum();
		
		//�޸� �ּҰ��� ���� ���� �߿�!!!
		A a2 = a1;
		
		a2.setNum(200);
		a2.printNum();
		a1.printNum();
		
	}

}
//������ �����ϱ� �������� �Ʒ��� ���� �Ͽ���.
class A{
	private int num;
	
	
	public void setNum(int num){
		this.num = num;
	}
	public void printNum(){
		System.out.println("num : "+ num);
	}
	//�������� �Ű�����
	//�Ű������� ��� - �ش� �޼ҵ� ����
	public void foo(int a){
		//�������� ��� - �ش� �żҵ� ����
		int b = 10;
		if(b == 10){
			//int b = 20;	//���� �Ұ���
			int c = 10;
		}
		
		//c = 10;				//if�� �ȿ� ����� c�� ��� �Ұ���
		
		{
			int d;				//���ֻ��Ǵ� ������ �ƴ����� d �� �� �ۿ��� ���Ұ���
		}
		//d = 10;
	}
	
	// �޼ҵ��� �����ε�
	//������ �̸��� �żҵ带 �Ű������� �ٸ����Ͽ� ������ ���� �ϴ°�
	//�Ű������� ���� �Ǵ� ���� �Ǵ� ������ �ٸ��� �����ε� ������ �����Ѵ�.
	
	public void goo(){
		System.out.println("goo() ȣ��");
	}
	//�޼ҵ� �̸��� ���Ƶ� ������ ������ �Ű������� ���´ٸ� ���� �Ҽ� �ִ� => �����ε�
	public void goo(int num){
		System.out.println("goo(num) ȣ�� " + num);
	}
	//�Ű������� �̸��� �����ε� ���� ���ǿ� �ش���� �ʴ´�.
	/*
	public void goo(int aaa){
	}
	*/
	public void goo(double d_num){
		System.out.println("goo(double) ȣ��" + d_num);
	}
	public void goo(int num, double d_num){
		System.out.println("goo(num, double) ȣ��" + num + d_num);
	}
	//������ �޶� �����ε� ���� ����
	public void goo(double d_num, int num){
		System.out.println("goo(d_num, num) ȣ��" + d_num + num);
	}
	
	
	
	
	
	
	
	
	
}