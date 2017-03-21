/**
간단한 구구단 구현
2 * 1 = 2
2 * 2 = 4
...
9 * 9 = 81
패턴파악
(1) 단수 (2단, 3단, ... 9단)
(2) 곱해지는 숫자 (1, 2, 3, ... 9)

실습 예제
2단	3단	4단
5단	6단	7단
8단	9단
 * 
 */

/**
 * @author bit
 *
 */
public class BasicGugudan {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 구구단
		/*
		for(int i = 2 ; i < 10 ; i++){
			System.out.println(i + "단");
			for(int j = 1 ; j <10 ; j++){
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println();
		}
*/		
		//실습 예제
		/*
		for(int i =2 ; i<10 ; i+=3){
			for(int j = 1 ; j<10 ; j++){
				for(int k =i ; k<i+3 ; k++){
					if(k==10)break;
					System.out.print(k + " * " + j + " = " +(k*j) + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		*/
		//강사님 코드
		int max = 9;
		int horizon = 3;
		int vertical = max/horizon + (max % horizon == 0 ? 0 : 1);
		int start = 2;
		for(int i = 0 ; i<vertical ; i++){
			for(int j = 1 ; j<10 ; j++){
				for(int k = 0 ; k< horizon && start+k <= max ; k++){
					System.out.print((start+k)*j);
				}
				System.out.println();
			}
			start+=horizon;
			System.out.println();
		}
	}

}
