package Example;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Officeworker a = new Officeworker("Test", "test");
		
		a.setTransport("����");
		a.eatMeal();
		a.whatToDo();
		a.howToGo();
		a.printInfo();
		
		Student s = new Student("ȫ�¿�", "�س���");
		s.setTransport("����ö");
		s.eatMeal();
		s.whatToDo();
		s.howToGo();
		s.printInfo();
		a.printInfo();
		
	}

}
