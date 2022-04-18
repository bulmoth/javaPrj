package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		// 정수 하나를 입력받고 입력받은 정수가 홀수인지 짝수인지 판단하기
		// 홀수면 홀수 라고 출력, 짝수면 짝수 라고 출력
		
		// 0이 들어가면 0이라고 출력도 해보고,,,
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int x = sc.nextInt();
		
		if(x % 2 == 0) {
			System.out.println("짝수");
		}
		//else if(x == 0){System.out.println("zero");}
		else {
			/*
			 * if(x == 0){System.out.println("zero");}
			 * else{System.out.println("홀수");}
			 */
			System.out.println("홀수");
		}
		
		
	}

}
