package com.kh.main;

import java.util.Random;
import java.util.Scanner;
import com.kh.obj.*;
import com.kh.obj.Character;

public class Run {
	
	public static Scanner sc = new Scanner(System.in);
	private static String result = "";
	
	public static void main(String[] args) {
		//������ �� ĳ���� Ŀ���͸���¡�ϱ�
		
		//Object
		Character[] ch = new Character[3];
		ch[0] = new Eye();
		ch[1] = new Hair();
		ch[2] = new Nose();
		Random r = new Random();
		
		System.out.println("�� ������ �� ����� �ýÿ� �ö�����...");
		
		//default Question
		result += ((Eye) ch[0]).starting();	//�ѱ�
		result += ((Hair) ch[1]).rain();		//������
		result += ((Eye) ch[0]).typhoon();	//�Ӵ������
		result += ((Nose) ch[2]).window();	//�ڸ��
		result += ((Hair) ch[1]).hurry();	//����
		result += ((Nose) ch[2]).meat();		//���� �Ǽ�
		
		//random Question
		int select = r.nextInt(2);
		char sky = ch[r.nextInt(3)].sky();
		String sleep = ch[r.nextInt(3)].sleep();
		
		switch(select) {
		case 0:
			
		}
		
		((Hair) ch[1]).hair()
		
		System.out.println("\n��, ������ �����߾�. ���� ���ο� ����� �����Ұ�.");
		System.out.println("\n\n����� " + result + "����� ���� ����� �Ǿ����ϴ�.");
		
	}//main

}//class
