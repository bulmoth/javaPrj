package com.kh.kfc.main;

import com.kh.kfc.obj.Menu;
import com.kh.kfc.obj.MenuBeverage;
import com.kh.kfc.obj.MenuHamburger;
import com.kh.kfc.obj.MenuSide;

public class Main {
	
	public static int total;
	public static String menuAll = "";	//�ʱⰪ�� null�̿��� "null + �ٸ����ڿ�" �� ��µǱ� ������ �� ���ڿ��� �ʱ�ȭ����
	public static boolean finish = false;

	public static void main(String[] args) {
		
		System.out.println("KFC �� ���Ű� ȯ���մϴ�. ");
		
		//�޴��� ��ü ����
		Menu menu = new Menu();
		MenuHamburger menuHam = new MenuHamburger();
		MenuBeverage menuBev = new MenuBeverage();
		MenuSide menuSide = new MenuSide();
		
		//�ݺ���(���� �޴� ������ ����)
		do {
			//�޴� ���� (��з�)
			int menuNum = menu.showMenu();
			
			
			if(menuNum == 1) {
				//�ܹ��� �޴��� �����ֱ�
				menuHam.showMenuHam();
			}else if(menuNum == 2) {
				//���� �޴��� �����ֱ�
				menuBev.showMenuBeverage();
			}else if(menuNum == 3) {
				//���̵� �޴��� �����ֱ�
				menuSide.showMenuSide();
			}else {
				//����ڰ� �߸�����
				System.out.println("���� �߸� ����");
			}
			
			//�ֹ� �� �Ұ���?
			menu.more();
		}while(!finish);
		
		
		
		//���� ��� ���
		System.out.println("�ֹ��Ͻ� �޴���" + Main.menuAll + " �Դϴ�.");
		System.out.println("�� ������ : " + Main.total + " �� �Դϴ�.");

	}//main

}//class