package figure;

public class Rectangle {
	static int r_cnt;
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		r_cnt++;
		System.out.println("사각형이" + r_cnt + "개 만들어 졌습니다");
	}
	
	public void printinfo(){
		System.out.println("[원] : 가로 = " + width +", 높이 = " +height + "넓이 = "+makeArea());
	}
	private double makeArea(){
		 return width*height;
	}
	
}
