package main;

import util.Util;
import view.MemberView;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== MVC 프로젝트 =====");
		
		System.out.println("1. 회원");
		System.out.println("2. 관리자");
		System.out.println("3. 공지사항");
		System.out.println("4. 갤러리");
		
		int select = Util.scanInt();
		MemberView mview = new MemberView();
		
		switch(select) {
		case 1: mview.showMenu(); break;
		case 2: break;
		case 3: break;
		case 4: break;
		}

	}

}
