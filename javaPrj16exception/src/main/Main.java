package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== 예외 처리 =====");
		
		//예외(너무 크리티컬 하지 않은 에로) ~= 에러
		
		/*
		 * 에러
		 * 컴파일 에러
		 * 런타임 에러
		 * 
		 * 예외 발생시키기
		 * throw
		 */
		
		Test t = new Test();
		MyException me  = new MyException();
		try {	//중괄호 블럭 실행해라~~
			t.methodA();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("메인 메소드에서 Exception catch");
			System.out.println("e 의 클래스 ::: " + e.getClass());
			if(e instanceof MyException) {
				System.out.println("방금 잡은 예외는 MyException 타입");
				me.say();
			}
		}
		
		
		//내가 만든 예외 처리해봄 ㅎㅅㅎ
//		try {
//			throw new MyException();
//		}catch(Exception e){
//			System.out.println("내가 만든 에러 잡음");
//		}
		
		
//		try {
//			t.test();
//		} catch (Exception e) {
//			System.out.println("메인메소드에서 Exception을 catch함");
//		}
		
//		System.out.println("안녕하세요");
//		
//		try {
//			String str = null;
//			String strSub = str.substring(2, 5);
//			System.out.println(strSub);
//			int x = 1 / 0;
//		}catch(ArithmeticException e) {
//			System.out.println("AE 잡았음");
////			System.out.println(e/*.toString()*/);
////			e.printStackTrace();
//		}catch(Exception e) {
//			System.out.println("예외 잡았음");
//		}
//		
//		
//		System.out.println("바이바이");
		
		
		
		
		
		

	}//main

}//class
