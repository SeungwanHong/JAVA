package kr.co.smh.example;

import kr.co.smh.example.thread.classes.ShareObj1;
import kr.co.smh.example.thread.classes.Thread1;
import kr.co.smh.example.thread.classes.Thread2;

public class Main02 {

	public static void main(String[] args) {
		
		ShareObj1 obj = new ShareObj1();
		
		// 두개의 쓰레드가 하나의 객체를 공유
		Thread1 th1 = new Thread1(obj);
		Thread2 th2 = new Thread2(obj);
		
		th2.start();
		th1.start();
		
		
	}

}
