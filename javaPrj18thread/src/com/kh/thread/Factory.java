package com.kh.thread;

public class Factory {
	
	public synchronized void methodA() {
	      System.out.println("A called...");
	      notify();
	      System.out.println("AAAAA");
	      try {
	         wait(500);
//	    	 Thread.sleep(500);	//잠든 쓰레드는 notify 로 다시 실행상태로 변경할 수 없음
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }      
	   }
	   
	   public synchronized void methodB() {
	      System.out.println("B called...");
	      notify();
	      System.out.println("BBBBB");
	      try {
	         wait(500);
//	    	 Thread.sleep(500);
	      } catch (InterruptedException e) {
	         e.printStackTrace();
	      }   
	   }

}
