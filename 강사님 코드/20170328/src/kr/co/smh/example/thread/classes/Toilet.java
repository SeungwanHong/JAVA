package kr.co.smh.example.thread.classes;

public class Toilet {

	public void openDoor(String name){
		System.out.println(name + " 이 화장실 문 열었음");
	}
	
	public void useToilet(String name){
		System.out.println(name + " 이 화장실 사용중임");
	}
	
	public void closeDoor(String name){
		System.out.println(name + " 이 화장실 문 닫았음");
	}
	
	
	
	
	
	
	
	
	
	
	//동기화가 필요가 없는 메소드
	public void 명언보기(String name){
		System.out.println(name + " 이 명언을 봅니다.");
	}
	
	//캡슐화 진행
	// 메소드 동기화는 synchronized 키워드를 붙여주면 된다. -> 동기화된 메소드
	public synchronized void useToiletFull(String name){
		openDoor(name);
		useToilet(name);
		closeDoor(name);
	}
	
}