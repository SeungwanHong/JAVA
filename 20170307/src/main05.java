/**
break, continue
 * 
 */

/**
 * @author bit
 *
 */
public class main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break, continue
		//break : switch��, �ݺ������� �ڵ�����({} �߰�ȣ) ����� ���ش�. (�� �̻�  �������� �ʴ´�.)
		//continue : �ݺ����� �����ϰ� �ٽ� ���� �˻縦 �����Ѵ�. (for���� ������ ����)

		//break
		for(int i = 0 ; i<10 ; i++){
			if(i==5){
				System.out.println("i�� 5�϶� break");
				break;
			}
			System.out.println("hello"+i);
		}
		
		//continue
		for(int i = 0 ; i<10 ; i++){
			if(i==5){
				System.out.println("i�� 5�϶� �ǳ� ��");
				continue;
			}
			System.out.println("hello"+i);
		}
		
		for(int i = 0 ; i<10 ; i++){
			if(i%2==0){
				System.out.println("i�� ¦�� �϶� �ǳ� ��"+i);
				continue;
			}
			System.out.println("hello"+i);
		}
	}

}
