package example.main;

import java.util.ArrayList;
import java.util.Iterator;

import example.generic.classes.Person;

public class main06 {
	public static void main(String[] args) {
		ArrayList<Person> personList = new ArrayList<>();
		
		personList.add(new Person(10,"A"));
		personList.add(new Person(20,"B"));
		personList.add(new Person(30,"C"));
		personList.add(new Person(40,"D"));
		
		//personList.remove(1);
		//1번쨰 값부터 땡겨진다.
		
		/*
		for(int i = 0 ; i<personList.size() ; i++){
			personList.remove(i);
		}
		//반복문을 이용하여 리스트의 값을 삭제하게 되면
		//리스트는 0을 지우면 나머지 값들이 땡겨져서 0123 -> 123 => 012
		//1번을 지우면 012 => 02 =>01
		//2번은 없기때문에 반복문이 끝난다.
		
		System.out.println(personList);
		*/
		Iterator<Person> personit = personList.iterator();
		
		//다음 요소가 있으면 반복해라.
		while(personit.hasNext()){
			Person temp = personit.next();	//다음 값을 리턴 후 반복자로 이동
			
			if(temp.getName() == "A" || temp.getName() == "C"){
				personit.remove();				//현재 내가 가리키고 있는 요소를 삭제한다.
			}
		}
		System.out.println(personList);
		
		for(int i = 0 ; i<personList.size() ; i++){
			
		}
		//전체 탐색을 할 때는 인덱스보다 for each문을 활용하는 것이 좋다.
		//* 특히 LinkedList에서의 전체 탐색은 인덱스가 아닌 for each 또는 Iterator를 이용하자
		for(Person p : personList){
			
		}
		
	}
}
