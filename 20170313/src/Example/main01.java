package Example;

public class main01 {

	public static void main(String[] args) {
		RubberDuck rd = new RubberDuck();
		NomalDuck nd1 = new NomalDuck();
		RobotDuck rod1 = new RobotDuck();
		
		rd.sound();
		rd.printKind();
		
		nd1.sound();
		nd1.printKind();
		
		rod1.sound();
		rod1.printKind();
	}
}
