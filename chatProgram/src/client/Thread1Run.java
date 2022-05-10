package client;

import java.io.IOException;

import server.ServerMain;

public class Thread1Run implements Runnable{

	@Override
	public synchronized void run() {
		
		String msg = "";
		boolean isClose = false;
		while(!isClose) {
			//���� ���� ������ ����
			try {
				msg = ServerMain.br.readLine();		//���� ���� �̿��ؼ� �޼��� ���� ����
				if(msg == null) {
					msg = "";
					wait(500);
				}
			} catch (IOException e) {
				System.out.println("Ŭ���̾�Ʈ ������1���� IO���� �߻�");
				break;
			} catch (InterruptedException e) {
				System.out.println("Ŭ���̾�Ʈ ������1���� Interrupt���� �߻�");
			}
			System.out.println(msg);	//�޼��� ���
			if(msg != null&&msg.equals("close")) {	//close�� ������ ����
				isClose = true;
			}
		}
		
		System.out.println("Ŭ���̾�Ʈ ���źο��� �����");
		
	}

}
