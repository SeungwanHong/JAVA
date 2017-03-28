package kr.co.smh.example.thread.classes;

public class ToiletThread extends Thread{

	private Toilet toilet;
	private String name;
	public ToiletThread(Toilet toilet, String name){
		this.toilet = toilet;
		this.name = name;
	}

	@Override
	public void run() {
		
		//객체 동기화
//		synchronized (toilet) {
//			toilet.openDoor(name);
//			toilet.useToilet(name);
//			toilet.closeDoor(name);
//		}
		
		//메소드 동기화
		// 공유 자원(공유 객체)의 메소드를 동기화 한다
		// 선택적으로 필요한 기능만 동기화가 가능하다
		
		toilet.명언보기(name);			//동기화 안된 메소드
		toilet.useToiletFull(name); //동기화 된 메소드
		
		
		
		
	}
	
}
