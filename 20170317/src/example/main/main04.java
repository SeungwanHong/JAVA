package example.main;

import java.util.ArrayList;

public class main04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//리스트 계열의 컬랙션 프래임워크
		//1) 자료의 저장 순서가 있다.(인텍스를 사용할 수 있다.)
		//2) 중복된 자료의 지정이 가능하다.
		
		// => ArrayList, LinkedList
		//ArrayList : 배열 기반
		//데이터가 추가 될 때마다 배열을 새로 만들고 전에 있던 데이터를 복사
		//LikedList : 연결리스트 기반
		//데이터가 추가 되면 노드가 하나 늘어 난다.(노드끼리 연결)
		
		ArrayList<String> arrayList = new ArrayList<>();
		//(1) add : 요소(원소) 추가
		//(2) remove : 삭제
		//(3) get : 참조 구하기(가져오기)
		//(4) set : 바꾸기(수정하기)
		
		arrayList.add("B");
		arrayList.add("C");
		arrayList.add("A");
		
		//List의 길이를 얻는 메소드 size();
		for(int i = 0 ; i<arrayList.size() ; i++){
			System.out.println(arrayList.get(i));
		}
		System.out.println();
		//수정하기
		arrayList.set(1, "D");
		System.out.println(arrayList.get(1));
		
		System.out.println();
		//삭제하기
		System.out.println(arrayList);
		arrayList.remove(1);			//인덱스로 삭제
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
