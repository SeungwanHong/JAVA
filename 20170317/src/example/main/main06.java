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
		//1���� ������ ��������.
		
		/*
		for(int i = 0 ; i<personList.size() ; i++){
			personList.remove(i);
		}
		//�ݺ����� �̿��Ͽ� ����Ʈ�� ���� �����ϰ� �Ǹ�
		//����Ʈ�� 0�� ����� ������ ������ �������� 0123 -> 123 => 012
		//1���� ����� 012 => 02 =>01
		//2���� ���⶧���� �ݺ����� ������.
		
		System.out.println(personList);
		*/
		Iterator<Person> personit = personList.iterator();
		
		//���� ��Ұ� ������ �ݺ��ض�.
		while(personit.hasNext()){
			Person temp = personit.next();	//���� ���� ���� �� �ݺ��ڷ� �̵�
			
			if(temp.getName() == "A" || temp.getName() == "C"){
				personit.remove();				//���� ���� ����Ű�� �ִ� ��Ҹ� �����Ѵ�.
			}
		}
		System.out.println(personList);
		
		for(int i = 0 ; i<personList.size() ; i++){
			
		}
		//��ü Ž���� �� ���� �ε������� for each���� Ȱ���ϴ� ���� ����.
		//* Ư�� LinkedList������ ��ü Ž���� �ε����� �ƴ� for each �Ǵ� Iterator�� �̿�����
		for(Person p : personList){
			
		}
		
	}
}
