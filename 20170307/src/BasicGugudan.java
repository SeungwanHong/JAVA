/**
������ ������ ����
2 * 1 = 2
2 * 2 = 4
...
9 * 9 = 81
�����ľ�
(1) �ܼ� (2��, 3��, ... 9��)
(2) �������� ���� (1, 2, 3, ... 9)

�ǽ� ����
2��	3��	4��
5��	6��	7��
8��	9��
 * 
 */

/**
 * @author bit
 *
 */
public class BasicGugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�⺻ ������
		/*
		for(int i = 2 ; i < 10 ; i++){
			System.out.println(i + "��");
			for(int j = 1 ; j <10 ; j++){
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
*/		
		//�ǽ� ����
		/*
		for(int i =2 ; i<10 ; i+=3){
			for(int j = 1 ; j<10 ; j++){
				for(int k =i ; k<i+3 ; k++){
					if(k==10)break;
					System.out.print(k + " * " + j + " = " +(k*j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		//����� �ڵ�
		int max = 9;
		int horizon = 3;
		int vertical = max/horizon + (max % horizon == 0 ? 0 : 1);
		int start = 2;
		for(int i = 0 ; i<vertical ; i++){
			for(int j = 1 ; j<10 ; j++){
				for(int k = 0 ; k< horizon && start+k <= max ; k++){
					System.out.print((start+k)*j);
				}
				System.out.println();
			}
			start+=horizon;
			System.out.println();
		}
	}

}
