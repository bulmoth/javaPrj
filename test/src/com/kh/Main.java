package com.kh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//���� n�� �Է¹ް�, 1~n������ ������ ����ϱ�. (��, n�� 1 �̻��� �����̴�.)
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i+1);
		}
		
		
		//���̰� 5�� ������ �迭�� �����, �ش� �迭�� �� ��ҿ� �����Ͽ� ���ϴ� ���� �ְ�, �迭�� ��� ��ҵ��� ����غ���
		
		//���̰� 5�� ���� ����
		int[] a = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		
		
		
		
		
		
	}//main

}//class
