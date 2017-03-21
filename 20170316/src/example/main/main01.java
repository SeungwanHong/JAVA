package example.main;

public class main01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Wrapper Class
		//기본 자료형을 클래스화
		
		//int는 기본 자료형
		int a1 = 10;
		
		//박싱 과정
		Integer w_a1 = new Integer(10);
		Integer w_a2 = new Integer("10");
		
		int  w_a3 = Integer.valueOf("10");
		int  w_a4 = Integer.valueOf(10);
		
		Double w_d1 = new Double("1.23");
		
		//오토 언박싱
		System.out.println(w_a1 + w_a2);
		//언박싱
		System.out.println(w_a1.intValue() + w_a2.intValue());
		
		//오토 박싱
		Integer auto_boxing = 10;
		
	}

}
/*
패키지명은 다 소문자
클래스명 첫 철자는 대문자 이후 캐멀케이스
변수명 캐멀케이스 또는 _(언더바)
매소드명 캐멀케이스

url을 거꾸로 뒤집은 형태로 많이 사용함
kr.co.google.어플 이름


박싱과 언박싱 개념
오토박싱과 오토 언박싱을 지원해준다.


*/
