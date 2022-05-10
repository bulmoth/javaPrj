package client;

import java.io.IOException;

import server.ServerMain;

public class Thread1Run implements Runnable{

	@Override
	public synchronized void run() {
		
		String msg = "";
		boolean isClose = false;
		while(!isClose) {
			//서버 수신 쓰레드 실행
			try {
				msg = ServerMain.br.readLine();		//버퍼 리더 이용해서 메세지 한줄 받음
				if(msg == null) {
					msg = "";
					wait(500);
				}
			} catch (IOException e) {
				System.out.println("클라이언트 쓰레드1에서 IO예외 발생");
				break;
			} catch (InterruptedException e) {
				System.out.println("클라이언트 쓰레드1에서 Interrupt예외 발생");
			}
			System.out.println(msg);	//메세지 출력
			if(msg != null&&msg.equals("close")) {	//close가 들어오면 종료
				isClose = true;
			}
		}
		
		System.out.println("클라이언트 수신부에서 종료됨");
		
	}

}
