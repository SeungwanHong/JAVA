/**
계산기 연산자를 구분 하는 switch case를 ADD, SUB, MUL, DIV 상수로 바꾸시오
연산이 될 때마다 "n번째 연산입니다."를 출력 하시오
 * 
 */
package ExCalc3;

public class Calc {
	//접근 지시자 꼭 붙이기!
	private static int cnt = 0;
	private double result;
	public static final String ADD = "+";
	public static final String SUB = "-";
	public static final String MUL = "*";
	public static final String DIV = "/";
	//상수를 사용하는 이유
	//상수 다른 말로 리소스
	//이 프로그램에 필요한 리소스
	//리소스는 대체적으로 public으로 쓰인다.
	//static 리소스 관리 효율적으로 사용하기 위해
	//static으로 관리 하게되면 어디에서든 하나만 존재하고
	//여러개 만들 필요 없이 관리하기 편하다.
	//리소는 전체 프로그램에서 하나만 있으면 된다.
	
	//final 더 이상 변경하지 않겠다.
	//실수 방지
	//개발자에게 더욱 명확하게 명시하기 위해서...?
	
	//constants 리소스 관리를 위한 class 명
	public void printResult(double num1, String op, double num2){
		cnt++;
		calculate(num1,op, num2);
		System.out.println(cnt+"번째 연산입니다.");
		System.out.println("결과 : " +result);
	}
	
	private void calculate(double num1, String op, double num2){
		switch (op){
		case ADD: add(num1,num2);break;
		case SUB: sub(num1,num2);break;
		case MUL: mul(num1,num2);break;
		case DIV: div(num1,num2);break;
		}		
	}
	private void add(double num1, double num2){
		this.result = num1 + num2;
	}
	private void sub(double num1, double num2){
		this.result = num1 - num2;
	}
	private void mul(double num1, double num2){
		this.result = num1 * num2;
	}
	private void div(double num1, double num2){
		this.result = num1 / num2;
	}

}
