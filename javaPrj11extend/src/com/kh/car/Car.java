package com.kh.car;

/*
 * 추상클래스
 * - abstract 키워드를 붙여주면 됨
 * - 0 개 이상의 추상메소드를 가지고 있음
 * - 객체화 불가능
 */

public abstract class Car {
	
	//기본 생성자
	public Car() {
		//super();
	}
	
	//생성자
	public Car(String color, int speed, int price) {
		this.color = color;
		this.speed = speed;
		this.price = price;
	}
	
	//data
	
	private String color = "부모색상";	//차량 색상
	private int speed = -1;		//속도
	private int price = -1;		//가격
	
	//method
	
	/*
	 * 추상 메소드
	 * - abstract 키워드를 붙여주면 됨
	 * - 메소드 바디가 존재하지 않음
	 */
	//시동 걸기
	public abstract void startCar();
	
	//브레이크 밟기
	public abstract void stop();
	
	//악셀 밟기
	public abstract void go();
	
	//getter / setter
	public String getColor() {
		System.out.print("Car Class getter called...");
		return this.color;
	}
	
	public int getSpeed() {
		System.out.print("Car Class getter called...");
		return this.speed;
	}
	
	public int getPrice() {
		System.out.print("Car Class getter called...");
		return this.price;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}//class
