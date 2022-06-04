package util;

import java.util.Scanner;

public class Util {
	
	public static final Scanner sc = new Scanner(System.in);
	
	public static int scanInt() {
		int result = sc.nextInt();
		sc.nextLine();
		return result;
	}
	
	public static double scanDouble() {
		double result = sc.nextDouble();
		sc.nextInt();
		return result;
	}

}
