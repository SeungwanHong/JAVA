package example.maker;

import example.coffee.Coffee;

public class BMaker implements MakeCoffee{

	@Override
	public void makeCoffee(Coffee coffee) {
		// TODO Auto-generated method stub
		System.out.print("B�� Ŀ�Ǵ� : ");
		coffee.makeWay();
	}

}
