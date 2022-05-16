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
	
	//NAME field가 public에다가 static이라 굳이 필요는 없지만 getter 작성 가능하니까 해봄,,,
	public String getName() {
		return NAME;
	}

	//method
	public void walk() {
		
	}


}
