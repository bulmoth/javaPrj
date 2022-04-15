package forwhile;

import java.util.Scanner;

public class N1077 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i=1;i<=num; i++) {
			System.out.println(i);
		}
	}

}
