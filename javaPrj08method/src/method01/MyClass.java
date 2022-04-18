package method01;

import java.util.Scanner;

public class MyClass {

	public void test() {
		System.out.println("안녕하세요");
		
		Scanner sc = new Scanner(System.in);	//Scanner새로 생성, sc에 담아줌
		int x = sc.nextInt();
		
		judge(x);	//judge라는 method를 실행하라	//x라는 값을 가지고,,,
		
		
		
	}//test
	
	public void judge(int x) {	//judge(x)를 만났을 때 이리로 옴
		//숫자 판단
		if(x>0) {
			System.out.println("양수");
		}else if(x<0) {
			System.out.println("음수");
		}else {
			System.out.println("zero");
		}
	}//judge	//method끝 -> 이 method를 호출했던 곳으로 돌아감
	
	
}//class
