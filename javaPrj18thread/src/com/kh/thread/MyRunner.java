package com.kh.thread;

public class MyRunner implements Runnable{

	@Override
	public void run() {
		
		boolean isFinish = false;
		int n = 0;
		while(!isFinish) {
			System.out.println(n++);
//			n += 1;
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				isFinish = true;
				System.out.println("flag ����� �ٲ�");
			}
		}
		
	}

}//class
