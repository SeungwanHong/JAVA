package example.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main02 {
	//������� ture, ����� ������ false
	public static final boolean isDebug = false;
	
	public static void main(String[] args) {

		//������� Ű����κ��� �Է��� �ް� ���ִ� Scanner
		
		Scanner scan = new Scanner(System.in);
		int num1 = 10;
		int num2 = 0;

		// if(num1 == 0 || num2 == 0){
		// System.out.println("num�� 0�� ��� �����ϴ�.");
		// }else{
		// int result = num1/num2;
		// System.out.println(result);
		// }

		// ����ó�� try ~catch ~finally
		// try : ���� �߻� ���� ����
		// catch : try���� �߻��� ���ܸ� ó���ϴ� ���� �������� �� �� �ִ�. ->else if�� ���
		// finally : try���� ��� �ڵ尡 ����� ���� �Ǵ� �ƴϴ� ������ ���� �Ǿ�� �� ����
		// ���� try�� ���� �� ���� �� ����� catch�� ���� �� ������ ������ �´�.

		try{
			num2 = scan.nextInt();
			int result = num1 / num2;				//���ܸ� ������
			System.out.println(result);
		}
		//catch���� �޴´�.
		catch(ArithmeticException e){
			if(isDebug){
				System.out.println(e.getMessage());
			}
			System.out.println("����� 0�� �Է��ϸ� �ȵ˴ϴ�.");
		}catch(InputMismatchException e){
			if(isDebug){
				System.out.println(e.getMessage());
			}
			e.printStackTrace();
			System.out.println("���� ���¸� �Է����ּ���");
		}
		//���� ��ü Ȱ��
		//getMessage()		=>� �ַ��� �������� �˷��ش�.
		//printStackTrace()	=>�ַ� ��ġ�� �ַ� ������ �˷��ش�.
		
	}
}
