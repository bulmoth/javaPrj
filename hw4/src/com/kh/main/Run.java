package com.kh.main;

import java.util.Scanner;
import com.kh.obj.*;

public class Run {
	
	public static Scanner sc = new Scanner(System.in);
	public static String result = "";
	
	public static void main(String[] args) {
		//������ �� ĳ���� Ŀ���͸���¡�ϱ�
		
		System.out.println("�� ������ �� ����� �ýÿ� �ö�����...");
		
		Eye e = new Eye();
		Hair h = new Hair();
		Nose n = new Nose();
		
		result += e.starting();	//�ѱ�
		result += h.rain();		//������
		result += e.typhoon();	//�Ӵ������
		result += n.window();	//�ڸ��
		result += h.hurry();	//����
		result += n.meat();		//���� �Ǽ�
		
		System.out.println("\n��, ������ �����߾�. ���� ���ο� ����� �����Ұ�.");
		System.out.println("\n\n����� " + result + "����� �Ǿ����ϴ�.");
		
	}

}
