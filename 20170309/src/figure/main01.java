/**
- class Circle, class Rectangle �ۼ�
   - Circle Ŭ������ �ν��Ͻ��� ���� �� ���� ������(int r)�� �޾Ƽ� �����.
   - Rectangle Ŭ������ �ν��Ͻ��� ���� �� ���� ����, ����(int width, int height)�� �޾Ƽ� �����.

   - ������ ����� �� ������ ������ ������ ������ ��� �Ѵ�.
       * ���� n�� ����� �����ϴ�
       * �簢���� n�� ����� �����ϴ�
       * 
   - ���� Ŭ������ makeArea() �޼ҵ带 �̿��Ͽ� ���� ���̿� ����, ������ ���̸� ���� ���Ѵ�.
       * ���� ���� = ������ * ������ * Math.PI
       * �簢���� ���� = ���� * ����
   

   - �� ������ ������ printInfo() �޼ҵ带 �����Ͽ� ����Ѵ�.
       * [��]     : ������ : r,     ���� : area
       * [�簢��] : ����   : width, ���� : height, ���� : area


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
