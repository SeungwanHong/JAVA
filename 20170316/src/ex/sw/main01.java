package ex.sw;

import java.util.Scanner;

public class main01 {
	public static final int Menu_Register =1;
	public static final int Menu_InformationView = 2;
	public static final int Menu_Modify = 3;
	public static final int Menu_Exit = 4;
	
	public static void main(String[] args) {
		int num;
		int menu = 0;
		int cnt = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("����� �ο��� ���Ͻÿ� : ");
		
		num = sc.nextInt();
		Person person[]  = new Person[num];
		
		while(menu != Menu_Exit){
			String name;
			int age;
			System.out.println("1)��� 2)�������� 3)�����ϱ� 4)����");
			menu = sc.nextInt();
			switch(menu){
			case Menu_Register :
				if(cnt<num){
					System.out.println("--------���--------");
					System.out.print("�̸� : ");
					name = sc.next();
					System.out.print("���� : ");
					age = sc.nextInt();
					person[cnt] = new Person(name, age);
					cnt++;
					System.out.println(num-cnt + "�ڸ� ���ҽ��ϴ�.");
				}else{
					System.out.println("�� �̻� ��� �Ҽ� �����ϴ�");
				}
				break;
			case Menu_InformationView :
				if(cnt!=0){
					System.out.println("--------��������--------");
					for(Person p : person){
						System.out.println(p);
					}
				}else{
					System.out.println("����� �Ѹ� �ȉ���ϴ�.");
				}
				break;
			case Menu_Modify :
					int modiNum;
					System.out.print("�� ��° ������ ���� �Ͻðڽ��ϱ�? : ");
					modiNum = sc.nextInt();
					System.out.println(modiNum);
					modiNum--;
					if(0<=modiNum && modiNum<cnt){
						System.out.println("--------�����ϱ�--------");
						System.out.print("�̸� : ");
						name = sc.next();
						System.out.print("���� : ");
						age = sc.nextInt();
						person[modiNum] = new Person(name, age);
				}else{
					System.out.println("��� �ο����� ���Դϴ�.");
				}
				break;
			case Menu_Exit :System.out.println("--------����--------");
				break;
			}
			
		}
		
	}
}
