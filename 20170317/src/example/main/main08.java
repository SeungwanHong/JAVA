package example.main;

import java.util.TreeSet;

public class main08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> treeSet = new TreeSet<>();
		
		treeSet.add("C");
		treeSet.add("A");
		treeSet.add("B");
		treeSet.add("T");
		treeSet.add("H");
		
		treeSet.add("G");
		treeSet.add("O");
		treeSet.add("P");
		treeSet.add("Q");
		treeSet.add("R");
		treeSet.add("AB");
		
		//트리셋 자체에서 트리 알고리즘을 통해 자동으로 정렬이된다.
		//처음 입력된 데이터를 기준(root)로 정하고
		//작으면 왼쪽 크면 오른쪽으로 정렬된다.?
		System.out.println(treeSet);
	}

}
