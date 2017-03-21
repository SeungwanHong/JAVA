package example.main;

import java.util.ArrayList;

import example.generic.classes.generic.Apple;

public class main05 {
	public static void main(String[] args) {
		ArrayList<Apple> appleList = new ArrayList<>();
		Apple apple1 = new Apple();
		
		appleList.add(apple1);
		appleList.add(apple1);
		
		System.out.println(appleList);
	}
}
