package calc;

public class Calc {
	public String op;
	public double num1;
	public double num2;
	public double result;
	
	
	
	public void add(){
		result = num1+num2;
	}
	public void sub(){
		result = num1-num2;
	}
	public void div(){
		result = num1/num2;
	}
	public void mult(){
		result = num1*num2;
	}
	
	public void printResult(){
		System.out.println("연산 결과는 : " + result);
	}

	/*
	private double result;
	public void add(num1,num2){
		result = num1+num2;
	}
	public void sub(num1,num2){
		result = num1-num2;
	}
	public void mult(num1,num2){
		result = num1*num2;
	}
	public void div(num1,num2){
		result = num1/num2;
	}
	public void showResult(){
		System.out.println("결과 : " + result);
	}
	*/
}
