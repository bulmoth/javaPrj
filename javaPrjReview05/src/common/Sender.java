package common;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

import client.ClientMain;

public class Sender implements Runnable{
	
	private final Socket s;
	
	public Sender(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		
		//��Ʈ�� ����
		try {
			OutputStreamWriter osw = new OutputStreamWriter(s.getOutputStream());
			
			BufferedWriter bw = new BufferedWriter(osw);
			
			Scanner sc = new Scanner(System.in);
			while(true) {
				String msg = sc.nextLine();
				bw.write(ClientMain.name + msg );
				bw.newLine();
				bw.flush();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//���ѹݺ�, ������ ������
		
	}

}//class
