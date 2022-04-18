package practice;

import java.util.Scanner;

public class Problem02 {

	public static void main(String[] args) {
		
		//1095

		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		int[] k = new int[n];
//		
//		for(int i=0; i<k.length; i++) {
//			k[i] = sc.nextInt();
//		}
//		
//		int tmp = 23;
//		for(int i=0; i<k.length; i++) {
//			if(k[i] <= tmp) {
//				tmp = k[i];
//			}
//		}
//		System.out.println(tmp);
		
		
		
		
		//1~23번 까지 있음
		int[] memo = new int[24];	//0~23
		
		//선생님이 n번 출석 부름
		int n = sc.nextInt();
		
		//n번 반복
		for(int i=0; i<n; i++) {
			//선생님이 부른 출석번호 확인
			int x = sc.nextInt();
			//x번 칸에 가서 체크
			memo[x] = 1;
		}
		//체크한 것 중에 제일 첫번째꺼 출력
		for(int i=0; i<=23; ++i) {
			if(memo[i] == 1) {
				System.out.println(i);
				break;
			}
		}
		
		
	}//main

}//class
