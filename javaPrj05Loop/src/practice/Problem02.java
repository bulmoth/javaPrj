package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		//정수 1개 입력받아 그 수까지 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int x = sc.nextInt();
		
		for(int i=1; i <= x; i++) {
			System.out.println(i);
		}
		
		

		
	}

}
