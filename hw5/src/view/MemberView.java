package view;

import member.MemberController;
import util.Util;

public class MemberView {

	public void showMenu() {
		
System.out.println("===== ȸ�� =====");
		
		System.out.println("1. ȸ������");		
		System.out.println("2. �α���");		
		System.out.println("3. ����������");	
		System.out.println("4. ȸ��Ż��");		
		
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
