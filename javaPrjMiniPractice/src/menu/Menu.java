package menu;

import java.util.Scanner;

public class Menu {
	
	//메소드 == 동작 ==> 메소드 명 작성시, 동사 형태로 작성하세요
	//메뉴 보여주는 메소드
	public void showMenu() {
		//메뉴 보여주기
		System.out.println("1. 회원가입");
		System.out.println("2. 게임하기");
		System.out.println("3. 회원가입");
		System.out.println("4. 회원가입");
		System.out.println("5. 회원가입");
	}
	
	//메뉴선택 입력받기
	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}
