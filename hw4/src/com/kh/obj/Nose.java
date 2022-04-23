package com.kh.obj;

import com.kh.main.Run;

public class Nose extends Character{
	
	//Object
	Character c = new Character();
	
	//data
	private String shape;		//동그란 코, 세모난 코
	private boolean isOily;		//지성 건성
	private String answer = "";
	
	//Constructor
	public Nose() {
		this.shape = "동그란 코";
		this.isOily = false;
	}
	
	//getter setter
	public String getShape() {
		return this.shape;
	}
	public void setShape(String shape) {
		this.shape= shape; 
	}
	
	public boolean getIsOily() {
		return this.isOily;
	}
	public void setIsOily(boolean isOily) {
		this.isOily = isOily;
	}
	
	//method
	
	public String window() {		//코모양
		System.out.println("\n아까부터 창문을 열심히 보는 것 같던데...");
		System.out.println("-내가?\t-내가 좀?");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("내가?")) {
			this.shape = "동그란 코의 ";
			System.out.println("아니야? 내 착각인가...");
		}else {
			this.shape = "세모난 코의 ";
			System.out.println("눈 빠지겠더라.");
		}
		
		return this.shape;
	}//window
	
	public String meat() {		//지성 건성
		System.out.println("\n어제 맛있는 고기를 먹었는데 말이야...");
		System.out.println("너도 고기 좋아해?");
		System.out.println("-응\t-아니");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("응")) {
			this.isOily = true;
			System.out.println("역시. 맛잘알이구나.");
		}else {
			this.isOily = false;
			System.out.println("느끼해서 별로구나? 그럴 수 있지.");
		}
		
		if(isOily) {
			return "지성의 ";
		}else {
			return "건성의 ";
		}
	}//meat
	
	@Override
	public String len() {		//코 크기
		switch(super.len()) {
		case "+" :
			return "큰 코의 ";
		case "-" :
			return "작은 코의 ";
		default :
			return "중간 크기의 코의 ";	
		}
	}//len
	
	@Override
	public String color() {		//코 색
		switch(super.color()) {
		case "R" :
			return "붉은 코 ";
		case "Y" :
			return "노란 코 ";
		case "K" :
			return "검은 코 ";
		default :
			return "매부리 코 ";
		}
	}//color

}//class
