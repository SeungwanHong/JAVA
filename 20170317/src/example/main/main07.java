package example.main;

import java.util.HashSet;

public class main07 {
	public static void main(String[] args) {
		//set
		// => 리스트와 다르게 중복되지 않고 순서가 없다.
		//자동으로 정렬이 된다.
		// hash 알고리즘에 의한 데이터들의 배치 (Hash set)
		//tree 정렬기준에 의한 데이터들의 배치(tree set)
		
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
