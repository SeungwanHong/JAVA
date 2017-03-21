/**
- class Circle, class Rectangle 작성
   - Circle 클래스의 인스턴스를 생성 할 때는 반지름(int r)을 받아서 만든다.
   - Rectangle 클래스의 인스턴스를 생성 할 때는 가로, 세로(int width, int height)를 받아서 만든다.

   - 도형이 만들어 질 때마다 생성된 도형의 갯수를 출력 한다.
       * 원이 n개 만들어 졌습니다
       * 사각형이 n개 만들어 졌습니다
       * 
   - 각각 클래스의 makeArea() 메소드를 이용하여 원의 넓이와 가로, 세로의 넓이를 각각 구한다.
       * 원의 넓이 = 반지름 * 반지름 * Math.PI
       * 사각형의 넓이 = 가로 * 세로
   

   - 각 도형의 정보를 printInfo() 메소드를 정의하여 출력한다.
       * [원]     : 반지름 : r,     넓이 : area
       * [사각형] : 가로   : width, 높이 : height, 넓이 : area


 * 
 */
package figure;

/**
 * @author bituser
 *
 */
	
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(10, 20);
		Rectangle r3 = new Rectangle(10, 20);
		Rectangle r4 = new Rectangle(10, 20);
		
		Circle c1 = new Circle(10);
		Circle c2 = new Circle(20);
		Circle c3 = new Circle(30);
		Circle c4 = new Circle(10);
		
		r1.printinfo();
		r2.printinfo();
		r3.printinfo();
		r4.printinfo();
		
		c1.printinfo();
		c2.printinfo();
		c3.printinfo();
		c4.printinfo();
	}

}
