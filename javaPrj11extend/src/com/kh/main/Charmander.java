package com.kh.main;

public class Charmander {
	
	//생성자(기본생성자? 있으면 안돼....왜? 불완전한 객체를 만들 수 있기 때문에~)
	public Charmander(int level, char type) {
		this.level = level;
		this.type = type;
	}
	
	//데이터
	private final String name = "파이리";
	private int level;
	private char type;
	
	//메소드
	
	public int getLevel() {
		return this.level;
	}
	
	public void setLevel(int level) {
		this.level = level;
	}
	
	public char getType() {
		return this.type;
	}
	
	public void setType(char type) {
		this.type = type;
	}
	
	//몸통박치기
	public void bodyAttack() {
		System.out.println("파이리 몸통 박치기 !!!");
	}
	
	//전광석화
	public void speedAttack() {
		System.out.println("전광석화 !!!");
	}
	
	//불꽃세례
	public void fire() {
		System.out.println("불꽃세례 !!!");
	}

}
