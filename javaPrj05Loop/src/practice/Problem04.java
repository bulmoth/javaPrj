package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		//정수를 입력받고, 입력받은 정수를 출력한다. 위 작업을 계속 반복한다. 단, 입력받은 정수가 0이라면 프로그램 종료.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("정수를 입력하세요 : ");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			System.out.println(input);
			
		}
		
	
		
	}

}
