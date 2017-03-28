package kr.co.smh.example.thread.classes;

//Thread 클래스를 상속 받아서 만드는 형태
public class EnglishLowerThread extends Thread {

	// 쓰레드가 시작 되었을 때 수행되는 메소드
	// main과 같은 역할을 한다.

	// 작업 단위..

	// run()이 끝난다 : 쓰레드가 종료된다.
	@Override
	public void run() {
		
		for (char ch = 'a'; ch <= 'z'; ch++) {
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			System.out.println("\t\t소문자 : " + ch);
		}
		
	}

}
