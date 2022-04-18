package repeat;

import java.util.Scanner;

public class Main {		//1430

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		/*
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
		
		for(int j=0; j<M; j++) {		//시간초과되는 이중for문ㅠㅠ	//한글확인
			for(int i=0; i<N; i++) {
				if(mArr[j] == nArr[i]) {
					result[j] = 1;
					break;
				}
			}
			System.out.print(result[j] + " ");
		}
		*/
		
		int N = sc.nextInt();
		int[] nArr = new int[N];
		int[] saying = new int[10000001];
		for(int i=0; i<N; i++) {
			nArr[i] = sc.nextInt();
			saying[nArr[i]] = 1;
		}
		
		int M = sc.nextInt();
		for(int i=0; i<M; i++) {
			int prob = sc.nextInt();
			if(saying[prob] == 1) {
				System.out.print(1 + " ");
			}else {
				System.out.print(0 + " ");
			}
		}
		
	}//main
	
}
