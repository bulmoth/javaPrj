package com.kh.obj;

import com.kh.main.Run;

public class Hair extends Character{
	
	//Object
	Character c = new Character();
	
	//data
	private boolean isCurl;		//곱슬, 직모
	private boolean isBususu;	//개털인지 아닌지
	private String answer = "";
	
	//Constructor
	public Hair() {
		this.isCurl = false;
		this.isBususu = false;
	}
	
	//getter setter
	public boolean getIsCurl() {
		return this.isCurl;
	}
	public void setIsCurl(boolean isCurl) {
		this.isCurl= isCurl; 
	}
	
	public boolean getIsBususu() {
		return this.isBususu;
	}
	public void setIsBususu(boolean isBususu) {
		this.isBususu = isBususu;
	}
	
	//method
	public String rain() {		//곱슬기
		System.out.println("\n비가 많이 내리네...");
		System.out.println("비 내리는 날 좋아해?");
		System.out.println("-응\t-아니");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("응")) {
			this.isCurl = false;
			System.out.println("그렇구나. 역시 빗소리는 듣기가 좋지.");
		}else {
			this.isCurl = true;
			System.out.println("그렇구나. 축축해서 별로긴 하지.");
		}
		
		if(isCurl) {
			return "곱슬인, ";
		}else {
			return "직모인, ";
		}
	}//rain
	
	public String hurry() {		//개털
		System.out.println("\n땀을 많이 흘리네. 뛰어왔나봐?");
		System.out.println("-응\t-아니");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("응")) {
			this.isBususu = true;
			System.out.println("어쩐지...에어컨 좀 틀어줄게.");
		}else {
			this.isBususu = false;
			System.out.println("그래? 히터가 틀어져 있었나보다.");
		}
		
		if(isBususu) {
			return "어수선한, ";
		}else {
			return "차분한, ";
		}
	}//hurry
	
	@Override
	public String len() {		//머리길이
		switch(super.len()) {
		case "+" :
			return "긴 머리의 ";
		case "-" :
			return "짧은 머리의 ";
		default :
			return "이도저도 아닌 머리의 ";	
		}
	}//hairL
	
	@Override
	public String color() {		//머리색
		switch(super.color()) {
		case "R" :
			return "붉은색 머리칼의 ";
		case "Y" :
			return "노란 머리칼의 ";
		case "K" :
			return "검은 머리칼의 ";
		default :
			return "흰 머리칼의 ";
		}
	}//hairC
	

}//class
