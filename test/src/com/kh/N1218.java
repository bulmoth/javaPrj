package com.kh;

import java.util.Scanner;

public class N1218 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 변을 입력하시오 : ");
		int a = sc.nextInt();
		System.out.print("두번째 변을 입력하시오 : ");
		int b = sc.nextInt();
		System.out.print("세번째 변을 입력하시오 : ");
		int c = sc.nextInt();
		
		
		if(a==b && b==c && c==a) {
			System.out.println("정삼각형");
		}else if(a == b || b == c) {
			System.out.println("이등변삼각형");
		}else if(a*a + b*b == c*c) {
			System.out.println("직각삼각형");
		}else if(a + b > c) {
			System.out.println("삼각형");
		}else{
			System.out.println("삼각형 아님");
		}
		
		
		
		
		
		
	}

}
