package kr.co.smh.example.thread.classes;

public class Thread1 extends Thread {

	private ShareObj1 obj;

	public Thread1(ShareObj1 obj) {
		this.obj = obj;
	}

	@Override
	public void run() {

//		while (true) {
//			if (obj.isChange) {
//				System.out.println("thread 1 while");
//				continue;
//			} else
//				break;
//		}
//
//		obj.isChange = true;

		//1) 공유 객체 동기화
		// synchronized 블록을 활용한다.
		
		//obj 객체를 동기화 시키겠다.
		// 다른 쓰레드가 해당 객체를 사용 하고 있다면 사용을 다 끝날 때 까지 block 상태로 존재 하겠다.
		// 동기화 블록(임계영역 - Critical Section)
		synchronized (obj) {
			for (int i = 0; i < 2000; i++) {
				obj.num++;
			}
			System.out.println("증가 끝 " + obj.num);
		}
		
		

//		obj.isChange = false;

		
		
		
		
		
		
	};

}
