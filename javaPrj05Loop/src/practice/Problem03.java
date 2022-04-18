package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {

		//정수 1개 입력받아 카운트다운하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		for(int i=x; i>0; i--) {
			System.out.println(i);
		}
		
		
//		//10부터 1까지 카운트다운하기
//		for(int x = 10; x > 0; x = x-1) {
//			System.out.println(x);
//		}
		
		
	}

}
