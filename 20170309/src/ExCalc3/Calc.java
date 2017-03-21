/**
���� �����ڸ� ���� �ϴ� switch case�� ADD, SUB, MUL, DIV ����� �ٲٽÿ�
������ �� ������ "n��° �����Դϴ�."�� ��� �Ͻÿ�
 * 
 */
package ExCalc3;

public class Calc {
	//���� ������ �� ���̱�!
	private static int cnt = 0;
	private double result;
	public static final String ADD = "+";
	public static final String SUB = "-";
	public static final String MUL = "*";
	public static final String DIV = "/";
	//����� ����ϴ� ����
	//��� �ٸ� ���� ���ҽ�
	//�� ���α׷��� �ʿ��� ���ҽ�
	//���ҽ��� ��ü������ public���� ���δ�.
	//static ���ҽ� ���� ȿ�������� ����ϱ� ����
	//static���� ���� �ϰԵǸ� ��𿡼��� �ϳ��� �����ϰ�
	//������ ���� �ʿ� ���� �����ϱ� ���ϴ�.
	//���Ҵ� ��ü ���α׷����� �ϳ��� ������ �ȴ�.
	
	//final �� �̻� �������� �ʰڴ�.
	//�Ǽ� ����
	//�����ڿ��� ���� ��Ȯ�ϰ� ����ϱ� ���ؼ�...?
	
	//constants ���ҽ� ������ ���� class ��
	public void printResult(double num1, String op, double num2){
		cnt++;
		calculate(num1,op, num2);
		System.out.println(cnt+"��° �����Դϴ�.");
		System.out.println("��� : " +result);
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
