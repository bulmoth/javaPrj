package com.kh.main;

public class Run {

	public static void main(String[] args) {

		//���ǹ�
		//���ǿ� ������ �����ϰ� ����.
		
		/*
		 * if�� ǥ���� : 
		 * if(���ǽ�){������ ����}
		 * 
		 * ���ǽĿ� �� ����
		 * > true / false�� ���� �� �ֵ��� �ۼ�
		 */
		
		
		/*
		int userInput = 1;
		
		if(userInput == 1) {	//������ǲ�� 1�� ���ٸ�
			System.out.println("¥��� �ֹ� �Ϸ�");
		}
		
		if(userInput == 2) {	//������ǲ�� 2�� ���ٸ�
			System.out.println("«�� �ֹ� �Ϸ�");
		}
		*/
		
		
		
		//num�̶�� ������ �����, num ���� ������? ����Դϴ�. ���, ������� �����Դϴ�. ���
		/*
		int num = -1;
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}
		
		if(num < 0) {
			System.out.println("�����Դϴ�.");
		}
		
		if(num == 0) {
			System.out.println("0 �Դϴ�.");
		}
		*/
		
		/*
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}
		else{
			System.out.println("�����Դϴ�.");
		}
		*/
		
		
		/*
		//num�̶�� ������ �����, num ���� ������? + ���, 0�̶�� ZERO ���, ������� - ���
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("+");
		}
		else if(num < 0) {
			System.out.println("-");
		}
		else if(num == 0) {
			System.out.println("0");
		}
		*/
		
		//switch
		/*
		 * switch(?){
		 * 	case ? : ���౸��;
		 * 	case ? : ���౸��;
		 * 
		 * 	...
		 * 
		 * 	default : ���౸��;
		 * }
		 */
		int x = 3;
		
		switch(x) {
		case 1 : System.out.println("��"); break;
		case 2 : System.out.println("��"); break;
		case 3 : System.out.println("��"); break;
		default : System.out.println("������ ����");
		}
		
		
	}

}
