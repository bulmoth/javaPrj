package server;

import java.io.BufferedWriter;

public class ServerSender implements Runnable{

	@Override
	public void run() {
		
		while(true) {
			try {
				Thread.sleep(10);
				//�޼��� ť���� ������ ������
				String msg = ServerMain.msgQueue.poll();
				
				if(msg==null) continue;
				
				//���� ������ ������
				for(BufferedWriter bw : ServerMain.bwList) {
					bw.write(msg);
					bw.newLine();
					bw.flush();
				}
				
			}catch(Exception e){
				System.out.println("�޼��� ���� �� ���� �߻�!!");
				e.printStackTrace();
			}
		}
		
	}//run
	
	

}
