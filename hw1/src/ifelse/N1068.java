package ifelse;

import java.util.Scanner;

public class N1068 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하시오 : ");
		int input = sc.nextInt();
		
		System.out.print("당신의 점수는 : ");
		if(90<=input && input<100) {
			System.out.println("A");
		}else if(70<=input && input<90){
			System.out.println("B");
		}else if(40<=input && input<70){
			System.out.println("C");
		}else if(0<=input && input<40){
			System.out.println("D");
		}else {
			System.out.println("잘못된 점수 입니다.");
		}
		
		
	}

}
