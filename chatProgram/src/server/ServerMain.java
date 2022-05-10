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
		
		//����
			
		try {
			ss = new ServerSocket(13579);	//���� ���� ����
			System.out.println("�ٸ� ������ ������ ��ٸ�����...");
			cs = ss.accept();		//���� ���Ͽ��� ���� ���� ����
		} catch (IOException e) {
			System.out.println("���� ���Ͽ��� IO���� �߻�");
		}
		
		InetAddress ip = cs.getInetAddress();		//���� ������ ip ����
		
		System.out.println("����� Ŭ���̾�Ʈ�� ip : " + ip);
		
		//inputStream, outputStream ����
		try {
			br = new BufferedReader(new InputStreamReader(cs.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(cs.getOutputStream()));
		} catch (IOException e) {
			System.out.println("���� ������Ʈ������ IO���� �߻�");
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
			System.out.println("���� close���� IO���� �߻�");
		}

	}//main

}//class
