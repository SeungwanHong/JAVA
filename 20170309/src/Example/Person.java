package Example;

public class Person {
	//�ɹ� ������ final(���) ������ �ִٸ� �����ڿ��� ������ �ʱ�ȭ �����־�� �Ѵ�.
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
		System.out.println("�̸� : "+ this.name);
		System.out.println("�ֹε�� ��ȣ : "+ this.JUMIN_NUMBER);
	}
}
