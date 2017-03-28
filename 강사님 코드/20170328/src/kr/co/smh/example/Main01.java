package kr.co.smh.example;

import kr.co.smh.example.thread.classes.EnglishLowerThread;
import kr.co.smh.example.thread.classes.KoreanThread;

public class Main01 {

	public static void main(String[] args) throws InterruptedException {
		
		EnglishLowerThread elt = new EnglishLowerThread();
		Thread kt = new Thread(new KoreanThread());
		
		// thread 클래스 내부에 있는 run 메소드는 절대 호출 하지 말자(Thread를 만든 의미가 없음)
//		elt.run();
//		kt.run();
		
		//start() 메소드를 활용하여 쓰레드 작업 단위를 위한 메모리까지 설정한다.
		// 다른 쓰레드와 힙메모리 및 메소드 영역을 공유 할 수 있게 된다.
		// 작업을 위한 메모리의 설정이 끝나면 run 메소드에 작성된 코드가 실행 된다.
		
		//우선순위는 절대적인 기준은 아니다..
		elt.setPriority(Thread.MAX_PRIORITY);	//10점( 우선순위가 가장 높음 )
		kt.setPriority(Thread.MIN_PRIORITY); // 1점  ( 우선순위가 가장 낮음 )
		
		elt.start();
		kt.start();
		
		//1) 영어 대문자 출력하기
		for(char ch = 'A'; ch <= 'Z'; ch++){
			
//			try {
//				Thread.sleep(100);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
			
			System.out.println("대문자 : " + ch);
		}
		
		//다른 쓰레드가 끝나길 기다린다
		
		//block상태의 일종
		elt.join();	//elt 쓰레드가 끝날 때 까지 아랫쪽으로 못넘어감
		kt.join();  // kt 쓰레드가 끝날 때 까지 아랫쪽으로 못넘어감
		
		System.out.println("프로그램 종료");
		
//		//2) 영어 소문자 출력하기
//		for(char ch = 'a'; ch <= 'z'; ch++){
//			System.out.println("\t\t소문자 : " + ch);
//		}
		
//		//3) 한글 출력하기
//		for(char ch = 'ㄱ'; ch <= 'ㅎ'; ch++){
//			System.out.println("\t한  글 : " + ch);
//		}
		
	}

}
