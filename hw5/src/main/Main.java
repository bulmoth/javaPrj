package main;

import util.Util;
import view.MemberView;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== MVC ������Ʈ =====");
		
		System.out.println("1. ȸ��");
		System.out.println("2. ������");
		System.out.println("3. ��������");
		System.out.println("4. ������");
		
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
