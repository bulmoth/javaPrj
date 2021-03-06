package com.kh.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LoginTest {
	
	private final String path = "C:\\dev\\user.txt";
	
	private Scanner sc = new Scanner(System.in);
	
	public void login() {
		//파일에서 아이디, 비번 확인하여
		//로그인 가능 여부 판단하기
		
//		//사용자로부터 아이디, 비번 입력받기
//		System.out.println("===== 로그인 할 ID, PWD 입력하세요 =====");
//		System.out.print("아이디 : ");
//		String id = sc.nextLine().trim();	//trim : 문자열 공백 제거
//		System.out.print("패스워드 : ");
//		String pwd = sc.nextLine().trim();
		String[] strArr = inputUser();
		String id = strArr[0];
		String pwd = strArr[1];
		
		//파일객체 생성
		File f = new File(path);
		
		//스트림 생성
		//try with resource 구문을 사용하면, close 처리를 따로 할 필요가 없다. (jdk 버전 확인하고 쓰기)
		try(BufferedReader br = new BufferedReader(new FileReader(f))) {
			
			boolean isLoginSuccess = false;
			
			while(true) {
				//아이디, 비번 읽기
				String data = br.readLine();	// id/pwd
				//data가 null 이라면? 파일 끝까지 다 읽은거임
				if(data == null) {
					break;
				}
				//읽어온 data에서 '/' 문자의 인덱스 알아야됨
				int index = data.indexOf('/');
				String dataId = data.substring(0,index);
				String dataPwd = data.substring(index+1);
//				System.out.println("파일에서 읽어온 아이디 : " + dataId);
//				System.out.println("파일에서 읽어온 비번 : " + dataPwd);
				
				//판단하기
				if(id.equals(dataId) && pwd.equals(dataPwd)) {
					System.out.println("로그인 성공 !");
					isLoginSuccess = true;
					break;
				}
			}
			
			//한번도 로그인 성공 못하면, 출력할 것
			if(!isLoginSuccess) {
				System.out.println("로그인 실패 ㅠㅠ");
			}
		} catch (FileNotFoundException e) {
			System.out.println("예외 ~");
		} catch (IOException e1) {
			System.out.println("IO 예외 발생,,");
		}
	}//login
	
	
	
	
	//회원가입
	public void join() throws JoinException {
		System.out.println("===== 회원가입 =====");
		String[] strArr = inputUser();
		String id = strArr[0];
		String pwd = strArr[1];
		
		//아이디, 패스워드 중에 '/' 있으면 예외 발생시키기
				if(id.contains("/") || pwd.contains("/")) {
					// Exception !! 예외로 관리하려고 예외 발생
					throw new JoinException();
				}
		
		//입력받은 데이터를 파일에 넣기
		File f = new File(path);
		
		//스트림 생성
		BufferedWriter bw = null;
		try {
			bw = new BufferedWriter(new FileWriter(f,true));
			bw.write(id);
			bw.write("/");
			bw.write(pwd);
			bw.write("\n");
			bw.flush();
		} catch (IOException e) {
			System.out.println("예외발생!!");
		}finally {
			try {bw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
	}//join
	
	public String[] inputUser() {
		System.out.print("ID : ");
		String id = sc.nextLine().trim();	//trim : 문자열 공백 제거
		System.out.print("PWD : ");
		String pwd = sc.nextLine().trim();
		
//		String[] strArr = new String[2];
//		strArr[0] = id;
//		strArr[1] = pwd;
//		return strArr;
		
		//위의 4줄과 같은 코드
		return new String[] {id, pwd};
	}
	
	
	
	
	

}//class
