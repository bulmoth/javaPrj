package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//��ĳ�� ����
		
		//��ĳ�� ����
		Scanner sc = new Scanner(System.in);
		
		//��ĳ�� ���
		
		//����(int) �Է¹ޱ�
		int i = sc.nextInt();
		System.out.println("i : " + i);
		
		//Ư�� Ÿ���� �����͸� �Է¹�������, nextXXX()
		long l = sc.nextLong();
		System.out.println("l : " + l);
		
		byte b = sc.nextByte();
		System.out.println("b : " + b);
		
		short s = sc.nextShort();
		System.out.println("s : " + s);
		
		float f = sc.nextFloat();
		System.out.println("f : " + f);
		
		
	}

}
