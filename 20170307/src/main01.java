/**
������ ��� �������� ���� ����
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
		// ������
		// ���� ������ - ���� �ϳ� �ۿ� ��� ����
		// ���� ���� ������ - ������ �������� (�����ݷ� ;)�� ����/����  ++x
		// ���� ���� ������ - ������ ������ ���� ����/����				x++

		int num1 = 10;
		int num2 = 20;

		// �������� ���� ���� �켱 ������ �°� �Ұ�ȣ()�� ������
		System.out.println((++num1) + (++num2));		// 11+21=32
		System.out.println((num1--)+(++num2));			// 11+22=33
		
		//���� ���� *
		System.out.println(num1*num2);
		
		//������ ���� /
		num1 = 5;
		num2 = 2;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.println((double)num1/(double)num2);
		System.out.println("*"+(double)num1%(double)num2);
		System.out.println((double)num1);		//����
		System.out.println((double)num2);		//����
		
		System.out.println((double)num1/num2);			//2.5
		System.out.println(num1/(double)num2);			//2.0
		//���������� ����ȯ�� �Ǳ� ������ ������� �޶�����.
		
		//���� ������
		
		System.out.println(num1>num2);				//num1�� num2���� ũ��.
		System.out.println(num1>=num2);				//num1�� num2���� ũ�ų� ����.
		
		System.out.println(num1<num2);				//num1�� num2���� �۴�.
		System.out.println(num1<=num2);				//num1�� num2���� �۰ų� ����.
		
		//���� ������
		
		System.out.println(num1==num2);				//num1�� num2�� ����.
		System.out.println(num1!=num2);				//num1�� num2�� ���� �ʴ�.
		
		System.out.println(num1!=5)	;
		
		
		//�� ������
		//&&(and)  A&&B A,B�Ѵ� true �϶� true�� ����, �ϳ��� false ��� false
		//||(or)		A||B A,B �� �ϳ��� true �϶�, true ���� �Ѵ� false �϶��� false
		
		//and : A�κ��� �����̸� B�κ��� ������ �������� �ʴ´�.
		System.out.println(num1==5 && num2==2);	//true
		//OR : A�κ��� ���̸� B�κ� ������ �������� �ʴ´�.
		System.out.println(num1==2 || num2==2);		//true
		
		//���� ������(���� ������)
		//BOOLEAN ? ����1 : ����2
		//���� ������ ���̸� ����1 ���� ����
		//���� ������ �����̸� ����2 ���� ����
		
		//������ ���� ���� ����� Ȯ�� �� �� ����Ѵ�.
		String result = num1>5 ? "AAA" : "BBB";
		System.out.println(result);
		
		//����
		//num1�� 0�� 10 ���̿� �ִ� ���̶�� "DDD" �ƴϸ� "EEE"���
		result = (0<num1 && num1<10) ? "DDD" : "EEE";
		System.out.println(result);
		
		//���� ����
		num2 = 10;		//num2�� 10�� ����
		num2 +=10;		//num2�� 10�� ���� ���� ����
		
		
		
		
		
		
	}

}
