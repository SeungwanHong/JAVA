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
		//�迭�� �̿��غ���
		//���������� �迭�� 10���� ����ڴ�.
		//�迭 ���� �Ǿ��ִ� ����������
		int [] score_arr = new int[10];
		
//		[]�� �ִٸ� �迭�� ���� �ϰڴ�.
//		[]���� ���ڴ� index��� �Ѵ�.
//		index�� ������ 0�����Ѵ�.
//		�������ε����� �迭�� ����-1
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
		//for ~each��
		//�ݺ��� ����Ǹ鼭 �������� ù��° ���Һ��� ������ ���ұ��� ���ʴ�� ���Եȴ�.
		for(int i : score_arr){
			System.out.println(i);
		}
		
	}

}
