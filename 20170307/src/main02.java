/**
���ǹ� �ݺ��� ���� �� ����	
 * 
 */

/**
 * @author bit
 *
 */
public class main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//���ǹ�
		//()���� ������ boolean ���� �´�.
		/*
		if(����1){
			if()���� ������ ���϶� ������ ����
		}else if(����2){
			else if()���� ������ ���϶� ������ ����
		}else{
			���� ����1,2�� ������ ��� �����϶� ���� �� ����
		}
		*/
		
		int num1 = 10;
		int num2 = 5;
		//if�� ���� true
		//if���� ������ ���� �ȴ�.
		//if�� ���� false
		//else���� ������ ���� �ȴ�.
		if(num1 == num2){
			System.out.println("num1�� num2�� ����.");
		}else{
			System.out.println("num1�� num2�� �ٸ���.");
		}
		
		if(num1 == num2){
			System.out.println("num1�� num2�� ����.");
		}else if(num1 > num2){
			System.out.println("num1dl num2���� ũ��.");
		}else if(num1 < num2){
			System.out.println("num1dl num2���� �۴�.");			
		}else{
			System.out.println("???????????");
		}
		
		//���ǹ��� �߸� ����� ���
		//��� ������ ��� �˻� �ϰ� �ȴ�.
		//���� ������ ������ �´� ������ ������ �� �Ʒ��� ������ ������ ���� �ʴ´�.
		if(num1 == num2){
			System.out.println("num1�� num2�� ����.");
		}
		if(num1 > num2){
			System.out.println("num1dl num2���� ũ��.");
		}
		if(num1 < num2){
			System.out.println("num1dl num2���� �۴�.");			
		}
		
		//��ø �� if��
		if(num1 >= num2){
			System.out.println("num1�� num2���� ũ�ų� ����");
			if(num1 > num2){
				System.out.println("num1�� num2���� ũ��");
			}else{
				System.out.println("num1�� num2�� ����.");
			}
		}else{
			System.out.println("num1�� num2���� �۴�");
		}
		
		//���� ���� ����
		/*������ ���� (int score)�� �˻��Ͽ�
		90�̻� 100���� a
		80�̻� 90�̸� b
		70�̻� 80�̸� c
		�׿� f ���*/
		int score = 100;
		if(score>=80){
			if(score<90){
				System.out.println("B");
			}else{
				System.out.println("A");
			}
		}else{
			if(score>=70){
				System.out.println("C");
			}else{
				System.out.println("F");
			}
		}
		//0�̸��̳� 100 �ʰ��� ������ score�� ����Ǹ� "�߸��� ���� �Դϴ�" ���
		if(score<0 || score>100){
			System.out.println("�߸��� ���� �Դϴ�.");
		}else{
			if(score>=80){
				if(score<90){
					System.out.println("B");
				}else{
					System.out.println("A");
				}
			}else{
				if(score>=70){
					System.out.println("C");
				}else{
					System.out.println("F");
				}
			}
		}
		
		
	}

}
