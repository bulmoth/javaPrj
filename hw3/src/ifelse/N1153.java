package ifelse;

import java.util.Scanner;

public class N1153 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		if(a>b) {
			System.out.println(">");
		}else if(a<b) {
			System.out.println("<");
		}else {
			System.out.println("=");
		}		//1153
		
		if(a>b) {
			System.out.println(a-b);
		}else if(a<b) {
			System.out.println(b-a);
		}else {
			System.out.println(0);
		}		//1154
		
		
	}

}
