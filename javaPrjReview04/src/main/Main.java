package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("=========������==========");
		
		for(int i=0;i<10;i++) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + i);
		}
		
		//Thread
		//���ٽ����� ���� ����
		Thread t1 = new Thread(()->{
			String name = Thread.currentThread().getName();
			System.out.println(name + " : ���ٽ����� ���� ����...");
		});
		
		//��ü�� ���� ����
		Thread t2 = new Thread(new Person());
		
		//�͸� Ŭ������ ��ü �����Ͽ� ���� ����
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				
				String name = Thread.currentThread().getName();
				System.out.println(name + " : �͸� Ŭ������ �ۼ��� run...");
				
			}
			
		});
		
		
		t1.start();	//�ϰ� ���� run ������
		t2.start();
		t3.start();

	}

}
