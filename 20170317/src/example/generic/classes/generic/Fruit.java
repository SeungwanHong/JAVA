package example.generic.classes.generic;

public class Fruit {

	private int sugar;
	private String color;
	
	public Fruit(int sugar, String color){
		this.sugar = sugar;
		this.color = color;
	}
	public void showFruitInfo(){
		System.out.println("�絵 : "+ sugar+" %");
		System.out.println("���� : "+color);
	}
}
