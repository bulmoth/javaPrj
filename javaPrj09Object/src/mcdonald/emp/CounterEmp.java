package mcdonald.emp;

import java.util.Scanner;

public class CounterEmp {
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int money;
	
	//주문 받기
	public String order() {
		System.out.println("주문 받을게용~~~");
		//입력받기 (햄버거 이름)
		String ham = this.sc.nextLine();		//전역변수 sc로 스캐너를 받기 때문에,,, this 써주기(안붙여도 상관없지만 붙이는게 좀더 좋은 코드...지만 누가봐도 객체인 경우에는 지워도 상관없음....스캐너는 누가봐도 스캐너니까,,)
		//주문받은 햄버거 이름 확인
		System.out.println(ham + " 주문 받았습니다 ~~~");
		return ham;
	}
	
	//계산하기
	public void calc() {
		System.out.println("계산할게용~~~~");
		//사용자한테 돈 받기 (문자열로 입력받기)
		String price = this.sc.nextLine();
		//얼마 받았습니다 출력하기
		System.out.println(price + " 원 받았습니다~~~~");
	}
	

}
