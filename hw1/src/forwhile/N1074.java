package forwhile;

import java.util.Scanner;

public class N1074 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오 : ");
		int num = sc.nextInt();
		
		for(int i=num;i>0; i--) {
			System.out.println(i);
		}
	}

}
