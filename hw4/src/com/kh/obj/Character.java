package com.kh.obj;

import com.kh.main.Run;

public class Character {
	
	//data
	private char color;
	private String len;
	private String answer;
	
	//Constructor
	public Character() {
		this.color = 'K';
		this.len = "-";
	}
	
	//getter setter
	public char getColor() {
		return this.color;
	}
	public void setColor(char color) {
		this.color= color; 
	}
	
	public String getLen() {
		return this.len;
	}
	public void setLen(String len) {
		this.len = len;
	}
	
	//method
	public char sky() {
		System.out.println("\n지금 하늘 무슨 색으로 보여?");
		System.out.println("-붉은색\t-검은색\t-노란색");
		
		answer = Run.sc.nextLine();
		
		switch(answer) {
		case "붉은색" :
			return 'R';
		case "검은색" :
			return 'K';
		case "노란색" :
			return 'Y';
		default :
			return 'B';
		}
	}//sky
	
	public String sleep() {
		System.out.println("\n오래 자는 편이야?");
		System.out.println("-응\t-아니");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("응")) {
			return "+";
		}else {
			return "-";
		}
	}//sleep

}//class
