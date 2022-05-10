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
			msg = sc.nextLine();	//버퍼 라이터로 메세지 받음
			
			try {
				ServerMain.bw.write(msg);	
				ServerMain.bw.flush();		//버퍼 비우기
			} catch (IOException e) {
				System.out.println("서버 쓰레드2에서 IO예외 발생");
				break;
			}
			if(msg.equals("close")) {		//close로 종료
				isClose = true;
			}
			
		}
		
		System.out.println("서버 발신부에서 종료됨");
		
		
	}//run

}//class
