package figure;

public class Circle {

	static int c_cnt;
	private int r ;
	
	public Circle(int r){
		this.r = r;
		c_cnt++;
		System.out.println("���� " + c_cnt + "�� ����� �����ϴ�");
	}
	
	public void printinfo(){
		System.out.println("[��] : ������ = " + r + "���� = "+makeArea());
	}
	private double makeArea(){
		 return r *r*Math.PI;
	}
}
