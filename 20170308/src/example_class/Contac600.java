/**
�޼ҵ��� ĸ��ȭ
 * 
 */
package example_class;

/**
 * @author bituser
 *
 */
public class Contac600 {

		private void takeRed(){
			System.out.println("�ڰ��� ����");
		}
		private void takeBlue(){
			System.out.println("�񰨱� ����");
		}
		private void takeBlack(){
			System.out.println("��ħ���� ����");
		}
		
		//���� �ڵ�� ó���� public���� �ۼ��Ǿ��µ�
		//����ڴ� 3���� ������� �Դ� ����� �� �ʿ䰡 ����.
		//���� private�� ó��

		//ĸ��ȭ �� �޼ҵ�
		public void takeMedicine(){
			takeRed();
			takeBlue();
			takeBlack();
		}
}
