package com.kh.thread;

public class Main {
	
	public static final Factory factory = new Factory();

	public static void main(String[] args) {
		
		System.out.println("===== 쓰레드 테스트 =====");
		//group (쓰레드를 그룹단위로 묶어서 사용하게 해주는것), pool (미리 쓰레드를 만들어놓고 가져다 쓰는 방식), priority(우선순위 결정)
		
		//start, run
		//sleep : 쓰레드 재움
		//stop(이제 안씀) :쓰레드 종료...쓰레드가 물고 있는 자원이 불안정한 채로 남아있을 수 있어서 안씀...요새는 flag 이용 
		//interrupt : 어떤 쓰레드를 방해하여 Exception 던지게 함. 그 쓰레드가 실행중이라면 소용없음. 근데 그 쓰레드가 wait 상태로 가는 순간, 예외 발생
		//wait : sleep이랑 비슷함 (동기화 관련 차이가 있음) >> 모니터 획득, lock 여부
		//notify||notifyAll : 대기실에 wait 하는 애들 다시 일 하라고 명령함
		//state : 쓰레드의 상태(생성, 실행, 대기, 종료)
		//join : 다른 쓰레드 기다려줌
		//yield : 다른 쓰레드한테 컴퓨터 자원 쓸 수 있게 양보한다
		//daemon : 다른 쓰레드에 종속되는 쓰레드(부모 쓰레드가 종료되면 데몬 쓰레드도 종료), 처음부터 데몬쓰레드로 만들어주어야 함
		
		
		
		
		
		
//		//10초 카운트 다운 하는 프로그램
//		for(int i = 10; i > 0; i--) {
//			System.out.println(i);
//			//현재 쓰레드 가져와서, 그 쓰레드 한테, 1초 주무세요...
//			try {
//				Thread.currentThread().sleep(1000);
//			} catch (InterruptedException e) {
//				System.out.println("예외 메세지 ::: " + e.getMessage());
//			}  		//예외처리 해줘야함
//		}
//		System.out.println("끼요옷");
		
//		test1();
		test2();
		
		
		
		

	}//main

	private static void test1() {	//main thread가 읽는 method
		
		System.out.println("===== interrupt =====");
		
		//MyRunner 를 이용해서 쓰레드 생성
		Thread t1 = new Thread(new MyRunner());
		t1.start();
		
		t1.interrupt();
		
	}
	
	private static void test2() {
		
		System.out.println("===== notify test =====");
		
		Thread t1 = new Thread(/* run 메소드 == 팩토리의 methodA 만 계속 호출*/new RunnerMethodA());
		Thread t2 = new Thread(/* run 메소드 == 팩토리의 methodB 만 계속 호출*/new RunnerMethodB());
		
		t1.start();	//A
		t2.start(); //B
		
	}
	
	
	
}//class
