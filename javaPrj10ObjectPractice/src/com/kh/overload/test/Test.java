package com.kh.overload.test;

public class Test {
	
	/*
	 * 생성자
	 * 
	 * [접근제한자] 클래스명(..){객체가 생성되는 순간, 실행하고싶은 내용}
	 * 
	 * 객체를 생성하려면 생성자를 호출해야 한다.
	 */
	
	//기본 생성자
	public Test() {
		System.out.println("객체 태어남 ==========");
		this.name = "신현지";		//값을 내가 초기화 해줄 수 있음
		hi();
		System.out.println("객체 생성자 종료 -------");
	}
	
	//생성자 오버로딩
	public Test(String s) {
		System.out.println("오버로딩된 생성자 호출됨 ~~~~~~~");
		System.out.println("생성자가 전달받은 s ::: " + s);
		this.name = s;
		System.out.println("오버로딩된 생성자 호출 종료됨 ~~~");
	}
	
	//data
	public String name;		//여기다 넣어줘도 똑같은 결과가 나오지만,,,생성자 안에서만 써야하는 이유가 있긴 함.
	
	public void hi() {
		System.out.println("hi");
	}
	
	public void hi(String str) {	//매개변수만 달라졌는데 다른 애로 취급
		System.out.println("hi " + str);
	}

}
