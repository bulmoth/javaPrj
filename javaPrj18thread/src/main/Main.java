package main;

public class Main {

	public static void main(String[] args) {
		
//		String name1 = Thread.currentThread().getName(); 	//Thread Class���� currentThread method �� ����� getName�� �϶�� ��
//		System.out.print(name1 + " : ");
//		System.out.println("===== ������ =====");
//		
//		Thread t = new TestThread();
//		String name2 = t.getName();	//t �� ���� �̸��� ������
//		System.out.print(name2 + " : ");
//		t.start();		//t �� ������ �ִ� run �޼ҵ带 ����....
		
		
		
		
		
		//������ ������� 3����
		//������ ���� ��� (start)
		//run ���� ȣ���ϸ�, ���ο� �����尡 �������� ����
		
		String name = Thread.currentThread().getName();
		System.out.print(name + " : ");
		
		System.out.println("===== ������ =====");
		
		//extends Thread ��ü�� Ȱ���Ͽ� ������ ����
		Thread t1 = new MyThread();		//�����ϱ� ���ϰ� ������ �� �ϱ� ���ؼ� ������� ����. SOLID(��ü���� ����5��Ģ)��°ſ� ���� �θ�Ÿ���� �޾ƾ���...�������...?�̷��� �ִ�...
		t1.start();		//������ ������ �����尡 ���� ��
//		t1.run();		//�̷��� ���� �����忡�� �۾��� ��
		
		//implements Runnable ��ü�� Ȱ���Ͽ� ������ ����
		Thread t2 = new Thread(new MyRunner());
		t2.start();
		
		//���ٽ�(lambda) �� Ȱ���Ͽ� ������ ����
		Thread t3 = new Thread(
								() ->{ 
									System.out.print(Thread.currentThread().getName() + " : ");
								System.out.println("�̰� ���ٽ�...");
								});
		t3.start();
		
		
		
		
		
		
		

	}

}//class
