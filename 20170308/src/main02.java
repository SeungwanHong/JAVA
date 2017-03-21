
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
		
		//p1.age	//age가 private 형태기 때문에 접근이 불가능
		p1.setAge(10);
		p1.setName("AAA");
		p1.setJob("직업");
		
		int age = p1.getAge();
		String name = p1.getName();
		String job = p1.getJob();
		
		System.out.println("나이 : "+ age);
		System.out.println("이름 : "+ name);
		System.out.println("직업 : "+ job);

	}

}
