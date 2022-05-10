package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import server.Thread1Run;
import server.Thread2Run;

public class ClientMain {
	
	public static BufferedReader br = null;
	public static BufferedWriter bw = null;

	public static void main(String[] args) {
		
		//클라이언트
		System.out.println("클라이언트 시작");
		
		//접속할 서버 소켓 정보를 인자로 전달
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 13579);
		} catch (UnknownHostException e) {
			System.out.println("클라이언트에서 호스트를 알 수 없음");
		} catch (IOException e) {
			System.out.println("클라이언트 소켓에서 IO예외 발생");
		}
		
		//inputStream, outputStream 열기
				try {
					br = new BufferedReader(new InputStreamReader(s.getInputStream()));
					bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				} catch (IOException e) {
					System.out.println("클라이언트 보조스트림에서 IO예외 발생");
				}
				
				//수신부 쓰레드 생성, 실행
				Thread t1 = new Thread(new Thread1Run());
				t1.start();
				
				//발신부 쓰레드 생성, 실행
				Thread t2 = new Thread(new Thread2Run());
				t2.start();
				
				try {
					br.close();
					bw.close();
				} catch (IOException e) {
					System.out.println("클라이언트 close에서 IO예외 발생");
				}
		

	}//main

}//class
