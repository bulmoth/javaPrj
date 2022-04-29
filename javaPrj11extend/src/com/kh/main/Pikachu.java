package com.kh.main;

public class Pikachu {
	
	//생성자가 아무것도 없으면, JVM이 기본 생성자를 만들어줌
	
//	//생성자0
//	public Pikachu() {
//		
//	}
	
	//생성자1
	public Pikachu(int x, char ch) {
		this.level =x;
		this.type = ch;	//E == 전기타입
	}
	
//	//생성자2
//	public Pikachu(int num, char ch, String msg) {
//		this.level = num;
//		this.type = ch;
//		System.out.println(msg);
//	}
	
	//데이터
	private final String name = "피카츄";
	private int level;	//레벨
	private char type;	//E, W, F 타입(전기, 물, 불)
	
	
	//동작(메소드)
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
			System.out.println("피카츄 몸통 박치기 ~~!~~!~");
		}
	
	//백만볼트
	public void millionVolt() {
		System.out.println("백만볼트 ~~~!~~!~");
	}
	
	//썬더볼트
	public void thunderVolt() {
		System.out.println("썬더볼트 ~~!~!~");
	}
	
	

}
