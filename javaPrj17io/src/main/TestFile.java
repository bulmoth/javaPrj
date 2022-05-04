package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestFile {
	
	public void test(){	//fis가 예외를 던지기 때문에, read()도 예외를 던짐....예외 여러개 던질 수 있음
		
		//파일 인풋 스트림
		
		//파일 객체
		File f = new File("C:\\dev\\abc.txt");	//생성할 때, 파일 정보 전달해줘야 함 (경로)
		
		boolean result = f.isFile();
		System.out.println(result);
		
		//파일에서 데이터 읽기
		//1. 파일
		//2. 인풋 스트림(프로그램이 기준이라서 인풋) (FileInputStream)
		
		//문제
		//1. 문자가 아니라 숫자로 읽어옴 >> char로 캐스팅해서...우찌우찌 처리
		//2. 한글자밖에 못읽음
		
//		FileInputStream fis = new FileInputStream(f);
//		int data = fis.read();		//파일의 맨 첫줄의 첫글자...의 int값이 나옴
		FileReader fr = null;
		try {
			fr = new FileReader(f);	//FileNotFoundException
			
			int data;
			while((data = fr.read()) != -1) {	//IOException
//				int data = fr.read();
//				//파일의 마지막을 읽으면 반복 종료
//				if(data == -1) {
//					break;
//				}
				System.out.print((char)data);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("파일을 못찾음,,,ㅠ");
		}catch (IOException e) {
			System.out.println("입출력 예외 발생~!");
		}finally {
			//예외가 발생여부와 상관 없인 무조건 실행이 되어야 하는 코드 작성
			try {fr.close();} catch (IOException e) {System.out.println("close 중 예외 발생");}
		}
		
	
		
	}
	
	public void test2() {
		
		System.out.println("파일에 글씨 입력하기");
		
		String str = new Scanner(System.in).nextLine();		//System.in : inputStream의 일종..System 클래스에 있는 static 변수
		//파일에다가 글씨 쓰기
		
		//1. 파일 정보 얻기(파일 객체 생성)
		
		
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		//2. 파일이랑 연결(파일이랑 연결된 스트림)
		FileWriter fw = null; 		//finally에서 close 해야하므로, 여기서 선언 //지역변수는 null로 초기화 안해줌...
		try {
			fw = new FileWriter(f);
			//3. 스트림 이용해서 데이터 전송
			fw.write(str);
			fw.flush();		//stream 안에, 버퍼 안에 전송되지 않은 데이터들이 남아있을 수 있어서 해주는 작업 >> flush해주면 파일로 전달됨. 꼭해주기
		} catch (IOException e) {
			System.out.println("입출력 예외 발생 ~!");
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
		
	}
	
	/*
	 * 보조스트림 활용해서 입력받기
	 * (BufferedReader) : 문자열 처리할거니까 Reader 쓸거고, Buffer 를 사용하고 싶음
	 */
	public void test3() {
		
		//파일 객체 생성
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		
		//스트림 생성
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일 못찾음");
		} catch (IOException e) {
			System.out.println("읽다가 에러남");
		} 
		
	}
	
	//BufferedWriter 사용해보기...실습임
	public void test4() {
		
	}

}//class
