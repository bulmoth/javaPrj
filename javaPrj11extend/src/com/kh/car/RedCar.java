package com.kh.car;

public class RedCar extends Car {
	
	//ȫ�� ������ ������, �޼ҵ� �ۼ�
	
//	//�⺻ ������
//	public RedCar() {
//		super();	//��Ӱ��谡 ������ �� ������ �̷� �ڵ尡 �������. �̶��� �θ� Ŭ������ Object ��� Ŭ����...�ڹ��� ��� Ŭ�������� Object Ŭ������ �ļ���
//	}
	
	public RedCar(String color, int speed, int price) {
		//�θ� Ŭ���� ����
		super(color, speed, price); 	//�θ� Ŭ������ ������(�Ű����� 3����) �� ȣ��		
		//�θ� ��ü�� ���� �־�� �ڽ� ��ü�� ������ �� ����		(//�⺻�����ڰ� ���� �� ��������(�ٸ� �����ڷ� �θ� �ȸ��� �� ���))
//		//this(); �̷��͵� ����,,,���� Ŭ������ ������ ȣ��
		
	}

	//ȫ�� ���� �޼ҵ� 
	public void sayRed() {
		System.out.println("ȫȫȫ");
	}
	
	//�������̵� == Override	//�θ� Ŭ������ �޼ҵ带 ������ �ϴ� ��
	//@Override == �������̵� ������̼� : ������� �˷��ַ���, ��ǻ������ ���� �Ǵ� �ش޶��
	@Override	//�� �̰� �ۼ��ұ��?? �˷��ַ���. ��������?? ���, ��ǻ��
	public void startCar() {
		System.out.println("ȫ�� �õ� �ɾ���");
	}
	
	@Override
	public void stop() {
		System.out.println("ȫ������ �극��ũ ���");
	}
	
	@Override
	public void go() {
		System.out.println("ȫ���� �Ǽ�");
	}

}
