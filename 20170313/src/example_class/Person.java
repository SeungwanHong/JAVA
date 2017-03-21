package example_class;

public class Person {
	String name;
	int age;
	String birthday;
	

	public Person(String name, int age, String birthday){
		this.age = age;
		this.birthday = birthday;
		this.name =name;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", birthday=" + birthday + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Person temp = (Person)obj;
		boolean equals_condition = (this.name.equals(temp.name)) && 
											(this.age == temp.age) && 
											(this.birthday == temp.birthday);
											//euquals랑 ==의 											//주소가 같나?
		
		return equals_condition;
	}
}
