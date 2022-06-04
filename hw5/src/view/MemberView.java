package view;

import member.MemberController;
import util.Util;

public class MemberView {

	public void showMenu() {
		
System.out.println("===== 회원 =====");
		
		System.out.println("1. 회원가입");		
		System.out.println("2. 로그인");		
		System.out.println("3. 마이페이지");	
		System.out.println("4. 회원탈퇴");		
		
		int menu = Util.scanInt();
		MemberController mc = new MemberController();
		
		switch(menu) {
		case 1: mc.join(); break;
		case 2: mc.login();  break;
		case 3: mc.edit(); break;
		case 4: mc.quit(); break;
		}
		
	}
	
	

}
