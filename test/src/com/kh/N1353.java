package com.kh;

import java.util.Scanner;

public class N1353 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) { 	//i : 1~n
			for(int j=0; j<i; j++) {	//x번 만큼 *출력
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
