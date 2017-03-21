package example.main;

import example.generic.classes.Apple;
import example.generic.classes.FruitBox;
import example.generic.classes.Orange;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox fruitBox = new FruitBox();
		
		fruitBox.putFruit(new Apple());
		//사과를 넣고 오랜지에 받을수 있다.
		//케스팅 애러!!!!
		Orange orange2 = (Orange)fruitBox.getFruit();
		//Apple apple = (Apple)fruitBox.getFruit();
		System.out.println("꺼낸 과일 : "+orange2);
		
		fruitBox.putFruit(new Orange());
		Orange orange = (Orange)fruitBox.getFruit();
		System.out.println("꺼낸 과일 : "+orange);
	}

}
