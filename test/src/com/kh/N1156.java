package com.kh;

import java.util.Scanner;

public class N1156 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("수를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input%2 == 0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}
		
		
	}

}
