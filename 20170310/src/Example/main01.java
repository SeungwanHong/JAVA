package Example;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Officeworker a = new Officeworker("Test", "test");
		
		a.setTransport("¹ö½º");
		a.eatMeal();
		a.whatToDo();
		a.howToGo();
		a.printInfo();
		
		Student s = new Student("È«½Â¿Ï", "ÇØ³²°í");
		s.setTransport("ÁöÇÏÃ¶");
		s.eatMeal();
		s.whatToDo();
		s.howToGo();
		s.printInfo();
		a.printInfo();
		
	}

}
