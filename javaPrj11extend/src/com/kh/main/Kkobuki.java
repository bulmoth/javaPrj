package com.kh.main;

public class Kkobuki {
	
	//생성자
	public Kkobuki(int l, char t) {
		this.level = l;
		this.type = t;
	}
	
	//데이터
	private final String name = "꼬북이";
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
		System.out.println("꼬북이 몸통 박치기 !!!");
	}
	
	//물대포
	public void waterCanon() {
		System.out.println("물대포 ~!~~");
	}
	
	//거품세례
	public void bubble() {
		System.out.println("거품세례 ~!~!~!");
	}
	

}
