package practice;

import java.util.Scanner;

//import��°�...�غ���...



public class Run {

	public static void main(String[] args) {

		//1. ������ ���� �ϳ� �����, ���ڴ� �ƹ��ų� �ֱ�
		//2. �ش� ���ڰ� �������, ��������, 0���� �Ǵ��ϱ�
		
		/*
		int num = 0;
		
		if(num > 0) {
			System.out.println("+");
		}
		else if(num < 0) {
			System.out.println("-");
		}
		else {
			System.out.println("0");
		}
		*/
		
		//1. ������ ���� �ϳ� �����, ���ڴ� "�Է¹ޱ�".
		//2. �ش� ���ڰ� �������, ��������, 0���� �Ǵ��ϱ�
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		
		if(x > 0) {
			System.out.println("+");
		}
		else if(x < 0) {
			System.out.println("-");
		}
		else {
			System.out.println("0");
		}
		
		
		
		
		
	}

}
