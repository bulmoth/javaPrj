package main;

import game.GameManager;
import member.MemberController;
import menu.Menu;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 미니 연습 ======");
		
		Menu menu = new Menu();
		menu.showMenu();
		String menuVal = menu.inputMenu();
		
		//1번 로직 처리 == 회원가입
		if(menuVal.trim().equals("1")) {
			new MemberController().memberJoin();
		}else if(menuVal.trim().equals("2")) {
			//업다운 게임
			new GameManager().gameStart();
		}
		

	}

}
