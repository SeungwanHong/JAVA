import exampl.building.Building;
import example.building.door.impl.HingedDoor;
import example.building.door.impl.SlideDoor;

/*
 * 1.
A사 ->건물
B사 -> 문
둘 사이에
문틀이라는것이 필요하다
이 문틀이 인터 페이스이다.

3.클래스와 클래스 사이에 결합도가 낮다.
 */
public class main02 {

	public static void main(String[] args) {
		Building building1 = new Building(new HingedDoor());				//생성자부분의 매개변수는 IDoor인데 약속을 지켰기 때문에 (암시적 형변환이 ) 처리되었다.   
		building1.in();
		building1.out();
		
		Building building2 = new Building(new SlideDoor());
		building2.in();
		building2.out();
	}
}


/*
 * 2.
has -a  관계
맴버변수 자체가 클래스 또는 인터페이스로 되어 있을 때
경찰이 총을 가지고 있다.
경찰 객체
총 객체
경찰 클래스 안에 총이 있다.(맴버로 총을 가지고 있다.)

총을 대입 하는 방법
매소드 - 많이 사용되는 방법은 아님(좋은 방법은 아니다)
생성자 - 나쁘진 않음(점수로 따지면 70점 정도)
외부에서 만들어서 a 한테 넘겨준다.(제일 배스트)

use -a 관계 -> 사용한다.
**매개변수

ex)경찰 클래스에 공격이라는 매소드가 있다.
공격할 때 총으로 공격하다면

매소드내에서 사용할 수있는 관계


인터페이스를 실무에 사용하는 방법들


*/