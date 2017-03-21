/**
어떤 문인지 알수 없음
미닫이, 여닫이
그래서 그냥 문만 만들어 놨음

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
//	어떤 문인지 알수 없음
//	미닫이, 여닫이
//	그래서 그냥 문만 만들어 놨음
//	has -a 관계이다.
//	문을 열고 닫는것에만 관심이 있어야한다.
	
	public Building(){
		//관심사의 분리 a는 b를 알필요없다.
		//여기서는 잠깐 설명상 관심사의 분리 원칙에 위반
		//관심사의 분리는 좋은 코드의 구분 하는 의미라 굳이 안지켜도 되지만....그냥 지키는게 좋다.
		door = new HingedDoor();
	}
	
	public Building(IDoor door){
		this.door = door;
	}
	
	public void in(){
		System.out.println("신원 확인");
		System.out.println("보안 확인");
		
		door.openDoor();
	}
	public void out(){
		System.out.println("보안 확인");
		door.closeDoor();
		
	}
}
