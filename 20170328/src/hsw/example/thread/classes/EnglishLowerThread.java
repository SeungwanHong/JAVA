package hsw.example.thread.classes;

public class EnglishLowerThread extends Thread{

	//쓰래드가 시작 되었을 때 수행되는 매소드
	//main과 같은 역할을 한다.
	//작업단위
	
	//run()이 끝난다. : 쓰래드가 종료된다.
	@Override
	public void run(){
		
		for(char ch = 'a' ; ch <= 'z' ; ch++){
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			System.out.println("\t\t소문자 : "+ch);
		}
	}
}
