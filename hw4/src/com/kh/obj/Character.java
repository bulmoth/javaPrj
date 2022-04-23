package com.kh.obj;

import com.kh.main.Run;

public class Character {
	
	//data
	private String color;
	private String len;
	private String answer;
	
	//Constructor
	public Character() {
		this.color = "K";
		this.len = "-";
	}
	
	//getter setter
	public String getColor() {
		return this.color;
	}
	public void setColor(String color) {
		this.color= color; 
	}
	
	public String getLen() {
		return this.len;
	}
	public void setLen(String len) {
		this.len = len;
	}
	
	//method
	public String color() {
		System.out.println("\n���� �ϴ� ���� ������ ����?");
		System.out.println("-������\t-������\t-�����");
		
		answer = Run.sc.nextLine();
		
		switch(answer) {
		case "������" :
			return "R";
		case "������" :
			return "K";
		case "�����" :
			return "Y";
		default :
			return "B";
		}
	}//sky
	
	public String len() {
		System.out.println("\n���� �ڴ� ���̾�?");
		System.out.println("-��\t-�ƴ�");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("��")) {
			return "+";
		}else {
			return "-";
		}
	}//sleep

}//class
