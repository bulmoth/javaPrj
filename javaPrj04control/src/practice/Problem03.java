package practice;

import java.util.Scanner;

public class Problem03 {

	public static void main(String[] args) {
		
		// �ظ� �Է��ϰ� �� �ذ� �������� �ƴ��� �Ǵ�
		//����1. �ذ� 4�� ����̸鼭 100�� ����� �ƴϸ� ����
		//����2. 400�� ����̸� ����
		//�� �� ���� �� �ϳ��� ������ �����̴�.
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�⵵�� �Է��Ͻÿ� : ");
		int year = sc.nextInt();
		
		if((year % 4 == 0) && (year % 100 != 0)) {	//(year%4==0 && year%100!=0)||(year%400==0)
			System.out.println("�����̴�.");
		}else if(year % 400 == 0) {
			System.out.println("�����̴�.");
		}else {
			System.out.println("����̴�.");
		}
		
		
	}

}
