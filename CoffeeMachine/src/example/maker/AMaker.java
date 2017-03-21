package example.maker;

import example.coffee.Coffee;

public class AMaker implements MakeCoffee{

	@Override
	public void makeCoffee(Coffee coffee) {
		// TODO Auto-generated method stub
		System.out.print("A사 커피는 : ");
		coffee.makeWay();
		
	}

}
