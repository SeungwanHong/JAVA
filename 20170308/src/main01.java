/**
��ü�� Ŭ����
��Ű��
����ϰ��� �ϴ� Ŭ������ ��Ű���� �ٸ� �ܿ����� import�� �̿��Ͽ� Ŭ������ ��� �����ϰ� �ؾ� �Ѵ�.
 * 
 */
import  example_class.Person;
/**
 * @author bit
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		//new Ű���带 �̿��Ͽ� Ŭ������ �ν��Ͻ�ȭ �Ѵ�.
		//�ν��Ͻ�ȭ �� ���� heap �޸𸮿� ��ü�� ���� �޸� ������ �Ҵ�ǰ�
		//�޸� �ּҰ��� �߻� ��Ų��.
		Person p1 = new Person();
		//heap �޸� �ּҰ� ���
		System.out.println(p1);
		// (.) ���� ������
		p1.age = 10;
		p1.name = "�̸�";
		p1.job = "����";
		p1.printPersonInfo();
		
		p1.changePersonAge(20);
		String p1Name = p1.getPersonName();
		String p1Job = p1.changePersonJob("B");
		p1.printPersonInfo();
		
	}

}
