package example_class;

//���̻� ����� �Ұ��� �� Ŭ����
//���� Ŭ����
//�� �Ⱦ���. ���� ���� ����� ������
//final �޼ҵ� ������ �� �� ���� �żҵ��̴�.
public class A {

	private int num;
	
	public A(int num){
		this.num = num;
	}

	
	//�����Ǹ� �ߴٴ� ǥ�ð� �� Ȯ��������.
	//�����Ǹ� ���� ������ ������ �߻��ϰԵȴ�.
	//web ���α׷��� �ÿ� ���� ����ϰ� �ȴ�.
	//jdbc ���α׷��� �ÿ� ���� ����ϰ� �ȴ�.
	//toString
	//�Ϲ� ������ �ɹ������� ������ ����ϴµ� ����ϰ� �ȴ�.
	/*@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "[num] " + this.num;
	}
	source -> generate to string
	*/
	
	//�������̵� �Ǿ �̱� ������;
	//
	@Override
	public String toString() {
		return "A [num=" + num + "]";
	}
}
