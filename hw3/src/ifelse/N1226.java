package ifelse;

import java.util.Scanner;

public class N1226 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] a = new int[46];
		for(int i=0; i<6; i++) {
			int x = sc.nextInt();
			a[x] = 1;
		}
		int bonus = sc.nextInt();
		boolean is2nd = false;
		int sum = 0;
		for(int i=0; i<6; i++) {
			int y = sc.nextInt();
			if(a[y] == 1) {
				sum++;
			}
			if(y == bonus) {
				is2nd = true;
			}
		}
		
		switch(sum) {
		case 6:
			System.out.println(1);
			break;
		case 5:
			if(is2nd) {
				System.out.println(2);
				break;
			}else {
				System.out.println(3);
				break;
			}
		case 4:
			System.out.println(4);
			break;
		case 3:
			System.out.println(5);
			break;
		default:
			System.out.println(0);
		}
		
		
	}//main

}//class
