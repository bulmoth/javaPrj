package client;

import java.io.IOException;
import java.util.Scanner;

import server.ServerMain;

public class Thread2Run implements Runnable{

	@Override
	public synchronized void run() {
		
		Scanner sc = new Scanner(System.in);
		boolean isClose = false;
		String msg = "";
		
		while(!isClose) {
			msg = sc.nextLine();	//���� �����ͷ� �޼��� ����
			
			try {
				ServerMain.bw.write(msg);	
				ServerMain.bw.flush();		//���� ����
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ ������2���� IO���� �߻�");
				break;
			}
			if(msg.equals("close")) {		//close�� ����
				isClose = true;
			}
			
		}
		
		System.out.println("Ŭ���̾�Ʈ �߽źο��� �����");
		
	}

}
