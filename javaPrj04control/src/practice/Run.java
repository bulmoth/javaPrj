package practice;

import java.util.Scanner;

//import라는걸...해보자...



public class Run {

	public static void main(String[] args) {

		//1. 정수형 변수 하나 만들고, 숫자는 아무거나 넣기
		//2. 해당 숫자가 양수인지, 음수인지, 0인지 판단하기
		
		/*
		int num = 0;
		
		if(num > 0) {
			System.out.println("+");
		}
		else if(num < 0) {
			System.out.println("-");
		}
		else {
			System.out.println("0");
		}
		*/
		
		//1. 정수형 변수 하나 만들고, 숫자는 "입력받기".
		//2. 해당 숫자가 양수인지, 음수인지, 0인지 판단하기
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("+");
		}
		else if(x < 0) {
			System.out.println("-");
		}
		else {
			System.out.println("0");
		}
		
		
		
		
		
	}

}
