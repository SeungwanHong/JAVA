package kr.co.smh.example.thread.classes;

//Runnable 인터페이스 implements
// run 메소드를 오버라이딩 받아야 한다.
public class KoreanThread implements Runnable{

	@Override
	public void run() {
		
		for(char ch = 'ㄱ'; ch <= 'ㅎ'; ch++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("\t한  글 : " + ch);
		}
	}

}
