import exampl.building.Building;
import example.building.door.impl.HingedDoor;
import example.building.door.impl.SlideDoor;

/*
 * 1.
A�� ->�ǹ�
B�� -> ��
�� ���̿�
��Ʋ�̶�°��� �ʿ��ϴ�
�� ��Ʋ�� ���� ���̽��̴�.

3.Ŭ������ Ŭ���� ���̿� ���յ��� ����.
 */
public class main02 {

	public static void main(String[] args) {
		Building building1 = new Building(new HingedDoor());				//�����ںκ��� �Ű������� IDoor�ε� ����� ���ױ� ������ (�Ͻ��� ����ȯ�� ) ó���Ǿ���.   
		building1.in();
		building1.out();
		
		Building building2 = new Building(new SlideDoor());
		building2.in();
		building2.out();
	}
}


/*
 * 2.
has -a  ����
�ɹ����� ��ü�� Ŭ���� �Ǵ� �������̽��� �Ǿ� ���� ��
������ ���� ������ �ִ�.
���� ��ü
�� ��ü
���� Ŭ���� �ȿ� ���� �ִ�.(�ɹ��� ���� ������ �ִ�.)

���� ���� �ϴ� ���
�żҵ� - ���� ���Ǵ� ����� �ƴ�(���� ����� �ƴϴ�)
������ - ������ ����(������ ������ 70�� ����)
�ܺο��� ���� a ���� �Ѱ��ش�.(���� �轺Ʈ)

use -a ���� -> ����Ѵ�.
**�Ű�����

ex)���� Ŭ������ �����̶�� �żҵ尡 �ִ�.
������ �� ������ �����ϴٸ�

�żҵ峻���� ����� ���ִ� ����


�������̽��� �ǹ��� ����ϴ� �����


*/