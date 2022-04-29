package com.kh.string;

public class StringOtherTest {
	
	//문자열 관련 3가지
	
	//1. String
	//2. StringBuffer
	//3. StringBuilder
	
	public void test() {
		//String
		//두 문자열을 합칠 때 새로운 문자열로 뱉음
		String str = new String("zzz");
		String str2 = "zzz";
		
		//StringBuffer
		//문자열 바로 못집어넣음
		//두 문자열을 합칠 때 원래의 것에 붙여넣는다
		//thread(일꾼같은거) safe
		StringBuffer sb = new StringBuffer("buffer~~");
		sb.append("123");		//뒤에다 붙일 때
		sb.insert(0, "zzz");	//앞에다 붙일 때는 insert의 offset을 0으로 두어서 해줌
		System.out.println(sb);
		
		//StringBuilder
		//문자열 바로 못집어넣음
		//두 문자열을 합칠 때 원래의 것에 붙여넣는다
		//thread unsafe
		StringBuilder sbd = new StringBuilder("builder~~~~~");
		sbd.append("123");
		System.out.println(sbd);
	}

}//class
