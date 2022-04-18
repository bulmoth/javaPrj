package main;

public class Main {

	public static void main(String[] args) {
		
		//System.out.println("hello world ! ");
		
		
		
		
		
		//Á¤»ï°¢Çü
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				
				if(i+j >= 10 && j-i <= 10) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	
	
		//¼Óºó Á¤»ï°¢Çü
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				
				if(i+j == 10 || j-i == 10) {
					System.out.print("*");
				}
				else if(i == 9 && j%2 == 1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
		
	
		//¿ªÁ¤»ï°¢Çü
		for(int i=0; i<10; i++) {
			for(int j=0; j<20; j++) {
				
				if(j >= i && j < 20-i) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}

			}
			System.out.println();
		}
	
	
	
	
	
	
	
	}//main

}//class
