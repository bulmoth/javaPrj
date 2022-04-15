package ifelse;

import java.util.Scanner;

public class N1067 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하시오 : ");
		int input = sc.nextInt();
		
		if(input > 0) {
			System.out.println("plus");
		}else if(input == 0) {
			System.out.println("zero");
		}else {
			System.out.println("minus");
		}
		
		if(input%2 == 0) {
			System.out.println("even");
		}else if(input == 0) {
			System.out.println("zero");
		}else {
			System.out.println("odd");
		}
		
		
	}

}
