package menu;

import java.util.Scanner;

public class Menu {
	
	//�޼ҵ� == ���� ==> �޼ҵ� �� �ۼ���, ���� ���·� �ۼ��ϼ���
	//�޴� �����ִ� �޼ҵ�
	public void showMenu() {
		//�޴� �����ֱ�
		System.out.println("1. ȸ������");
		System.out.println("2. �����ϱ�");
		System.out.println("3. ȸ������");
		System.out.println("4. ȸ������");
		System.out.println("5. ȸ������");
	}
	
	//�޴����� �Է¹ޱ�
	public String inputMenu() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

}
