package com.kh;

import java.util.Scanner;

public class N1173 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("�ø� �Է��Ͻÿ� : ");
		int t1 = sc.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		int t2 = sc.nextInt();
		
		t2 = t2-30;
		if(t2<0) {
			t1 = t1 - 1;
			t2 = t2 + 60;
		}
		
		System.out.println(t1 + " " + t2);
		
	}

}
