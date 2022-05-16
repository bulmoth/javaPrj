package com.kh;

import java.util.Scanner;

public class UDgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//업다운 게임
		
		//컴퓨터가 숫자 하나 생각하게 하기
		int x = (int) (Math.random()*50)+1;//랜덤 (1~50)
		//int x = (int)Math.random() % 50;
		
		int cnt = 0;
		
		while(true) {
			//컴퓨터한테 숫자 물어보기
			int input = sc.nextInt();
			cnt++;
			//컴퓨터가 답변하기
			if(input > x) {
				System.out.println("DOWN");
			}else if(input < x) {
				System.out.println("UP");
			}else {
				System.out.println("정답입니다!");
				//?번 시도해서 맞춤
				System.out.println(cnt + "번 시도했습니다.");
				break;
			}
			//정답이면 종료하기
		}
		
		
	}//main

}//class
