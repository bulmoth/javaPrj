package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		//1403
		
		Scanner sc = new Scanner(System.in);
//		//정수 k 받기
//		int k = sc.nextInt();
//		int[] arr = new int[k];
//		
//		//k번 숫자 입력받기
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		//출력
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//k 입력받기
		//k개의 숫자를 적을 수 있는 메모장 준비
		//(숫자를 듣고, 메모장에 적기)*k//k개의 숫자를 메모장에 적기
		//메모장의 i번째 요소 읽기(단, i : 0~k-1)
			//(메모장에 있는거 순서대로 읽기)
			//메모장의 첫번째 요소 읽기
			//메모장의 두번째 요소 읽기
			//메모장의 세번째 요소 읽기
			//메모장의 k번째 요소 읽기 
		
		
		
		
		int k = sc.nextInt();
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		
		
	}//main

}//class
