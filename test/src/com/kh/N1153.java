package com.kh;

import java.util.Scanner;

public class N1153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ù ���� �Է� : ");
		int a = sc.nextInt();
		System.out.println("�� ��° ���� �Է� : ");
		int b = sc.nextInt();
		
		if(a > b) {
			System.out.println(">");
		}else if(a == b) {
			System.out.println("=");
		}else {
			System.out.println("<");
		}
		
	}

}
