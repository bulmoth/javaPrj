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
		
		//Ŭ���̾�Ʈ
		System.out.println("Ŭ���̾�Ʈ ����");
		
		//������ ���� ���� ������ ���ڷ� ����
		Socket s = null;
		try {
			s = new Socket("127.0.0.1", 13579);
		} catch (UnknownHostException e) {
			System.out.println("Ŭ���̾�Ʈ���� ȣ��Ʈ�� �� �� ����");
		} catch (IOException e) {
			System.out.println("Ŭ���̾�Ʈ ���Ͽ��� IO���� �߻�");
		}
		
		//inputStream, outputStream ����
				try {
					br = new BufferedReader(new InputStreamReader(s.getInputStream()));
					bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				} catch (IOException e) {
					System.out.println("Ŭ���̾�Ʈ ������Ʈ������ IO���� �߻�");
				}
				
				//���ź� ������ ����, ����
				Thread t1 = new Thread(new Thread1Run());
				t1.start();
				
				//�߽ź� ������ ����, ����
				Thread t2 = new Thread(new Thread2Run());
				t2.start();
				
				try {
					br.close();
					bw.close();
				} catch (IOException e) {
					System.out.println("Ŭ���̾�Ʈ close���� IO���� �߻�");
				}
		

	}//main

}//class
