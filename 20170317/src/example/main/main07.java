package example.main;

import java.util.HashSet;

public class main07 {
	public static void main(String[] args) {
		//set
		// => ����Ʈ�� �ٸ��� �ߺ����� �ʰ� ������ ����.
		//�ڵ����� ������ �ȴ�.
		// hash �˰��� ���� �����͵��� ��ġ (Hash set)
		//tree ���ı��ؿ� ���� �����͵��� ��ġ(tree set)
		
		HashSet<String> hashSet = new HashSet<>();
		
//		hashSet.add("Banana");
//		hashSet.add("Apple");
//		hashSet.add("Melon");
//		hashSet.add("Orange");
//		hashSet.add("Grape");
//		
//		hashSet.add("Melon");
//		hashSet.add("Melon");
//		hashSet.add("Melon");
		hashSet.add("A");
		hashSet.add("F");
		hashSet.add("D");
		hashSet.add("C");
		hashSet.add("E");
		hashSet.add("B");
		
		System.out.println(hashSet);
	}
}
