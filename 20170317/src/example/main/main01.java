package example.main;

import example.generic.classes.Apple;
import example.generic.classes.FruitBox;
import example.generic.classes.Orange;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitBox fruitBox = new FruitBox();
		
		fruitBox.putFruit(new Apple());
		//����� �ְ� �������� ������ �ִ�.
		//�ɽ��� �ַ�!!!!
		Orange orange2 = (Orange)fruitBox.getFruit();
		//Apple apple = (Apple)fruitBox.getFruit();
		System.out.println("���� ���� : "+orange2);
		
		fruitBox.putFruit(new Orange());
		Orange orange = (Orange)fruitBox.getFruit();
		System.out.println("���� ���� : "+orange);
	}

}
