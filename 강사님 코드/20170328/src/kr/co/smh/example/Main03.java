package kr.co.smh.example;

import kr.co.smh.example.thread.classes.Toilet;
import kr.co.smh.example.thread.classes.ToiletThread;

public class Main03 {

	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		
		ToiletThread toiletThread1 = new ToiletThread(toilet, "A");
		ToiletThread toiletThread2 = new ToiletThread(toilet, "B");
		ToiletThread toiletThread3 = new ToiletThread(toilet, "C");

		toiletThread1.start();
		toiletThread2.start();
		toiletThread3.start();

		
		
	}
	
}
