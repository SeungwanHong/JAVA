package example_class3;

public abstract class AA {
	
	private int n;
	
	//�ڽ� Ŭ���������� �߻�ȭ Ŭ������ �����ڸ� ȣ�� �� �� �ִ�.
	//�Ϲ����� ��Ӱ� ���� �ڽ�Ŭ�������� �����ڿ� ���� å���� ���� �Ѵ�.
	public AA(int n){
		this.n = n;
	}
	//�ڽ�Ŭ�������� �ݵ�� �������̵� �ؾ��Ѵ�.
	protected abstract void foo();
	
	//�ڽ� Ŭ�������� �ʿ��(����������) �������̵��� �� �� �ִ�.
	protected void goo(){
		System.out.println("AA_goo()");
	}

}
