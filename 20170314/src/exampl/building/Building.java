/**
� ������ �˼� ����
�̴���, ������
�׷��� �׳� ���� ����� ����

 * 
 */
package exampl.building;

import example.building.door.IDoor;
import example.building.door.impl.HingedDoor;

/**
 * @author bituser
 *
 */
public class Building {

	private IDoor door; 
//	� ������ �˼� ����
//	�̴���, ������
//	�׷��� �׳� ���� ����� ����
//	has -a �����̴�.
//	���� ���� �ݴ°Ϳ��� ������ �־���Ѵ�.
	
	public Building(){
		//���ɻ��� �и� a�� b�� ���ʿ����.
		//���⼭�� ��� ����� ���ɻ��� �и� ��Ģ�� ����
		//���ɻ��� �и��� ���� �ڵ��� ���� �ϴ� �ǹ̶� ���� �����ѵ� ������....�׳� ��Ű�°� ����.
		door = new HingedDoor();
	}
	
	public Building(IDoor door){
		this.door = door;
	}
	
	public void in(){
		System.out.println("�ſ� Ȯ��");
		System.out.println("���� Ȯ��");
		
		door.openDoor();
	}
	public void out(){
		System.out.println("���� Ȯ��");
		door.closeDoor();
		
	}
}
