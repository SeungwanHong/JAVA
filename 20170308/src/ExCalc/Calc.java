package ExCalc;

public class Calc {
	private String op;
	private double num1;
	private double num2;
	private double result;
	
	
	
	public void setOp(String op) {
		this.op = op;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	private void add(){
		result = num1+num2;
	}
	private void sub(){
		result = num1-num2;
	}
	private void div(){
		result = num1/num2;
	}
	private void mult(){
		result = num1*num2;
	}
	
	public void printResult(){
		System.out.println("���� ����� : " + result);
		
	}
	public void doAlgorithm(){
		System.out.println("�˰��� ����!");
		calculate();
	}
	private void calculate(){		
		switch(op){
		case "+" : add();printResult();break;
		case "-" : sub();printResult();break;
		case "*" : mult();printResult();break;
		case "/" :div();printResult();break;
		default : System.out.println("�߸��Ȱ��� �Է��Ͽ����ϴ�.");
		}
	}
	
}
