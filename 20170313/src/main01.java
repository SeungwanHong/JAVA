

import example_class.B;

public class main01 {
	public static void main(String[] args) {
		
		B b1 = new B(10,20);
		String str = b1.toString();
		
		System.out.println(b1);
		System.out.println(str);
		//B���� toString()�� ������ �Ǿ� ���� �ʱ� ������,
		//�ٷ� ���� �θ��� AŬ������ toString()�� ȣ���Ѵ�.
		//���� A���� toString()�� ���� �Ǿ� ���� ������,
		//Object�� toString()�� ȣ�� �Ѵ�.
	}
}
