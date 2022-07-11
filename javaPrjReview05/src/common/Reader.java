package common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Reader implements Runnable{

	private final Socket s;
	
	public Reader(Socket s) {
		this.s = s;
	}

	@Override
	public void run() {
		
		//������ �б�
		
		//��Ʈ�� ���� (+���� ��Ʈ��)
		InputStreamReader isr;
		try {
			isr = new InputStreamReader(s.getInputStream());
			BufferedReader br = new BufferedReader(isr);
			
			
			while(true) {
				String msg = br.readLine();
				System.out.println(msg);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}//run
	
}//class
