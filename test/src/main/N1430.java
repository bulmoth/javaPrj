package main;


import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class N1430 {		//java라서 시간초과됨,,,출력쪽에 시간이 오래걸림

	public static void main(String[] args) throws IOException {

		Scanner sc = new Scanner(System.in);
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int memo[] = new int[10000001]; 	//0~10,000,000
		
		int n = sc.nextInt();
		
		int i;
		for(i=0; i<n; ++i) {
			memo[sc.nextInt()] = 1;
		}
		
		
		int m = sc.nextInt();
		for(i=0; i<m; ++i) {
//			if(memo[x] == 1) {
//				System.out.print("1" + " ");
//			}else {
//				System.out.println("0" + " ");
//			}
//			System.out.print(memo[sc.nextInt()] + " ");
			bw.write(memo[sc.nextInt()] + " ");
		}
		
		bw.flush();
		bw.close();
		
		
	}

}
