package figure;

public class Rectangle {
	static int r_cnt;
	private int width;
	private int height;
	
	
	public Rectangle(int width, int height){
		this.width = width;
		this.height = height;
		r_cnt++;
		System.out.println("�簢����" + r_cnt + "�� ����� �����ϴ�");
	}
	
	public void printinfo(){
		System.out.println("[��] : ���� = " + width +", ���� = " +height + "���� = "+makeArea());
	}
	private double makeArea(){
		 return width*height;
	}
	
}
