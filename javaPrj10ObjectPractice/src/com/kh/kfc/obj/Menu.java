package com.kh.kfc.obj;

import java.util.Scanner;

import com.kh.kfc.main.Main;

public class Menu {
	
	Scanner sc = new Scanner(System.in);
	
	//�޴��� �����ֱ�
	public int showMenu() {
		System.out.println("===============MENU================");
		System.out.println("1. �ܹ���");
		System.out.println("2. ����");
		System.out.println("3. ���̵�");
		
		int menu = Integer.parseInt(sc.nextLine());		//���� ��(���ڿ�)�� ����(��Ƽ��)�� �ٲ��ִ� ģ��
		//����Ű ������ nextLine�� ��. nextInt�� ���ڸ� ������, nextLine�� ����Ű���� ������...
		
		switch(menu) {
		case 1: return 1;
		case 2: return 2;
		case 3: return 3;
		default : System.out.println("error !!! (�޴� ���� �� ���� �߻�)"); return -1;	//�޴��� �þ ���� ����ؼ� �Ⱦ� �� ���� -1�� ��,,,
		}//switch
			
		
	}//method showMenu
	
	//�ֹ� �� �Ұ��� �����
	public void more() {
		System.out.println("�߰� �ֹ��� �Ͻðڽ��ϱ�?(Y/N)");
		String answer = sc.nextLine();
//		if(answer.equals("Y")) {
//			Main.finish = false;
//		}else {		//UX(user experience)�� �ݿ��ؼ�....N������ ����ϴ°ͺ��� �ٸ��͵��� ���ؼ��� ��Ұ� �����ϵ���
//			Main.finish = true;
//		}
		Main.finish = answer.equals("Y") || answer.equals("y") ? false : true;	//���� ������
	}

}//class
