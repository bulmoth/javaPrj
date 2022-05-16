package com.kh;

import java.util.Scanner;

public class N1203 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("BMI 입력 : ");
		int bmi = sc.nextInt();
		
		if(bmi>20) {
			System.out.println("비만");
		}else if(bmi<=10) {
			System.out.println("정상");
		}else {
			System.out.println("과체중");
		}
		
		/*
		 * 
		 * if(bmi<=10) {
			System.out.println("정상");
			}else if(bmi<=20) {	//if에서 한번 걸러지기 때문에 20이하만 써도 됨
			System.out.println("과체중");
			}else {
			System.out.println("비만");
			}
		 * 
		 * */
		
		
	}

}
