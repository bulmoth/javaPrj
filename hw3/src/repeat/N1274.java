package repeat;

import java.util.Scanner;

public class N1274 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		boolean isNotPrime = false;
		for(int i=2; i<input; i++) {
			if(input%i == 0) {
				isNotPrime = true;
			}
		}
		if(isNotPrime) {
			System.out.println("not prime");
		}else {
			System.out.println("prime");
		}
		
	}

}
