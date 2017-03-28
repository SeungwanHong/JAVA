package kr.co.smh.example.thread.classes;

//쓰레드 1과 2가 동시에 사용할 공유자원

public class ShareObj1 {
	
	public int num = 0;
	
	// 동기화를 위한 boolean은 절대 금지	
	//	public boolean isChange = false;
	
}
