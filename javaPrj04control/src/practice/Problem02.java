package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {

		// ���� �ϳ� �Է¹ް�, �Է¹��� ������ 7�� ������ "7�� ���"��� ���
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		
		if(x % 7 == 0) {	//x�� 7�� �������� �� �������� 0 �̶�� 7�� ���
			System.out.println("7�� ���");
		}else {
			System.out.println("7�� ����� �ƴ�");
		}
		
	}

}
