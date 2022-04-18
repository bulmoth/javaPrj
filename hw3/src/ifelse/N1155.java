package ifelse;

import java.util.Scanner;

public class N1155 {

	public void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		if(a%7==0) {
			System.out.println("multiple");
		}else {
			System.out.println("not multiple");
		}		//1155
		
		
		if(a%2==0) {
			System.out.println("even");
		}else {
			System.out.println("odd");
		}	//1156
		
	}
	
}
