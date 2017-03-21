/**
자료형과 변수
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
		/*자료형과 변수
		 * 자료형 : 저장 또는 표현할 자료의 종류
		 * 변수 : 실제 데이터(자료, 값)가 저장되는 곳의 이름
		 * 메모리  주소값: 변수가 메모리에 공간이 할당 되었을 때 해당 위치를 표현하는 주소 값
		 * 			 16진수 정수로 이루어져 있다.*/
		/*
		 * (1) char 자료형
		 * (문자) 를 지정하거나 나타내는 자료형
		 *  *문자란 - A , B, C, ㄱ, ㄴ
		 *  하나의 글자만 잇는 데이터 
		 */
		char ch1 = 'A';		//변수의 초기화
		char ch2;
		ch2 = 'B';
		//초기화 하지 않은 변수는 사용할 수 없다.
		
		char ch3;	//변수 선언은 했지만 초기화가 되지 않았을 때
		
		System.out.println(ch1);
		System.out.println(ch2);
		//System.out.println(ch3);
		/*
		 * (2) int 자료형
		 * (부호있는 정수)를 저장하거나 나타내는 자료형
		 *자바의 모든 연산은 int 자료형을 기준으로 연산되기 때문에 모든 정수는 무조건 int로 생각한다.
		 *ex) short + short = int 형태로 변환
		 */
		int num1 = 10;
		int num2 = -10;
		int num3 = 0;
		
		//int num4 = 10.123;	//error!! 정수(int형)는 실수가 들어갈 수 없다.
		
		/*
		 * (3) double형
		 * (부호 있는 실수)를 지정하거나 나타내는 자료형
		 */
		double d1 = 10.5;
		double d2 = -10.5;
		double d3 = 10;	//실수형 자료형 double형은 정수 자료가 들어 갈 수 있다.
		
		/* 자료의 형변환
		 * 
		 */

		int a = 10;		//4byte int 형태
		double d = a;	//8byte double형태 정수 자료형 a가 가지고 있는 값을 d에 대입(초기화) / 작은 공간에 있는 데이터를 큰 공간의 변수로 옮길 때는 별다른 과정이 필요 없다. / 묵시적(암시적) 형변환 발생
		
		double dd = 10.123;
		/* int a = dd; //에러 !!!
		 * int a = (int)dd //type casting 
		 * */
		int a1 = (int)dd;		//큰 자료형에서 작은 자료형으로 옮길 때는 애러!!!발생 / 데이터의 손실을 감수 하더라도 값을 옮길 때는 명시적 형변환 기법이 사용됨 / 명시적 형변환은 변수 옆에(자료형) <- type casting
		
		char uni_ch = 97;		//유니코드에 대응되는 정수로 초기화
		System.out.println(uni_ch);
		int uni_int = 'A';
		System.out.println(uni_int);
		
		char uni_ch2 = 'A'+1;
		System.out.println("*"+(uni_ch+1));
		System.out.println("*"+uni_ch);
		System.out.println("*"+(int)uni_ch);
		System.out.println(uni_ch2);
		uni_ch2 = 'A'+1;
		System.out.println(uni_ch2);
		
		byte b1;				//1byte -128~127
		b1 = (byte)128;
		
		String str = "Hello";
		System.out.println(str);
		
		//변수 명명 규치
		//사과의 개수
		
		//num of apple -> numOfApple		//camel case
		
	}

}
