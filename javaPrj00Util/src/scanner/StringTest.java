package scanner;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		//��ĳ�ʷ� ���ڿ� �ޱ�
		
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		//��ĳ�� ��� (����, ���ڿ�)
		int x = sc.nextInt();
		
		String s = sc.nextLine();
		
		System.out.println("x : " + x);
		System.out.println("s : " + s);

	}
}
