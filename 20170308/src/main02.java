
import example_class.Person2;

/**
 * 
 */

/**
 * @author bituser
 *
 */
public class main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person2 p1 = new Person2();
		
		//p1.age	//age�� private ���±� ������ ������ �Ұ���
		p1.setAge(10);
		p1.setName("AAA");
		p1.setJob("����");
		
		int age = p1.getAge();
		String name = p1.getName();
		String job = p1.getJob();
		
		System.out.println("���� : "+ age);
		System.out.println("�̸� : "+ name);
		System.out.println("���� : "+ job);

	}

}
