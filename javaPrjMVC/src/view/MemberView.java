package view;

import member.MemberController;
import util.InputUtil;

public class MemberView {

	//ȸ�� ���� �޴�
	public void showMenu() {
		
		System.out.println("===== ȸ�� =====");
		
		System.out.println("1. ȸ������");		//�α��� X
		System.out.println("2. �α���");		//�α��� X
		System.out.println("3. ����������");	//�α��� O
		System.out.println("4. ȸ��Ż��");		//�α��� O
		
		int menu = InputUtil.scanInt();
		switch(menu) {
		case 1: new MemberController().join(); break;
		case 2: new MemberController().login();  break;
		case 3: new MemberController().edit(); break;
		case 4: new MemberController().quit(); break;
		}
		
	}

}
