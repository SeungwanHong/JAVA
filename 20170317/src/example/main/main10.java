package example.main;

import java.util.HashMap;

public class main10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HashMap은 웹, 빅데이터, 안드로이드 등 모든 곳에서 제일 많이 사용한다.
		//컨텐츠 용도가 아닌 실제 데이터를 전송 또는 수신 할 때 많이 사용된다.(JSON, BSON)
		
		//KEY - Value 방식
		//저장시 : 키 - 값 을 쌍으로 저장
		//참조시 : 키만 집어 넣어서 값을 참조 한다.
		
		HashMap<String, String> hashMap = new HashMap<>();
		
		hashMap.put("ID", "userid01");
		hashMap.put("PW", "userpw01");
		
		String id = hashMap.get("ID");
		String pw = hashMap.get("PW");
		
		System.out.println(id);
		System.out.println(pw);
		
		System.out.println();
		//key는 Set방식으로 저장
		//value는 Array방식으로 저장
		
		//이미 있는 key에 값을 저장하게되면
		//마지막에 저장한 값이 저장된다.
		hashMap.put("ID", "what");
		id = hashMap.get("ID");
		
		System.out.println(id);
		
		hashMap.put("PW", "뭐야");
		pw = hashMap.get("PW");
		
		System.out.println(pw);
	}

}
