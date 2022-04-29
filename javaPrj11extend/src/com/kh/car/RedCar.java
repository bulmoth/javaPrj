package com.kh.car;

public class RedCar extends Car {
	
	//홍차 고유의 데이터, 메소드 작성
	
//	//기본 생성자
//	public RedCar() {
//		super();	//상속관계가 없었을 때 원래는 이런 코드가 들어있음. 이때의 부모 클래스는 Object 라는 클래스...자바의 모든 클래스들은 Object 클래스의 후손임
//	}
	
	public RedCar(String color, int speed, int price) {
		//부모 클래스 생성
		super(color, speed, price); 	//부모 클래스의 생성자(매개변수 3개인) 를 호출		
		//부모 객체가 먼저 있어야 자식 객체가 생성될 수 있음		(//기본생성자가 있을 시 생략가능(다른 생성자로 부모 안만들어도 될 경우))
//		//this(); 이런것도 가능,,,현재 클래스의 생성자 호출
		
	}

	//홍차 고유 메소드 
	public void sayRed() {
		System.out.println("홍홍홍");
	}
	
	//오버리이딩 == Override	//부모 클래스의 메소드를 재정의 하는 것
	//@Override == 오버라이드 어노테이션 : 사람한테 알려주려고, 컴퓨터한테 에러 판단 해달라고
	@Override	//왜 이걸 작성할까요?? 알려주려고. 누구한테?? 사람, 컴퓨터
	public void startCar() {
		System.out.println("홍차 시동 걸었음");
	}
	
	@Override
	public void stop() {
		System.out.println("홍차만의 브레이크 기능");
	}
	
	@Override
	public void go() {
		System.out.println("홍차의 악셀");
	}

}
