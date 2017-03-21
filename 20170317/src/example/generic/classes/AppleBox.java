package example.generic.classes;

//잘못 된 예
public class AppleBox {

	private Apple apple;
	
	public void putApple(Apple apple){
		System.out.println("사과를 담았습니다.");
		this.apple = apple;
	}
}
