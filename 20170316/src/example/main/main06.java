package example.main;

public class main06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		int score1 = 90;
		int score2 = 90;
		int score3 = 90;
		int score4 = 90;
		int score5 = 90;
		
		int score6 = 90;
		int score7 = 90;
		int score8 = 90;
		int score9 = 90;
		int score10 = 90;
		
		int total_score = score1+ score2+ score3+ score4+ score5+ score6+ score7+ score8+ score9+ score10;
		
		int avg_score = total_score/10;
		
		System.out.println(avg_score);
		*/
		//배열을 이용해보자
		//정수형태의 배열을 10개를 만들겠다.
		//배열 열거 되어있다 연속적으로
		int [] score_arr = new int[10];
		
//		[]이 있다면 배열에 접근 하겠다.
//		[]안의 숫자는 index라고 한다.
//		index의 시작은 0부터한다.
//		마지막인덱스는 배열의 길이-1
		score_arr[0] = 10;
//		score_arr[1] = 10;
//		score_arr[2] = 10;
//		score_arr[3] = 10;
//		score_arr[4] = 10;
		for (int i = 0; i < score_arr.length; i++) {
			score_arr[i] = (i+1)*10;
		}
//		for (int i = 0; i < score_arr.length; i++) {
//			System.out.println(score_arr[i]);
//		}
//		System.out.println(score_arr[0]);
//		
		//for ~each문
		//반복이 진행되면서 변수에는 첫번째 원소부터 마지막 원소까지 차례대로 대입된다.
		for(int i : score_arr){
			System.out.println(i);
		}
		
	}

}
