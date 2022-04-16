package repeat;

import java.util.Scanner;

public class Main {		//1430

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
		
		for(int j=0; j<M; j++) {		//시간초과되는 이중for문ㅠㅠ
			for(int i=0; i<N; i++) {
				if(mArr[j] == nArr[i]) {
					result[j] = 1;
					break;
				}
			}
			System.out.print(result[j] + " ");
		}
		
		

		/*
		int j = 0;
		int i = 0;
		while(i<N){
		    if(mArr[j] == nArr[i]){
		        result[j] = 1;
		        i = 0;
		        j++;
		        if(j == M) break;
		    }else{
		        i++;
		        if(i == N) i=0;
		    }
		}
        for(int k=0; k<M; k++){
            System.out.print(result[k] + " ");
        }
		*/
		
		
		
	}//main
	
}
