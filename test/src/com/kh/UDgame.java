package com.kh;

import java.util.Scanner;

public class UDgame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//���ٿ� ����
		
		//��ǻ�Ͱ� ���� �ϳ� �����ϰ� �ϱ�
		int x = (int) (Math.random()*50)+1;//���� (1~50)
		//int x = (int)Math.random() % 50;
		
		int cnt = 0;
		
		while(true) {
			//��ǻ������ ���� �����
			int input = sc.nextInt();
			cnt++;
			//��ǻ�Ͱ� �亯�ϱ�
			if(input > x) {
				System.out.println("DOWN");
			}else if(input < x) {
				System.out.println("UP");
			}else {
				System.out.println("�����Դϴ�!");
				//?�� �õ��ؼ� ����
				System.out.println(cnt + "�� �õ��߽��ϴ�.");
				break;
			}
			//�����̸� �����ϱ�
		}
		
		
	}//main

}//class
