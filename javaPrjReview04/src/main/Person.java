package main;

public class Person implements Runnable{

	@Override
	public void run() {
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : ��ü �ȿ� �������̵� �� �޼ҵ�...");
		
	}

}
