package com.kh.obj;

import java.util.Date;
import com.kh.main.Run;

public class Eye extends Character{
	
	//Object
	Character c = new Character();
	
	//data
	private boolean isBright;		//총기 있, 없
	private int eyelash;			//속눈썹 길이(mm)
	private String answer = "";
	
	
	//Constructor
	public Eye() {
		this.isBright = true;
		this.eyelash = 5;
	}
	
	//getter setter
	public boolean getIsBright() {
		return this.isBright;
	}
	public void setIsBright(boolean isBright) {
		this.isBright= isBright; 
	}
	
	public int getEyelash() {
		return this.eyelash;
	}
	public void setEyelash(int eyelash) {
		this.eyelash = eyelash;
	}
	
	//method
	
	public String starting() {		//시작 - 총기
		Date today = new Date();
		System.out.println("\n저 손님...");
		System.out.println("오늘이 " + today + " 맞나?");
		System.out.println("-맞아\t-틀려");
		
		answer = Run.sc.nextLine();
		
		if(answer.equals("맞아")) {
			this.isBright = true;
			System.out.println("그럼 됐어.\n원래 이 시계가 자주 먹통이 되거든.");
		}else {
			this.isBright = false;
			System.out.println("그래?\n그럴 리가 없는데...");
		}
		
		if(isBright) {
			return "총기가 있는 ";
		}else {
			return "총기가 없는 ";
		}
	}//starting
	
	public String typhoon() {		//눈썹 길이
		System.out.println("\n 태풍이 온다던데...");
		System.out.println("비가 몇미리나 올까?");
		
		answer = Run.sc.nextLine();
		
		this.eyelash = Integer.parseInt(answer);
		return Integer.toString(eyelash) + "mm의 속눈썹을 가진 ";
	}//typhoon
	
	@Override
	public String len() {		//눈 크기
		switch(super.len()) {
		case "+" :
			return "큰 눈의 ";
		case "-" :
			return "작은 눈의 ";
		default :
			return "이도저도 아닌 눈의 ";	
		}
	}//len
	
	@Override
	public String color() {		//눈색
		switch(super.color()) {
		case "R" :
			return "붉은색 눈의 ";
		case "Y" :
			return "노란 눈의 ";
		case "K" :
			return "검은 눈의 ";
		default :
			return "푸른 눈의 ";
		}
	}//color
	
	
}//class
