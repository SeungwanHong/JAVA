/**
������ �� ����Ʈ ������
 * 
 */

/**
 * @author bituser
 *
 */
public class main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AAA aaa1 = new AAA();		//AAA() -> ������ ȣ��
		AAA aaa2 = new AAA(1);		//AAA(int) -> ������ ȣ��
		aaa2 = aaa1;
		aaa2 = new AAA(2);
		
		AAA aaa3 = new AAA(10.234,10);
		
	}

}
class AAA{
	
	private int num = -1;
	private double d_num = -1;
	//������
	// -> Ŭ������ �̿��� ��ü�� ���� �� �������� �ϵ��� ���� ������.
	//�����ڴ� ��ü �ϳ��� �ѹ��� ȣ���� �ȴ�.
	//new Ű����� �Բ� ���ȴ�.
	//�׻� public Ű���尡 �;��ϸ�, ���� ���°� ���� Ŭ���� �̸��� ����Ѵ�.
	// * �����ڸ� = Ŭ������
	//�Ű������� ������ �� �ִ�.
	//�����ε��� �����ϴ�.
	
	//�����ڸ� ���� ������ ������ �����Ϸ��� ����Ʈ �����ڸ� �����.
	//�����ڸ� �ϳ��� ���� ���ָ� �����Ϸ��� ����Ʈ �����ڸ� ������ �ʴ´�.
	// *����Ʈ ������ : �ƹ��ϵ� ���� �ʴ� �⺻���� ������. ���� ��ü�� ����� �ϸ� �Ѵ�.
	
	//����Ʈ ������, �����ڰ� ���� ���� �ʾƵ� �Ʒ��� ���¸� �����Ϸ��� �ڵ����� ����� ����.
	//	public AAA(){	}
	
	public AAA(){
		System.out.println("AAA ��ü ����!");
	}
	public AAA(int i){
		System.out.println("AAA(int) ��ü ���� " + i);
	}
	public AAA(double d_num, int num){
		
		System.out.println(this.num);
		System.out.println(this.d_num);
		
		this.num = num;
		this.d_num = d_num;
		System.out.println("AAA(int) ��ü ���� " + d_num + ", " +num);
	}
	
}