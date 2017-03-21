/**
메소드의 캡슐화
 * 
 */
package example_class;

/**
 * @author bituser
 *
 */
public class Contac600 {

		private void takeRed(){
			System.out.println("코감기 낫기");
		}
		private void takeBlue(){
			System.out.println("목감기 낫기");
		}
		private void takeBlack(){
			System.out.println("기침감기 낫기");
		}
		
		//위의 코드는 처음에 public으로 작성되었는데
		//사용자는 3가지 감기약을 먹는 기능을 알 필요가 없다.
		//따라서 private로 처리

		//캡슐화 된 메소드
		public void takeMedicine(){
			takeRed();
			takeBlue();
			takeBlack();
		}
}
