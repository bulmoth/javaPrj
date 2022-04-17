package ifelse;

import java.util.Scanner;

public class N1161 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a%2 == 1) {
			System.out.println("È¦¼ö");
		}else {
			System.out.println("Â¦¼ö");
		}
		
		System.out.println("+");
		
		if(b%2 == 1) {
			System.out.println("È¦¼ö");
		}else {
			System.out.println("Â¦¼ö");
		}
		
		System.out.println("=");
		
		if((a%2 == 1 && b%2 == 1) || (a%2==0 && b%2==0)) {
			System.out.println("Â¦¼ö");
		}else {
			System.out.println("È¦¼ö");
		}
		
	}

}
