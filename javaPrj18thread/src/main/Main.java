package main;

public class Main {

	public static void main(String[] args) {
		
//		String name1 = Thread.currentThread().getName(); 	//Thread Class에서 currentThread method 의 결과의 getName을 하라는 뜻
//		System.out.print(name1 + " : ");
//		System.out.println("===== 쓰레드 =====");
//		
//		Thread t = new TestThread();
//		String name2 = t.getName();	//t 가 가진 이름을 가져옴
//		System.out.print(name2 + " : ");
//		t.start();		//t 가 가지고 있는 run 메소드를 실행....
		
		
		
		
		
		//쓰레드 생성방법 3가지
		//쓰레드 시작 방법 (start)
		//run 으로 호출하면, 새로운 쓰레드가 생성되지 않음
		
		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		
		System.out.println("===== 쓰레드 =====");
		
		//extends Thread 객체를 활용하여 쓰레드 생성
		Thread t1 = new MyThread();		//관리하기 편하고 수정을 덜 하기 위해서 쓰레드로 받음. SOLID(객체지향 설계5원칙)라는거에 따라서 부모타입을 받아야함...개방폐쇄...?이런게 있대...
		t1.start();		//위에서 생성한 쓰레드가 일을 함
//		t1.run();		//이러면 메인 쓰레드에서 작업을 함
		
		//implements Runnable 객체를 활용하여 쓰레드 생성
		Thread t2 = new Thread(new MyRunner());
		t2.start();
		
		//람다식(lambda) 을 활용하여 쓰레드 생성
		Thread t3 = new Thread(
								() ->{ 
									System.out.print(Thread.currentThread().getName() + " : ");
								System.out.println("이게 람다식...");
								});
		t3.start();
		
		
		
		
		
		
		

	}

}//class
