package com.kh.swy;

public class Person {
	
	//data
	public static final String NAME = "swy";
	private int age;
	
	public Person(int age) {
		this.age = age;
	}
	
	//getter
	public int getAge() {
		return age;
	}
	
	//setter
	public void setAge(int age) {
		this.age = age;
	}
	
	//NAME field�� public���ٰ� static�̶� ���� �ʿ�� ������ getter �ۼ� �����ϴϱ� �غ�,,,
	public String getName() {
		return NAME;
	}

	//method
	public void walk() {
		
	}


}
