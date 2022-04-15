package ifelse;

import java.util.Scanner;

public class N1069 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("등급을 입력하시오 : ");
		String score = sc.nextLine();
		
		switch(score) {
		case "A" : System.out.println("best!!!"); break;
		case "B" : System.out.println("good!!"); break;
		case "C" : System.out.println("run!"); break;
		case "D" : System.out.println("slowly~"); break;
		default : System.out.println("what?"); break;
		
		}

		
	}

}
