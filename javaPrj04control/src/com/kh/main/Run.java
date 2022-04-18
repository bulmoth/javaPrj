package com.kh.main;

public class Run {

	public static void main(String[] args) {

		//조건문
		//조건에 맞으면 실행하게 해줌.
		
		/*
		 * if문 표현식 : 
		 * if(조건식){실행할 내용}
		 * 
		 * 조건식에 들어갈 내용
		 * > true / false로 나올 수 있도록 작성
		 */
		
		
		/*
		int userInput = 1;
		
		if(userInput == 1) {	//유저인풋이 1과 같다면
			System.out.println("짜장면 주문 완료");
		}
		
		if(userInput == 2) {	//우저인풋이 2와 같다면
			System.out.println("짬뽕 주문 완료");
		}
		*/
		
		
		
		//num이라는 변수를 만들고, num 값이 양수라면? 양수입니다. 출력, 음수라면 음수입니다. 출력
		/*
		int num = -1;
		
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		
		if(num < 0) {
			System.out.println("음수입니다.");
		}
		
		if(num == 0) {
			System.out.println("0 입니다.");
		}
		*/
		
		/*
		if(num > 0) {
			System.out.println("양수입니다.");
		}
		else{
			System.out.println("음수입니다.");
		}
		*/
		
		
		/*
		//num이라는 변수를 만들고, num 값이 양수라면? + 출력, 0이라면 ZERO 출력, 음수라면 - 출력
		
		int num = 0;
		
		if(num > 0) {
			System.out.println("+");
		}
		else if(num < 0) {
			System.out.println("-");
		}
		else if(num == 0) {
			System.out.println("0");
		}
		*/
		
		//switch
		/*
		 * switch(?){
		 * 	case ? : 실행구문;
		 * 	case ? : 실행구문;
		 * 
		 * 	...
		 * 
		 * 	default : 실행구문;
		 * }
		 */
		int x = 3;
		
		switch(x) {
		case 1 : System.out.println("일"); break;
		case 2 : System.out.println("이"); break;
		case 3 : System.out.println("삼"); break;
		default : System.out.println("범위에 없음");
		}
		
		
	}

}
