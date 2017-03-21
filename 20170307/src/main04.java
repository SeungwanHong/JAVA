/**
반복문의 개념 및 이해
 * 
 */

/**
 * @author bit
 *
 */
public class main04 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//for, while, do~ while
		
		//for문
		//횟수제 반복에 유리
		//몇회 반복 하라
		/*for(1.초기식 ; 2조건식 ; 4증감식){//초기식 : 한번만 실행, 조건변수 선언과 동시에 초기화/ 조건식 : true일때 실행,  false일때 종료/ 증감식 : 초기식 값을 증감 연산
		 * 2-3-4 순으로 반복
			3실행식;
		}
		 */
		for(int i= 0 ; i<5 ; i++){
			System.out.println("Hello" + i);
		}
		//while, do~ while
		//~조건에 만족 할 때 반복
		//while 한번도 실행이 안될 수 있다.
		//do while 무조건 한번은 실행이 된다.
		//while(조건){실행} 조건이 true이면 실행문 반복 
		int num = 0;
		
		while(num<5){			//num 변수가 5보다 작을때까지만 반복을 해라
			System.out.println("Hello" + num);
			num++;
		}
		
		//do ~while 무조건 한번은 실행이 된다.
		do{
			System.out.println("hi yo");
		}
		while(num<5);
			System.out.println("프로그램 종료");
		
		
	}

}
