package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuHamburger {
	
	//������ ( == �⺻������)			//public className(){}
	public MenuHamburger() {
		
	}
	
	Scanner sc = new Scanner(System.in);
	
	//�ܹ��� �޴� �����ֱ�
	public void showMenuHam() {
		System.out.println("==========�ܹ���==========");
		System.out.println("1. �Ұ�� ���� (5000)");
		System.out.println("2. Ÿ�� ���� (8000)");
		System.out.println("3. ¡�� ���� (7000)");
		
		int menu = Integer.parseInt(sc.nextLine());	//String -> int
		
		switch(menu) {
		case 1:
			Main.total += 5000;
			Main.menuAll += " �Ұ�� ����";
			System.out.println("�Ұ�� ���� (5000��) �� �����ϼ̽��ϴ�.");
			break;
		case 2:
			Main.total += 8000;
			Main.menuAll += " Ÿ�� ����";
			System.out.println("Ÿ�� ���� (8000��) �� �����ϼ̽��ϴ�.");
			break;
		case 3 :
			Main.total += 7000;
			Main.menuAll += " ¡�� ����";
			System.out.println("¡�� ���� (7000��) �� �����ϼ̽��ϴ�.");
			break;
		default :
			System.out.println("�׷� �ܹ��� ����");
		}
		
	}

}//class
