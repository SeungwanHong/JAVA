package Example;

public class Officeworker extends Person{

	public Officeworker(String name, String office){
		super();
		this.name = name;
		this.office = office;
	}

	@Override
	public void whatToDo() {
		// TODO Auto-generated method stub
		System.out.println("워킹 하드");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("이름 = "+name+" , 직장 = "+office+" , 출근수단 = "+transport);
	}

	@Override
	public void eatMeal() {
		// TODO Auto-generated method stub
		System.out.println("지하철 상가에서 토스트를 사먹음");
	}
	
}
