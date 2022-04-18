package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		//정수 하나 입력받고 입력받은 정수를 무한 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int x = sc.nextInt();
		while(true) {
			System.out.println(x);
		}
		
	}

}
