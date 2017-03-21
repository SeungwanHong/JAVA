package example.main;

import java.util.TreeSet;

public class main09 {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();
		
		treeSet.add(new Person(30, "A"));
		treeSet.add(new Person(10, "B"));
		treeSet.add(new Person(20, "C"));
		treeSet.add(new Person(40, "D"));
		treeSet.add(new Person(50, "E"));
		
		System.out.println(treeSet);
		
		TreeSet<String> treeSet1 = new TreeSet<>();
		treeSet1.add("A");
		treeSet1.add("B");
		treeSet1.add("D");
		treeSet1.add("C");
		
		System.out.println(treeSet1);
	}
}
//����� ���� Ŭ������ set�� ��������  �Ʒ��� ���� �������̽��� �޾� ����Ѵ�.
//���� ������ �������̵� �� compareTo �� ���ϰ��� �̿��Ͽ� ó���Ѵ�.
//compareTo�� �Ű������� �� ��� ��ü�� �ȴ�.
//�Ƹ��� �� ����� ��ü�� TreeSet�� ó�� �Է�(ó�� add())���� ���� �� �ִ�. �Ƹ���.
//���� ���� ���� �Ҷ���(�ߺ� �ɶ���) ���� ��������.
class Person implements Comparable<Person>{

	private int age;
	private String name;
	
	public Person(int age, String name){
		this.age = age;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + "]";
	}

	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return this.age - o.age;
	}
	
}