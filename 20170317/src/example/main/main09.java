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
//사용자 정의 클래스를 set에 넣을때는  아래와 같이 인터페이스를 받아 사용한다.
//정렬 기준을 오버라이드 된 compareTo 의 리턴값을 이용하여 처리한다.
//compareTo의 매개변수는 비교 대상 객체가 된다.
//아마도 비교 대상의 객체는 TreeSet에 처음 입력(처음 add())받은 값일 수 있다. 아마도.
//기준 값이 동일 할때는(중복 될때는) 값이 없어진다.
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