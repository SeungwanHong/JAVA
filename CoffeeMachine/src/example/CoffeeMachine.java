package example;

import example.coffee.Coffee;
import example.maker.MakeCoffee;

public class CoffeeMachine {

	MakeCoffee mc;
	
	public CoffeeMachine(MakeCoffee mc){
		this.mc = mc;
	}
	public void working(Coffee coffee){
		mc.makeCoffee(coffee);
	}
}
