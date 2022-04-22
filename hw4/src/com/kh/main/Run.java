package com.kh.main;

import java.util.Scanner;
import com.kh.obj.*;

public class Run {
	
	public static Scanner sc = new Scanner(System.in);
	public static String result = "";
	
	public static void main(String[] args) {
		//동물의 숲 캐릭터 커스터마이징하기
		
		System.out.println("비가 내리는 날 당신은 택시에 올라탔다...");
		
		Eye e = new Eye();
		Hair h = new Hair();
		Nose n = new Nose();
		
		result += e.starting();	//총기
		result += h.rain();		//곱슬기
		result += e.typhoon();	//속눈썹길이
		result += n.window();	//코모양
		result += h.hurry();	//개털
		result += n.meat();		//지성 건성
		
		System.out.println("\n자, 마을에 도착했어. 너의 새로운 출발을 응원할게.");
		System.out.println("\n\n당신은 " + result + "사람이 되었습니다.");
		
	}

}
