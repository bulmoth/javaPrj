package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	//메뉴판 보여주기
	public int showMenu() {
		System.out.println("===============MENU================");
		System.out.println("1. 햄버거");
		System.out.println("2. 음료");
		System.out.println("3. 사이드");
		
		int menu = Integer.parseInt(sc.nextLine());		//받은 값(문자열)을 정수(인티저)로 바꿔주는 친구
		//엔터키 때문에 nextLine을 씀. nextInt는 숫자만 가져옴, nextLine은 엔터키까지 가져옴...
		
		switch(menu) {
		case 1: return 1;
		case 2: return 2;
		case 3: return 3;
		default : System.out.println("error !!! (메뉴 선택 중 에러 발생)"); return -1;	//메뉴가 늘어날 것을 대비해서 안쓸 것 같은 -1을 씀,,,
		}//switch
			
		
	}//method showMenu
	
	//주문 더 할건지 물어보기
	public void more() {
		System.out.println("추가 주문을 하시겠습니까?(Y/N)");
		String answer = sc.nextLine();
//		if(answer.equals("Y")) {
//			Main.finish = false;
//		}else {		//UX(user experience)를 반영해서....N만으로 취소하는것보단 다른것들을 통해서도 취소가 가능하도록
//			Main.finish = true;
//		}
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true;	//삼항 연산자
	}

}//class
