package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class MenuSide {
	
	Scanner sc = new Scanner(System.in);
	
	public void showMenuSide() {
		System.out.println("==========���̵�==========");
		System.out.println("1. ����Ƣ�� (3000)");
		System.out.println("2. �߲���Ƣ�� (2000)");
		System.out.println("3. ġ�ƽ (1000)");
		
		int menu = Integer.parseInt(sc.nextLine());
		
		switch(menu) {
		case 1: 
			Main.total += 3000;
			Main.menuAll += " ����Ƣ��";
			System.out.println("����Ƣ�� (3000��) �� �����ϼ̽��ϴ�.");
			break;
		case 2: 
			Main.total += 2000; 
			Main.menuAll += " �߲���Ƣ��";
			System.out.println("�߲���Ƣ�� (2000��) �� �����ϼ̽��ϴ�.");
			break;
		case 3:
			Main.total += 1000; 
			Main.menuAll += " ġ�ƽ";
			System.out.println("ġ�ƽ (1000��) �� �����ϼ̽��ϴ�.");
			break;
		default : 
			System.out.println("�׷� ���̵� ����");
		}
		
	}

}
