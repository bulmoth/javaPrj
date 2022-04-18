package scanner;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		//스캐너 사용법
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//스캐너 사용
		
		//정수(int) 입력받기
		int i = sc.nextInt();
		System.out.println("i : " + i);
		
		//특정 타입의 데이터를 입력받으려면, nextXXX()
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
