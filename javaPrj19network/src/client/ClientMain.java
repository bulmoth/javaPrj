package client;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientMain {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		//Ŭ���̾�Ʈ
		System.out.println("Ŭ���̾�Ʈ ����");
		
		//������ ���� ���� ���� ���ڷ� ����
		Socket s = new Socket("127.0.0.1", 12345);	
		
		//stream ���
		OutputStream os = s.getOutputStream();	//1 byte
		OutputStreamWriter osw = new OutputStreamWriter(os);	//2 byte
		BufferedWriter bw = new BufferedWriter(osw);	//���� ��Ʈ������ ���� ���
		
		//�Է¹ް�, write ���ֱ�
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		
		bw.write(msg);
		bw.flush();	//�Ȱ� ���� �����ϱ� flush����
		
		
		//����� �ڿ� �ݳ�
		bw.close();
		
		
		
	}//main

}//class
