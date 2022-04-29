package com.kh.car;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		1. ���
		����: �θ�Ŭ������ data, method �޾ƿ�
		�θ�ü�� �����ؾ� �ڽİ�ü�� ������ �� ����
		���� : extends
		
		* ��� Ŭ������ ���� ���� �θ�� Object Ŭ�����̴�.

		2. �������̵�
		���� : �θ�Ŭ������ �޼ҵ� ������(==�޼ҵ��� �ٵ� �κ��� �ٽ� �ۼ��ϴ°�)
		�ۼ��� : �������̵� �Ϸ��� �޼ҵ� �����ٰ� @Override ��� ����

		3. ������
		* �θ�Ŭ���� Ÿ������ �ڽ� Ŭ���� Ÿ���� ��ü�� ���� �� �ִ�.
		ex) Car c = new RedCar();

		4. ���ε� (���� ���� ��. �̷� ���� �� �ֱ��� �ϰ� �ѱ�� ��)
		�������ε�
		�������ε�

		5. super 
		super�� �θ� ����Ű�� Ű����
		(this �� �ڱ��ڽ��� ����Ű�� Ű����)

		6. getter/setter
		private �ʵ� (==�������� == �ν��Ͻ� ���� == ��ü���� == ������� == Ŭ��������)
		���������ڰ� private �� �ֵ��� ������� ����ϱ� ���ؼ� ����� �޼ҵ�
		*/
		
		System.out.println("=====���=====");
		
		Car rc = new RedCar("����", 100, 3000);	//�ڽ� Ŭ�����̱� ������ �θ� Ŭ���� Ÿ������ ���� �� ����		//�������ε�(static binding)
		rc.startCar();		//�ڽĿ��� �������̵� �� �޼ҵ尡 ����. rc�� ��� ��ü�� RedCar�̱� ������ �ڽ� �޼ҵ尡 ����.		//�������ε�(dynamic binding)
//		System.out.println(rc.getColor());
//		System.out.println(rc.getSpeed());
//		System.out.println(rc.getPrice());
		//rc.sayRed();
		
		Car rc2 = new GreenCar("���", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("����", 300, 9900);
		rc3.startCar();
		
		
		//��ü ��(instansceof)
		//A instanceof B : A �� B Ÿ���� �´��� Ȯ���Ͽ� boolean Ÿ���� �����͸� ����
		
//		if(rc instanceof Object) {
//			System.out.println("��������");
//		}else {
//			System.out.println("����Ʋ��");
//		}
		

		
		
		

	}//main

}//class
