/**

��ü ���� ���
 * 
 */
package example_class;

/**
 * @author bit
 *
 */
public class Person2 {
	//��ü ���� ���
	//(1)Ŭ������ ���� ���� �׻� �����ͺ���
	// => �ɹ����� ���� ������.
	private int age = 10;
	private String name = "A";
	private String job = "B";
	
	//(2)��ɿ� ���� ����
	// => �޼ҵ� ����
	
	//1 �Ű����� x ���ϰ� x
	public void printPersonInfo(){
		System.out.println(age);
		System.out.println(name);
		System.out.println(job);
	}
	//2 �Ű����� o ���ϰ� x
	public void changePersonAge(int age){
		this.age = age;
		System.out.println("���̰� ���� �Ǿ����ϴ�.");
	}
	//3 �Ű����� x ���ϰ� o
	public String getPersonName(){
		System.out.println("�̸��� ȣ�� �Ǿ����ϴ�.");
		return name;
	}
	//4 �Ű�����o ���ϰ� o
	public String changePersonJob(String job){
		this.job = job;
		System.out.println("������ ���� �Ǿ����ϴ�.");
		return job;
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	public String getJob() {
		return job;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setJob(String job) {
		this.job = job;
	}

		
	
	//1-2 �ɹ� ������ ���� getter/setter�� ����
	// => ��� Ŭ������ �ɹ������� private ���·� ���ǰ� �Ǿ�� �ϱ� ������(�������� Ư��)
	//		���ο����� ���� �� ���� �ִ�.
	
	//�ʿ信 ���� �ܺο��� �ɹ������� ������ �ϰ��� getter�� setter�� �����Ѵ�.
	//getter : �ܺο��� �����͸� ��� ���
	//setter : �ܺο��� �����͸� �Է� �޾� ���� �ϴ� ���
	
	//getter / setter�� �̿������ν� �ܺο��� �ɹ������� ���� ������ ���� �� �� �ִ�.
	//�ɹ������� ���� ������ ���Ը� �ϰ� �ʹ�. => getter�� ����
	//�ɹ������� ���� ���ø� �ϰ� �ϰ� �ʹ�. => setter�� ����
	///�Ѵ� �ϰ� �ʹ�. => �Ѵ� ����(getter / setter);
	
	//��� getter / setter�� public���� ���� �Ǿ� ����.
	//�ڵ� ��Ģ get, set�� �ҹ��� ���� �ɹ������� ù ö�ڴ� �빮��
	
	

	
	
}