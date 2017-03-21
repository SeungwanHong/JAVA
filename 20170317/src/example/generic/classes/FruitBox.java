package example.generic.classes;

public class FruitBox {
	
	private Fruit fruit;
	
	public void putFruit(Fruit fruit){
		System.out.println(fruit+ "을 담았습니다.");
		this.fruit = fruit;
	}
	public Fruit getFruit(){
		System.out.println(fruit+ "을 꺼냈습니다.");
		return fruit;
	}

}
