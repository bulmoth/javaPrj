package com.kh.main;

import java.util.Random;
import java.util.Scanner;
import com.kh.obj.*;
import com.kh.obj.Character;

public class Run {
	
	public static Scanner sc = new Scanner(System.in);
	private static String result = "";
	
	public static void main(String[] args) {
		//동물의 숲 캐릭터 커스터마이징하기
		
		//Object
		Character[] ch = new Character[3];
		ch[0] = new Eye();
		ch[1] = new Hair();
		ch[2] = new Nose();
		Random r = new Random();
		
		System.out.println("비가 내리는 날 당신은 택시에 올라탔다...");
		
		//default Question
		result += ((Eye) ch[0]).starting();	//총기
		result += ((Hair) ch[1]).rain();		//곱슬기
		result += ((Eye) ch[0]).typhoon();	//속눈썹길이
		result += ((Nose) ch[2]).window();	//코모양
		result += ((Hair) ch[1]).hurry();	//개털
		result += ((Nose) ch[2]).meat();		//지성 건성
		
		//random Question
		int select = r.nextInt(2);
		char sky = ch[r.nextInt(3)].sky();
		String sleep = ch[r.nextInt(3)].sleep();
		
		switch(select) {
		case 0:
			
		}
		
		((Hair) ch[1]).hair()
		
		System.out.println("\n자, 마을에 도착했어. 너의 새로운 출발을 응원할게.");
		System.out.println("\n\n당신은 " + result + "모습을 가진 사람이 되었습니다.");
		
	}//main

}//class
