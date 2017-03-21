package example;import example.coffee.Americano;
import example.coffee.Coffee;
import example.maker.AMaker;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CoffeeMachine cm1 = new CoffeeMachine(new AMaker());

		cm1.working(new Americano(20, "¹°", 20, 10, 10));
	}

}
