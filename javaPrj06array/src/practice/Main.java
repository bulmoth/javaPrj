package practice;

public class Main {

	public static void main(String[] args) {

		//길이가 10인 배열 생성, 각 요소에 0부터 9까지 숫자 채워넣기
		
		int[] a = new int[10];
		
		
		//각 요소에 값 할당
		for(int i=0; i<10; i++) {
			a[i] = (i+1)*100;
		}

		//각 요소에 값 출력
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}//main

}//class
