package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run 클래스의 main 메소드 호출됨..");
		System.out.println("=============================");
		
		//객체 생성 (MyClass01 클래스 파일을 이용해서 객체)
//		MyClass01 mc01 = new MyClass01();	//type : MyClass01(클래스가 타입이다...!!)
		//객체의 메소드 호출(MyClass01 클래스 파일의 myMethod01 호출)
//		mc01.myMethod01();
//		mc01.myMethod02();
		
		//객체생성
		MyClass01 mc = new MyClass01();	//대입을 하기 위해 오른쪽을 먼저 해석
		//오른쪽 >> 새롭게 만들어라(new), (MyClass01()이라는 타입의 객체를) MyClass01()이라는 클래스를 참조해서.
		//왼쪽 >> MyClass01이라는 타입의 참조변수 mc를 만들어라(변수 선언)
		mc.name = "신현지";
		mc.age = 26;
		mc.introduce();
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in); //Scanner 객체가 생성
//		//Scanner라는 class file을 통해 새(new) 객체를 만들겠다
//		sc.nextInt();		//Scanner class의 nextInt()라는 함수 쓰겠다~~~
		
		//절차지향 vs 객체지향
		
		//<객체지향>
		
		//붕어빵
		/*
		 * class : 붕어빵 틀
		 * 객체(== Object == instance(화 시킨다...)) : 붕어빵
		 */
		
		//도면,,,설계도....
		/*
		 * class : 설게도
		 * 객체 : 설계도를 이용해서 만들어진 제품
		 */
		
		//아르바이트
		//철수 영희
		
		/*
		 * <객체지향>
		 * 역할별로...
		 * [카운터 직원]
		 * -닉네임			//데이터(변수)
		 * -시급 : 9천원		
		 * -주문받는 기능		//메소드
		 * -계산 기능
		 * 
		 * [주방 직원]
		 * -닉네임
		 * -시급 : 만원
		 * -음료 제조
		 * -음료 건네기
		 * 
		 * 위의 메뉴얼(==class)을 가지고 철수, 영희(==객체, object)에게 카페를 운영...
		 * 
		 */
		
		
		/*
		 * <절차지향>
		 * 1. 손님이 들어옴
		 * 2. 주문 받음
		 * 2-1 (주문 취소하고 떠남, 아래 내용 실행하지 않음)
		 * 3. 계산
		 * 3-1 (잔액부족, 손님이 민망..나감.,,,그러면 아래 내용 실행 ㄴㄴ, 위에서 주문받은 취소)
		 * 4. 음료 제조
		 * 5. 음료 건넴
		 * >>절차지향적(예외사항이 넘 많고....메뉴얼 너무 길어....)
		 */
		
		
	}//main

}//class
