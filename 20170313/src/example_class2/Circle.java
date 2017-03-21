package example_class2;

public class Circle extends Shape{

	private int r;
	
	public Circle(int r){
		this.r = r;
	}
	@Override
	public void makeArea() {
		// TODO Auto-generated method stub
		area = Math.PI * Math.pow(r, 2);
	}
	@Override
	public String toString() {
		return "Circle [r=" + r + ", area=" + area + "]";
	}

	
}
