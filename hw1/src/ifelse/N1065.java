package ifelse;

import java.util.Scanner;

public class N1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수 세 개를 공백을 띄어 입력하세요 : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(a % 2 == 0) {
			System.out.println(a);
		}
		
		if(b % 2 == 0) {
			System.out.println(b);
		}
		
		if(c % 2 == 0) {
			System.out.println(c);
		}
		
	}//main

}//class
