package com.kh.thread;

public class Factory {
	
	public synchronized void methodA() {
	      System.out.println("A called...");
	      notify();
	      System.out.println("AAAAA");
	      try {
	         wait(500);
//	    	 Thread.sleep(500);	//��� ������� notify �� �ٽ� ������·� ������ �� ����
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
