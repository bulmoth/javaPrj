package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		//월을 입력받고, 해당 월의 계절을 출력하기
		
		Scanner sc = new Scanner(System.in);
		System.out.print("계절을 알고싶은 달은 몇월인가요?(정수로 쓰시오) : ");
		int month = sc.nextInt();
		
//		if(month >= 3 && month <= 5) {
//			System.out.println("spring");
//		}else if(month >= 6 && month <= 8) {
//			System.out.println("summer");
//		}else if(month >= 9 && month <= 11) {
//			System.out.println("fall");
//		}else if(month >= 1 && month < 3 || month == 12) {
//			System.out.println("winter");
//		}else {
//			System.out.println("잘못 입력하셨습니다.");
//		}
		
		//switch이용
		switch(month) {
		case 12: 
		case 1: 
		case 2: System.out.println("winter"); break;
		case 3: 
		case 4: 
		case 5: System.out.println("spring"); break;
		case 6: 
		case 7: 
		case 8: System.out.println("summer"); break;
		case 9: 
		case 10: 
		case 11: System.out.println("fall"); break;
		default : System.out.println("해당 월은 존재하지 않습니다.");
		}
		
		
		
	}

}
