package com.kh;

import java.util.Scanner;

public class N1218 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("ù��° ���� �Է��Ͻÿ� : ");
		int a = sc.nextInt();
		System.out.print("�ι�° ���� �Է��Ͻÿ� : ");
		int b = sc.nextInt();
		System.out.print("����° ���� �Է��Ͻÿ� : ");
		int c = sc.nextInt();
		
		
		if(a==b && b==c && c==a) {
			System.out.println("���ﰢ��");
		}else if(a == b || b == c) {
			System.out.println("�̵�ﰢ��");
		}else if(a*a + b*b == c*c) {
			System.out.println("�����ﰢ��");
		}else if(a + b > c) {
			System.out.println("�ﰢ��");
		}else{
			System.out.println("�ﰢ�� �ƴ�");
		}
		
		
		
		
		
		
	}

}
