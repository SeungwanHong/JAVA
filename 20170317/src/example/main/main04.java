package example.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ʈ �迭�� �÷��� �����ӿ�ũ
		//1) �ڷ��� ���� ������ �ִ�.(���ؽ��� ����� �� �ִ�.)
		//2) �ߺ��� �ڷ��� ������ �����ϴ�.
		
		// => ArrayList, LinkedList
		//ArrayList : �迭 ���
		//�����Ͱ� �߰� �� ������ �迭�� ���� ����� ���� �ִ� �����͸� ����
		//LikedList : ���Ḯ��Ʈ ���
		//�����Ͱ� �߰� �Ǹ� ��尡 �ϳ� �þ� ����.(��峢�� ����)
		
		ArrayList<String> arrayList = new ArrayList<>();
		//(1) add : ���(����) �߰�
		//(2) remove : ����
		//(3) get : ���� ���ϱ�(��������)
		//(4) set : �ٲٱ�(�����ϱ�)
		
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");
		
		//List�� ���̸� ��� �޼ҵ� size();
		for(int i = 0 ; i<arrayList.size() ; i++){
			System.out.println(arrayList.get(i));
		}
		System.out.println();
		//�����ϱ�
		arrayList.set(1, "D");
		System.out.println(arrayList.get(1));
		
		System.out.println();
		//�����ϱ�
		System.out.println(arrayList);
		arrayList.remove(1);			//�ε����� ����
		arrayList.remove("D");
		arrayList.remove("A");
		
		System.out.println(arrayList);
		
		System.out.println();
		//
		arrayList.add("B");
		arrayList.add("B");
		arrayList.add("F");
		
		System.out.println(arrayList);
	}

}
