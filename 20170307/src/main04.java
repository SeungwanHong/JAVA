/**
�ݺ����� ���� �� ����
 * 
 */

/**
 * @author bit
 *
 */
public class main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for, while, do~ while
		
		//for��
		//Ƚ���� �ݺ��� ����
		//��ȸ �ݺ� �϶�
		/*for(1.�ʱ�� ; 2���ǽ� ; 4������){//�ʱ�� : �ѹ��� ����, ���Ǻ��� ����� ���ÿ� �ʱ�ȭ/ ���ǽ� : true�϶� ����,  false�϶� ����/ ������ : �ʱ�� ���� ���� ����
		 * 2-3-4 ������ �ݺ�
			3�����;
		}
		 */
		for(int i= 0 ; i<5 ; i++){
			System.out.println("Hello" + i);
		}
		//while, do~ while
		//~���ǿ� ���� �� �� �ݺ�
		//while �ѹ��� ������ �ȵ� �� �ִ�.
		//do while ������ �ѹ��� ������ �ȴ�.
		//while(����){����} ������ true�̸� ���๮ �ݺ� 
		int num = 0;
		
		while(num<5){			//num ������ 5���� ������������ �ݺ��� �ض�
			System.out.println("Hello" + num);
			num++;
		}
		
		//do ~while ������ �ѹ��� ������ �ȴ�.
		do{
			System.out.println("hi yo");
		}
		while(num<5);
			System.out.println("���α׷� ����");
		
		
	}

}
