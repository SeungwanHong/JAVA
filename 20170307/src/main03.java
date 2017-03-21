/**
switch문의 개념 및 이해 
 * 
 */

/**
 * @author bit
 *
 */
public class main03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//switch(변수) ~ case(값) : 수행문;break;
		
		int num =2;
		
		switch(num){
		case 2:
			System.out.println("num은 2입니다.");
			break;
		case 1:
			System.out.println("num은 1입니다.");
			break;
		case 3:
			System.out.println("num은 3입니다.");
			break;
		default:
			System.out.println("매칭 되는 숫자가 없습니다.");
			break;

		}
	}

}
