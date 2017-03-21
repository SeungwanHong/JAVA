package example.main;

import example.generic.classes.generic.*;

public class main02 {
	public static void main(String[] args) {
		//뒤에 자료형 형태는 안적어더된다.
		//제네릭은 일반화를 위해 사용 한다.
	
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Orange> orangebox = new FruitBox<Orange>();
		
		FruitBox<Integer> test = new FruitBox<>();
		
		applebox.putFruit(new Apple());
		orangebox.putFruit(new Orange());
		//Orange orange = (Orange) applebox.getFruit();
	}
}
