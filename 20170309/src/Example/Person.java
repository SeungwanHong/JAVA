package Example;

public class Person {
	//맴버 변수에 final(상수) 변수가 있다면 생성자에서 무조건 초기화 시켜주어야 한다.
	private final String JUMIN_NUMBER;
	private String name;
	
	public Person(String JUMIN_NUMBER, String name){
		this.JUMIN_NUMBER = JUMIN_NUMBER;
		this.name = name;
	}

	public String getJUMIN_NUMBER() {
		return JUMIN_NUMBER;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printPersonInfo(){
		System.out.println("이름 : "+ this.name);
		System.out.println("주민등록 번호 : "+ this.JUMIN_NUMBER);
	}
}
