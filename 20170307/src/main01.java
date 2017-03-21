/**
연산자 계산 순서순위 개념 이해
 * 
 */

/**
 * @author bit
 *
 */
public class main01 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 연산자
		// 단항 연산자 - 항이 하나 밖에 없어서 단항
		// 전위 증감 연산자 - 문장이 끝나기전 (세미콜론 ;)에 증가/감소  ++x
		// 후위 증감 연산자 - 문장이 끝나고 나서 증가/감소				x++

		int num1 = 10;
		int num2 = 20;

		// 가독성을 위해 연산 우선 순위에 맞게 소괄호()를 해주자
		System.out.println((++num1) + (++num2));		// 11+21=32
		System.out.println((num1--)+(++num2));			// 11+22=33
		
		//곱셈 연산 *
		System.out.println(num1*num2);
		
		//나눗셈 연산 /
		num1 = 5;
		num2 = 2;
		
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		
		System.out.println((double)num1/(double)num2);
		System.out.println("*"+(double)num1%(double)num2);
		System.out.println((double)num1);		//질문
		System.out.println((double)num2);		//질문
		
		System.out.println((double)num1/num2);			//2.5
		System.out.println(num1/(double)num2);			//2.0
		//더블형으로 형변환이 되긴 하지만 결과값이 달라진다.
		
		//관계 연산자
		
		System.out.println(num1>num2);				//num1이 num2보다 크다.
		System.out.println(num1>=num2);				//num1이 num2보다 크거나 같다.
		
		System.out.println(num1<num2);				//num1이 num2보다 작다.
		System.out.println(num1<=num2);				//num1이 num2보다 작거나 같다.
		
		//동등 연산자
		
		System.out.println(num1==num2);				//num1이 num2와 같다.
		System.out.println(num1!=num2);				//num1이 num2와 같지 않다.
		
		System.out.println(num1!=5)	;
		
		
		//논리 연산자
		//&&(and)  A&&B A,B둘다 true 일때 true값 리턴, 하나라도 false 라면 false
		//||(or)		A||B A,B 중 하나라도 true 일때, true 리턴 둘다 false 일때만 false
		
		//and : A부분이 거짓이면 B부분의 연산은 수행하지 않는다.
		System.out.println(num1==5 && num2==2);	//true
		//OR : A부분이 참이면 B부분 연산은 수행하지 않는다.
		System.out.println(num1==2 || num2==2);		//true
		
		//삼항 연산자(조건 연산자)
		//BOOLEAN ? 실행1 : 실행2
		//앞의 조건이 참이면 실행1 문장 실행
		//앞의 조건이 거짓이면 실행2 문장 실행
		
		//간단한 조건 비교후 결과를 확인 할 때 사용한다.
		String result = num1>5 ? "AAA" : "BBB";
		System.out.println(result);
		
		//문제
		//num1이 0과 10 사이에 있는 값이라면 "DDD" 아니면 "EEE"출력
		result = (0<num1 && num1<10) ? "DDD" : "EEE";
		System.out.println(result);
		
		//대입 연산
		num2 = 10;		//num2에 10을 대입
		num2 +=10;		//num2에 10을 더한 값을 대입
		
		
		
		
		
		
	}

}
