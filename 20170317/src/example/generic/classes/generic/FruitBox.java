package example.generic.classes.generic;
//FruitBox�� �ν��Ͻ�ȭ �� �� T�� �ڷ����� �˷��־� ��� �� �� �ִ�.
public class FruitBox <T>{
	
	private T fruit;
	
	public void putFruit(T fruit){
		System.out.println(fruit+ "�� ��ҽ��ϴ�.");
		this.fruit = fruit;
	}
	public T getFruit(){
		System.out.println(fruit+ "�� ���½��ϴ�.");
		return fruit;
	}

}
