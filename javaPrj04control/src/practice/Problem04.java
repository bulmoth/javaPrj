package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		//���� �Է¹ް�, �ش� ���� ������ ����ϱ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �˰���� ���� ����ΰ���?(������ ���ÿ�) : ");
		int month = sc.nextInt();
		
//		if(month >= 3 && month <= 5) {
//			System.out.println("spring");
//		}else if(month >= 6 && month <= 8) {
//			System.out.println("summer");
//		}else if(month >= 9 && month <= 11) {
//			System.out.println("fall");
//		}else if(month >= 1 && month < 3 || month == 12) {
//			System.out.println("winter");
//		}else {
//			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//		}
		
		//switch�̿�
		switch(month) {
		case 12: 
		case 1: 
		case 2: System.out.println("winter"); break;
		case 3: 
		case 4: 
		case 5: System.out.println("spring"); break;
		case 6: 
		case 7: 
		case 8: System.out.println("summer"); break;
		case 9: 
		case 10: 
		case 11: System.out.println("fall"); break;
		default : System.out.println("�ش� ���� �������� �ʽ��ϴ�.");
		}
		
		
		
	}

}
