package com.kh.car;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		/*
		1. 상속
		정의: 부모클래스의 data, method 받아옴
		부모객체가 존재해야 자식객체도 존재할 수 있음
		사용법 : extends
		
		* 모든 클래스의 제일 위의 부모는 Object 클래스이다.

		2. 오버라이드
		정의 : 부모클래스의 메소드 재정의(==메소드의 바디 부분을 다시 작성하는것)
		작성법 : 오버라이드 하려는 메소드 위에다가 @Override 라고 적기

		3. 다형성
		* 부모클래스 타입으로 자식 클래스 타입의 객체를 받을 수 있다.
		ex) Car c = new RedCar();

		4. 바인딩 (뭔지 몰라도 됨. 이런 저런 용어가 있구나 하고 넘기면 됨)
		정적바인딩
		동적바인딩

		5. super 
		super는 부모를 가리키는 키워드
		(this 는 자기자신을 가리키는 키워드)

		6. getter/setter
		private 필드 (==전역변수 == 인스턴스 변수 == 객체변수 == 멤버변수 == 클래스변수)
		접근제한자가 private 인 애들을 편법으로 사용하기 위해서 만드는 메소드
		*/
		
		System.out.println("=====상속=====");
		
		Car rc = new RedCar("빨강", 100, 3000);	//자식 클래스이기 때문에 부모 클래스 타입으로 받을 수 있음		//정적바인딩(static binding)
		rc.startCar();		//자식에서 오버라이딩 된 메소드가 실행. rc에 담김 객체는 RedCar이기 때문에 자식 메소드가 실행.		//동적바인딩(dynamic binding)
//		System.out.println(rc.getColor());
//		System.out.println(rc.getSpeed());
//		System.out.println(rc.getPrice());
		//rc.sayRed();
		
		Car rc2 = new GreenCar("녹색", 200, 4000);
		rc2.startCar();
		
		Car rc3 = new WhatCar("검정", 300, 9900);
		rc3.startCar();
		
		
		//객체 비교(instansceof)
		//A instanceof B : A 가 B 타입이 맞는지 확인하여 boolean 타입의 테이터를 리턴
		
//		if(rc instanceof Object) {
//			System.out.println("ㅇㅇ맞음");
//		}else {
//			System.out.println("ㄴㄴ틀림");
//		}
		

		
		
		

	}//main

}//class
