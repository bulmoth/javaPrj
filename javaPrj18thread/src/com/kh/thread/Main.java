package com.kh.thread;

public class Main {
	
	public static final Factory factory = new Factory();

	public static void main(String[] args) {
		
		System.out.println("===== ������ �׽�Ʈ =====");
		//group (�����带 �׷������ ��� ����ϰ� ���ִ°�), pool (�̸� �����带 �������� ������ ���� ���), priority(�켱���� ����)
		
		//start, run
		//sleep : ������ ���
		//stop(���� �Ⱦ�) :������ ����...�����尡 ���� �ִ� �ڿ��� �Ҿ����� ä�� �������� �� �־ �Ⱦ�...����� flag �̿� 
		//interrupt : � �����带 �����Ͽ� Exception ������ ��. �� �����尡 �������̶�� �ҿ����. �ٵ� �� �����尡 wait ���·� ���� ����, ���� �߻�
		//wait : sleep�̶� ����� (����ȭ ���� ���̰� ����) >> ����� ȹ��, lock ����
		//notify||notifyAll : ���ǿ� wait �ϴ� �ֵ� �ٽ� �� �϶�� �����
		//state : �������� ����(����, ����, ���, ����)
		//join : �ٸ� ������ ��ٷ���
		//yield : �ٸ� ���������� ��ǻ�� �ڿ� �� �� �ְ� �纸�Ѵ�
		//daemon : �ٸ� �����忡 ���ӵǴ� ������(�θ� �����尡 ����Ǹ� ���� �����嵵 ����), ó������ ���󾲷���� ������־�� ��
		
		
		
		
		
		
//		//10�� ī��Ʈ �ٿ� �ϴ� ���α׷�
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			//���� ������ �����ͼ�, �� ������ ����, 1�� �ֹ�����...
//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("���� �޼��� ::: " + e.getMessage());
//			}  		//����ó�� �������
//		}
//		System.out.println("�����");
		
//		test1();
		test2();
		
		
		
		

	}//main

	private static void test1() {	//main thread�� �д� method
		
		System.out.println("===== interrupt =====");
		
		//MyRunner �� �̿��ؼ� ������ ����
		Thread t1 = new Thread(new MyRunner());
		t1.start();
		
		t1.interrupt();
		
	}
	
	private static void test2() {
		
		System.out.println("===== notify test =====");
		
		Thread t1 = new Thread(/* run �޼ҵ� == ���丮�� methodA �� ��� ȣ��*/new RunnerMethodA());
		Thread t2 = new Thread(/* run �޼ҵ� == ���丮�� methodB �� ��� ȣ��*/new RunnerMethodB());
		
		t1.start();	//A
		t2.start(); //B
		
	}
	
	
	
}//class
