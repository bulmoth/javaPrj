package practice;

import java.util.Scanner;

public class N1430 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] nArr = new int[N];
		
		for(int i=0; i<N; i++) {
			nArr[i] = sc.nextInt();
		}
		
		int M = sc.nextInt();
		int[] mArr = new int[M];
		
		for(int i=0; i<M; i++) {
			mArr[i] = sc.nextInt();
		}
		
		int[] result = new int[M];
		for(int j=0; j<M; j++) {
			for(int i=0; i<N; i++) {
				if(mArr[j] == nArr[i]) {
					result[j] = 1;
					continue;
				}
			}
			System.out.print(result[j]);
		}
		

		
		
		
	}//main

}//class
