package example.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap�� ��, ������, �ȵ���̵� �� ��� ������ ���� ���� ����Ѵ�.
		//������ �뵵�� �ƴ� ���� �����͸� ���� �Ǵ� ���� �� �� ���� ���ȴ�.(JSON, BSON)
		
		//KEY - Value ���
		//����� : Ű - �� �� ������ ����
		//������ : Ű�� ���� �־ ���� ���� �Ѵ�.
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");
		
		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");
		
		System.out.println(id);
		System.out.println(pw);
		
		System.out.println();
		//key�� Set������� ����
		//value�� Array������� ����
		
		//�̹� �ִ� key�� ���� �����ϰԵǸ�
		//�������� ������ ���� ����ȴ�.
		hashMap.put("ID", "what");
		id = hashMap.get("ID");
		
		System.out.println(id);
		
		hashMap.put("PW", "����");
		pw = hashMap.get("PW");
		
		System.out.println(pw);
	}

}
