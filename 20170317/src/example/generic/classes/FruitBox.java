package example.generic.classes;

public class FruitBox {
	
	private Fruit fruit;
	
	public void putFruit(Fruit fruit){
		System.out.println(fruit+ "�� ��ҽ��ϴ�.");
		this.fruit = fruit;
	}
	public Fruit getFruit(){
		System.out.println(fruit+ "�� ���½��ϴ�.");
		return fruit;
	}

}
