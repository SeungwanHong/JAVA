/**
break, continue
 * 
 */

/**
 * @author bit
 *
 */
public class main05 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break, continue
		//break : switch문, 반복문에서 코드블록을({} 중괄호) 벗어나게 해준다. (더 이상  실행하지 않는다.)
		//continue : 반복문을 중지하고 다시 조건 검사를 수행한다. (for문은 증감식 수행)

		//break
		for(int i = 0 ; i<10 ; i++){
			if(i==5){
				System.out.println("i가 5일때 break");
				break;
			}
			System.out.println("hello"+i);
		}
		
		//continue
		for(int i = 0 ; i<10 ; i++){
			if(i==5){
				System.out.println("i가 5일때 건너 뜀");
				continue;
			}
			System.out.println("hello"+i);
		}
		
		for(int i = 0 ; i<10 ; i++){
			if(i%2==0){
				System.out.println("i가 짝수 일때 건너 뜀"+i);
				continue;
			}
			System.out.println("hello"+i);
		}
	}

}
