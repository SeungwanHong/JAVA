/**
조건문 반복문 개념 및 이해	
 * 
 */

/**
 * @author bit
 *
 */
public class main02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//조건문
		//()안의 조건은 boolean 값이 온다.
		/*
		if(조건1){
			if()안의 조건이 참일때 수행할 문장
		}else if(조건2){
			else if()안의 조건이 참일때 수행할 문장
		}else{
			위의 조건1,2의 조건이 모두 거짓일때 수행 할 문장
		}
		*/
		
		int num1 = 10;
		int num2 = 5;
		//if의 조건 true
		//if문의 문장이 실행 된다.
		//if의 조건 false
		//else문의 문장이 실행 된다.
		if(num1 == num2){
			System.out.println("num1과 num2는 같다.");
		}else{
			System.out.println("num1과 num2는 다르다.");
		}
		
		if(num1 == num2){
			System.out.println("num1과 num2는 같다.");
		}else if(num1 > num2){
			System.out.println("num1dl num2보다 크다.");
		}else if(num1 < num2){
			System.out.println("num1dl num2보다 작다.");			
		}else{
			System.out.println("???????????");
		}
		
		//조건문을 잘못 사용한 경우
		//모든 조건을 모두 검사 하게 된다.
		//위의 조건은 조건이 맞는 문장을 실행후 그 아래의 문장은 실행이 되지 않는다.
		if(num1 == num2){
			System.out.println("num1과 num2는 같다.");
		}
		if(num1 > num2){
			System.out.println("num1dl num2보다 크다.");
		}
		if(num1 < num2){
			System.out.println("num1dl num2보다 작다.");			
		}
		
		//중첩 된 if문
		if(num1 >= num2){
			System.out.println("num1이 num2보다 크거나 같다");
			if(num1 > num2){
				System.out.println("num1이 num2보다 크다");
			}else{
				System.out.println("num1이 num2와 같다.");
			}
		}else{
			System.out.println("num1이 num2보다 작다");
		}
		
		//문제 성적 계산기
		/*정수형 점수 (int score)를 검사하여
		90이상 100이하 a
		80이상 90미만 b
		70이상 80미만 c
		그외 f 출력*/
		int score = 100;
		if(score>=80){
			if(score<90){
				System.out.println("B");
			}else{
				System.out.println("A");
			}
		}else{
			if(score>=70){
				System.out.println("C");
			}else{
				System.out.println("F");
			}
		}
		//0미만이나 100 초과의 점수가 score에 저장되면 "잘못된 점수 입니다" 출력
		if(score<0 || score>100){
			System.out.println("잘못된 점수 입니다.");
		}else{
			if(score>=80){
				if(score<90){
					System.out.println("B");
				}else{
					System.out.println("A");
				}
			}else{
				if(score>=70){
					System.out.println("C");
				}else{
					System.out.println("F");
				}
			}
		}
		
		
	}

}
