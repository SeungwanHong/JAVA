package example.generic.classes.generic;
//FruitBox를 인스턴스화 할 때 T의 자료형을 알려주어 사용 할 수 있다.
public class FruitBox <T>{
	
	private T fruit;
	
	public void putFruit(T fruit){
		System.out.println(fruit+ "을 담았습니다.");
		this.fruit = fruit;
	}
	public T getFruit(){
		System.out.println(fruit+ "을 꺼냈습니다.");
		return fruit;
	}

}
