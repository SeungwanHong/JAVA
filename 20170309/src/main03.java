import Example.B;

public class main03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		B b1 = new B();
		b1.m_num++;
		b1.S_num++;
		
		System.out.println(b1.m_num);
		System.out.println(b1.S_num);
		
		B b2 = new B();
		b2.m_num++;
		b2.S_num++;
		
		System.out.println(b1.m_num);
		System.out.println(b1.S_num);
		
		//B.S_num++;
		System.out.println(b1.S_num);		
		
		b1.foo();					//�Ϲ� �ɹ� �żҵ�� ���������� �̿��Ͽ� ȣ��
									//why? ��ü�� ����� ���߸� ��� ������ ���°� �Ǳ� �����̴�.
		B.goo();					//���� �޼ҵ�� ���α׷��� ������ �� �̹� ��� ������ ����
									//���� ���� ������ �ʿ����.(���� ������ ��������)
		
	}

}
