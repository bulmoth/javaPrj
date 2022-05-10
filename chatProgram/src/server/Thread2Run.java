package server;

import java.io.IOException;
import java.util.Scanner;

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
				System.out.println("���� ������2���� IO���� �߻�");
				break;
			}
			if(msg.equals("close")) {		//close�� ����
				isClose = true;
			}
			
		}
		
		System.out.println("���� �߽źο��� �����");
		
		
	}//run

}//class
