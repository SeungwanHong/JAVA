package figure;

public class Circle {

	static int c_cnt;
	private int r ;
	
	public Circle(int r){
		this.r = r;
		c_cnt++;
		System.out.println("원이 " + c_cnt + "개 만들어 졌습니다");
	}
	
	public void printinfo(){
		System.out.println("[원] : 반지름 = " + r + "넓이 = "+makeArea());
	}
	private double makeArea(){
		 return r *r*Math.PI;
	}
}
