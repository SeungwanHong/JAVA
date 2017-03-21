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
		
		System.out.println("등록할 인원을 정하시오 : ");
		
		num = sc.nextInt();
		Person person[]  = new Person[num];
		
		while(menu != Menu_Exit){
			String name;
			int age;
			System.out.println("1)등록 2)정보보기 3)수정하기 4)종료");
			menu = sc.nextInt();
			switch(menu){
			case Menu_Register :
				if(cnt<num){
					System.out.println("--------등록--------");
					System.out.print("이름 : ");
					name = sc.next();
					System.out.print("나이 : ");
					age = sc.nextInt();
					person[cnt] = new Person(name, age);
					cnt++;
					System.out.println(num-cnt + "자리 남았습니다.");
				}else{
					System.out.println("더 이상 등록 할수 없습니다");
				}
				break;
			case Menu_InformationView :
				if(cnt!=0){
					System.out.println("--------정보보기--------");
					for(Person p : person){
						System.out.println(p);
					}
				}else{
					System.out.println("등록이 한명도 안됬습니다.");
				}
				break;
			case Menu_Modify :
					int modiNum;
					System.out.print("몇 번째 정보를 수정 하시겠습니까? : ");
					modiNum = sc.nextInt();
					System.out.println(modiNum);
					modiNum--;
					if(0<=modiNum && modiNum<cnt){
						System.out.println("--------수정하기--------");
						System.out.print("이름 : ");
						name = sc.next();
						System.out.print("나이 : ");
						age = sc.nextInt();
						person[modiNum] = new Person(name, age);
				}else{
					System.out.println("등록 인원외의 값입니다.");
				}
				break;
			case Menu_Exit :System.out.println("--------종료--------");
				break;
			}
			
		}
		
	}
}
