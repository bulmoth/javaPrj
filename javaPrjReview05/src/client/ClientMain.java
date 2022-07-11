package client;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

import common.Reader;
import common.Sender;

public class ClientMain {
	
	public static String name;

	public static void main(String[] args) {
		
		//���� �޼��� �Է� �ޱ�
		Scanner sc = new Scanner(System.in);
		System.out.print("����� �̸� : ");
		name = "[" + sc.nextLine() + "] ";
		
		System.out.print("���� ip : ");
		String ip = sc.nextLine();
		
		System.out.print("���� port : ");
		String port_ = sc.nextLine();
		int port = Integer.parseInt(port_);
		
		try {
			Socket s = new Socket(ip, port);
			
			//������ �̿��ؼ� ������ �ְ�ޱ�
			//������ ������ ������ ����
			new Thread(new Sender(s)).start();
			//������ �޴� ������ ����
			new Thread(new Reader(s)).start();
			
			System.out.println("���� �Ϸ�!");
		} catch (IOException e) {
			System.out.println("���� ���� �� ���� �߻�!!");
			e.printStackTrace();
		}
		

	}

}
