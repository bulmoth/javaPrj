package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
	
	public static ServerSocket ss = null;
	public static Socket cs = null;
	public static BufferedReader br = null;
	public static BufferedWriter bw = null;

	public static void main(String[] args) {
		
		//서버
			
		try {
			ss = new ServerSocket(13579);	//서버 소켓 생성
			System.out.println("다른 소켓의 연결을 기다리는중...");
			cs = ss.accept();		//서버 소켓에서 받은 소켓 저장
		} catch (IOException e) {
			System.out.println("서버 소켓에서 IO예외 발생");
		}
		
		InetAddress ip = cs.getInetAddress();		//받은 소켓의 ip 저장
		
		System.out.println("연결된 클라이언트의 ip : " + ip);
		
		//inputStream, outputStream 열기
		try {
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
		} catch (IOException e) {
			System.out.println("서버 보조스트림에서 IO예외 발생");
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
			System.out.println("서버 close에서 IO예외 발생");
		}

	}//main

}//class
