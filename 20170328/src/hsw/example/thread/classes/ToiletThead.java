package hsw.example.thread.classes;

public class ToiletThead extends Thread{

	private Toilet toilet;
	private String name;

	public ToiletThead(String name, Toilet toilet){
		this.name = name;
		this.toilet = toilet;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
//		//객체 동기화
//		synchronized (toilet) {
//			toilet.openDoor(name);
//			toilet.useToilet(name);
//			toilet.closeDoor(name);
//		}
		//매소드 동기화
		//공유 객체 , 공유 자원의 메소드를 동기화 한다.
		//선택적으로  필요한 매소드만 동기화가 가능하다.
		//이 매소드를 사용중이면 다른 매소드는 자원을 사용하지 못한다.
		toilet.명언보기(name);								//동기화 안된 메소드
		toilet.useToiletFull(name);					//동기화 된 메소드

	}

}
