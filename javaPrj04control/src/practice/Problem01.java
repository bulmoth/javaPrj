package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		// ���� �ϳ��� �Է¹ް� �Է¹��� ������ Ȧ������ ¦������ �Ǵ��ϱ�
		// Ȧ���� Ȧ�� ��� ���, ¦���� ¦�� ��� ���
		
		// 0�� ���� 0�̶�� ��µ� �غ���,,,
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("¦��");
		}
		//else if(x == 0){System.out.println("zero");}
		else {
			/*
			 * if(x == 0){System.out.println("zero");}
			 * else{System.out.println("Ȧ��");}
			 */
			System.out.println("Ȧ��");
		}
		
		
	}

}
