package scanner;

import java.util.Scanner;

public class StringTest {

	public static void main(String[] args) {

		//스캐너로 문자열 받기
		
		//스캐너 생성
		Scanner sc = new Scanner(System.in);
		
		//스캐너 사용 (숫자, 문자열)
		int x = sc.nextInt();
		
		String s = sc.nextLine();
		
		System.out.println("x : " + x);
		System.out.println("s : " + s);

	}
}
