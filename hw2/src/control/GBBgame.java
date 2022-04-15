package control;

import java.util.Scanner;

public class GBBgame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int cnt = 0;
		while(true) {
			//횟수
			cnt++;
			//랜덤수 생성
			int prb = (int)(Math.random()*3);
			//System.out.println(prb);
			//입력
			System.out.print("무엇을 내시겠습니까? (가위:0, 바위:1, 보:2) : ");
			int input = sc.nextInt();
			String match;
			//랜덤수를 가위바위보로
			if(prb == 0) {
				match = "가위";
			}else if(prb == 1) {
				match = "바위";
			}else {
				match = "보";
			}
			//입력값을 가위바위보로
			String match2;
			if(input == 0) {
				match2 = "가위";
			}else if(input == 1) {
				match2 = "바위";
			}else {
				match2 = "보";
			}
			//결과
			System.out.println("컴퓨터 : " + match);
			System.out.println("사용자 : " + match2);
			if(prb-input == -1 || prb-input == 2) {
				System.out.println("사용자 승");
				System.out.println(cnt + "번 만에 승리하셨습니다.");
				//다시하기 묻기
				System.out.print("다시 하시겠습니까?(y:1/n:0) : ");
				int re = sc.nextInt();
				if(re == 1) {
					cnt = 0;
					continue;
				}else if(re == 0) {
					System.out.println("프로그램을 종료합니다.");
					break;
				}
			}else {
				System.out.println("컴퓨터 승");
			}
			
			
			
			
		}//while
		
	}//main

}//class
