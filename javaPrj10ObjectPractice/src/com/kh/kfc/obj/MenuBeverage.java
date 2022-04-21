package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuBeverage {
	
Scanner sc = new Scanner(System.in);
	
	//햄버거 메뉴 보여주기
	public void showMenuBeverage() {
		System.out.println("==========음료==========");
		System.out.println("1. 콜라 (1000)");
		System.out.println("2. 환타 (1500)");
		System.out.println("3. 우유 (2000)");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1:
			Main.total += 1000; 
			Main.menuAll += " 콜라";
			System.out.println("콜라 (1000원) 을 선택하셨습니다.");
			break;
		case 2: 
			Main.total += 1500; 
			Main.menuAll += " 환타";
			System.out.println("환타 (1500원) 을 선택하셨습니다."); 
			break;
		case 3:
			Main.total += 2000; 
			Main.menuAll += " 우유";
			System.out.println("우유 (2000원) 을 선택하셨습니다."); 
			break;
		default :
			System.out.println("그런 음료 없음");
		}
		
	}

}
