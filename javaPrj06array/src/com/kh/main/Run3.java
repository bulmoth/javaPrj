package com.kh.main;

public class Run3 {

	public static void main(String[] args) {

		//다차원 배열
		//2차원 배열
		
		//배열 변수 선언 = 다차원 배열 생성
		int[][] a = new int[3][];
		
		a[0] = new int[4];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		
		//출력은 for문을 이용해서 출력해줘야함
		//그 칸에 접근해야만 출력이 가능,,,꼼수부리지말자...ㅎㅎ
		
		for(int i=0; i<a[0].length;i++) {
			System.out.println(a[0][i]);
		}
		System.out.println(a.length);	
		
	}

}
