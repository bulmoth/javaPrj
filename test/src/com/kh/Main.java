package com.kh;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		//정수 n을 입력받고, 1~n까지의 정수를 출력하기. (단, n은 1 이상의 정수이다.)
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++) {
			System.out.println(i+1);
		}
		
		
		//길이가 5인 정수형 배열을 만들고, 해당 배열의 각 요소에 접근하여 원하는 값을 넣고, 배열의 모든 요소들을 출력해보기
		
		//길이가 5인 정수 생성
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
