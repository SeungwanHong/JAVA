package example.main;

import example.generic.classes.generic.*;

public class main02 {
	public static void main(String[] args) {
		//�ڿ� �ڷ��� ���´� ��������ȴ�.
		//���׸��� �Ϲ�ȭ�� ���� ��� �Ѵ�.
	
		FruitBox<Apple> applebox = new FruitBox<Apple>();
		FruitBox<Orange> orangebox = new FruitBox<Orange>();
		
		FruitBox<Integer> test = new FruitBox<>();
		
		applebox.putFruit(new Apple());
		orangebox.putFruit(new Orange());
		//Orange orange = (Orange) applebox.getFruit();
	}
}
