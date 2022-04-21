package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuHamburger {
	
	//생성자 ( == 기본생성자)			//public className(){}
	public MenuHamburger() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	//햄버거 메뉴 보여주기
	public void showMenuHam() {
		System.out.println("==========햄버거==========");
		System.out.println("1. 불고기 버거 (5000)");
		System.out.println("2. 타워 버거 (8000)");
		System.out.println("3. 징거 버거 (7000)");
		
		int menu = Integer.parseInt(sc.nextLine());	//String -> int
		
		switch(menu) {
		case 1:
			Main.total += 5000;
			Main.menuAll += " 불고기 버거";
			System.out.println("불고기 버거 (5000원) 을 선택하셨습니다.");
			break;
		case 2:
			Main.total += 8000;
			Main.menuAll += " 타워 버거";
			System.out.println("타워 버거 (8000원) 을 선택하셨습니다.");
			break;
		case 3 :
			Main.total += 7000;
			Main.menuAll += " 징거 버거";
			System.out.println("징거 버거 (7000원) 을 선택하셨습니다.");
			break;
		default :
			System.out.println("그런 햄버거 없음");
		}
		
	}

}//class
