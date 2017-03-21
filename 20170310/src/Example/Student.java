package Example;

public class Student extends Person{

	public Student(String name, String office){
		this.name = name;
		this.office = office;
	}

	
	@Override
	public void whatToDo() {
		// TODO Auto-generated method stub
		System.out.println("과제를 한다");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름 = "+name+" , 학교 = "+office+" , 출근수단 = "+transport);
	}

	@Override
	public void eatMeal() {
		// TODO Auto-generated method stub
		System.out.println("어머니가 지어주신 따뜻한 밥을 먹음");
	}
}
