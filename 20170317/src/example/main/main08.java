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
		
		//Ʈ���� ��ü���� Ʈ�� �˰����� ���� �ڵ����� �����̵ȴ�.
		//ó�� �Էµ� �����͸� ����(root)�� ���ϰ�
		//������ ���� ũ�� ���������� ���ĵȴ�.?
		System.out.println(treeSet);
	}

}
