import example_class.Derived;
import pkg_animal.*;

public class main01 {

	public static void main(String[] args) {
		Lion lion = new Lion();
		lion.eat();
		
		Rabbit rabbit = new Rabbit();
		rabbit.eat();
		
		Monkey monkey = new Monkey();
		monkey.eat();
		
		lion.run();
		rabbit.run();
		monkey.run();
	}
}
