package kr.co.smh.example.thread.classes;

public class Thread2 extends Thread {

	private ShareObj1 obj;

	public Thread2(ShareObj1 obj) {
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
//		obj.isChange = true;

		synchronized (obj) {
		
			for (int i = 0; i < 2000; i++) {
				obj.num--;
			}
			System.out.println("감소 끝 : " + obj.num);

		}
		
		

//		obj.isChange = false;

	}

}
