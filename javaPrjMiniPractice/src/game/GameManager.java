package game;

import java.util.Scanner;

import util.InputUtil;

public class GameManager {
	
	public void gameStart() {
		//��ȣ�� ���� �ϱ�
		System.out.println("1. ���ٿ� ����");
		System.out.println("2. ������");
		System.out.println("3. ��");
		System.out.println("4. ��ġ");
		System.out.println("5. �ξ�");
		System.out.print("���� ��ȣ ���� : ");
		
//		Scanner sc = new Scanner(System.in);
//		String gameNumStr = sc.nextLine();
//		int gameNum = Integer.parseInt(gameNumStr);
		
		int gameNum = InputUtil.inputInt();
		
		switch(gameNum) {
		case 1://UpDownGame
			updownGameStart();
			break;
		case 2:
			break;
		case 3:
			break;
		default ://error~~
		}
	}
	
	private void updownGameStart() {
		System.out.println("1~100 ������ ���ڸ� �ϳ� ������");
		//��ǻ�� ���� ���� ����
		
		//1.���ٿ� ��, ��� ���
		//2.�Է� �ޱ�
		//1, 2�� ���ѹݺ�(���� ������)
		
		System.out.println("����� �̰������~~~~");
		
		//���� ��� ���� �ʿ�?
		//���� �޼ҵ� ȣ��
	}

}
