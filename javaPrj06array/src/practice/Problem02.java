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
		
		
		
		
		//1~23�� ���� ����
		int[] memo = new int[24];	//0~23
		
		//�������� n�� �⼮ �θ�
		int n = sc.nextInt();
		
		//n�� �ݺ�
		for(int i=0; i<n; i++) {
			//�������� �θ� �⼮��ȣ Ȯ��
			int x = sc.nextInt();
			//x�� ĭ�� ���� üũ
			memo[x] = 1;
		}
		//üũ�� �� �߿� ���� ù��°�� ���
		for(int i=0; i<=23; ++i) {
			if(memo[i] == 1) {
				System.out.println(i);
				break;
			}
		}
		
		
	}//main

}//class
