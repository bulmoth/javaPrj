package practice;

import java.util.Scanner;

public class Problem01 {

	public static void main(String[] args) {

		//1403
		
		Scanner sc = new Scanner(System.in);
//		//���� k �ޱ�
//		int k = sc.nextInt();
//		int[] arr = new int[k];
//		
//		//k�� ���� �Է¹ޱ�
//		for(int i=0; i<arr.length; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		//���
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
//		for(int i=0; i<arr.length; i++) {
//			System.out.println(arr[i]);
//		}
		
		//k �Է¹ޱ�
		//k���� ���ڸ� ���� �� �ִ� �޸��� �غ�
		//(���ڸ� ���, �޸��忡 ����)*k//k���� ���ڸ� �޸��忡 ����
		//�޸����� i��° ��� �б�(��, i : 0~k-1)
			//(�޸��忡 �ִ°� ������� �б�)
			//�޸����� ù��° ��� �б�
			//�޸����� �ι�° ��� �б�
			//�޸����� ����° ��� �б�
			//�޸����� k��° ��� �б� 
		
		
		
		
		int k = sc.nextInt();
		int[] arr = new int[k];
		
		for(int i=0; i<k; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		for(int i=0; i<k; i++) {
			System.out.println(arr[i]);
		}
		
		
	}//main

}//class
