package Example;

public class Student extends Person{

	public Student(String name, String office){
		this.name = name;
		this.office = office;
	}

	
	@Override
	public void whatToDo() {
		// TODO Auto-generated method stub
		System.out.println("������ �Ѵ�");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("�̸� = "+name+" , �б� = "+office+" , ��ټ��� = "+transport);
	}

	@Override
	public void eatMeal() {
		// TODO Auto-generated method stub
		System.out.println("��Ӵϰ� �����ֽ� ������ ���� ����");
	}
}
