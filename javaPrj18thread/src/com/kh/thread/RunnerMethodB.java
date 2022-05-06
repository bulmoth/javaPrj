package com.kh.thread;

public class RunnerMethodB implements Runnable{

	@Override
	public void run() {
		
		for(int i=0; i<10; i++) {

			Main.factory.methodB();
				
		}//for
		
	}//run

}//class
