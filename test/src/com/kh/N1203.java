package com.kh;

import java.util.Scanner;

public class N1203 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("BMI �Է� : ");
		int bmi = sc.nextInt();
		
		if(bmi>20) {
			System.out.println("��");
		}else if(bmi<=10) {
			System.out.println("����");
		}else {
			System.out.println("��ü��");
		}
		
		/*
		 * 
		 * if(bmi<=10) {
			System.out.println("����");
			}else if(bmi<=20) {	//if���� �ѹ� �ɷ����� ������ 20���ϸ� �ᵵ ��
			System.out.println("��ü��");
			}else {
			System.out.println("��");
			}
		 * 
		 * */
		
		
	}

}
