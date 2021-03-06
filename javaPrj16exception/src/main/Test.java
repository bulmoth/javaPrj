package main;

public class Test {
	
	MyException me  = new MyException();
	
	public void test() throws Exception {
		
		//예외를 내가 직접 발생시키기
		
//		try {
//			throw new Exception();	//던진다. Exception 객체를
//		}catch(Exception e) {
//			System.out.println("예외 잡음");
//		}
		
		throw new Exception();	//Throwable 타입의 객체(예외)를 던질 수 있음
		
	}
	
	public void methodA() throws Exception {
		System.out.println("Method A 호출됨");
		try {
			methodB();
		}catch(Exception e) {
			throw me;
		}
		
		System.out.println("Method A 종료");
	}
	
	public void methodB() throws Exception {
		System.out.println("Method B 호출됨");
		methodC();
		System.out.println("Method B 종료");
	}
	
	public void methodC() throws Exception {
		System.out.println("Method C 호출됨");
		int x = 1 / 0;
		System.out.println("Method C 종료");
	}

}//class
