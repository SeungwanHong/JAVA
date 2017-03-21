package ExCalc;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Calc tmp = new Calc(); 
		
		double num1 = 10;
		double num2 = 20;
		String op = "-";
		
		tmp.setNum1(num1);
		tmp.setNum2(num2);
		tmp.setOp(op);
		System.out.println(num1+op+num2);
		tmp.doAlgorithm();

	}
}
