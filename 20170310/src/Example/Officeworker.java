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
		System.out.println("��ŷ �ϵ�");
	}

	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		System.out.println("�̸� = "+name+" , ���� = "+office+" , ��ټ��� = "+transport);
	}

	@Override
	public void eatMeal() {
		// TODO Auto-generated method stub
		System.out.println("����ö �󰡿��� �佺Ʈ�� �����");
	}
	
}
