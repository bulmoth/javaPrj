package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		// 해를 입력하고 그 해가 윤년인지 아닌지 판단
		//조건1. 해가 4의 배수이면서 100의 배수가 아니면 윤년
		//조건2. 400의 배수이면 윤년
		//위 두 조건 중 하나라도 맞으면 윤년이다.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("년도를 입력하시오 : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0)) {	//(year%4==0 && year%100!=0)||(year%400==0)
			System.out.println("윤년이다.");
		}else if(year % 400 == 0) {
			System.out.println("윤년이다.");
		}else {
			System.out.println("평년이다.");
		}
		
		
	}

}
