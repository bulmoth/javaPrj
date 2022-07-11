package server;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ServerMain {
	
	public static final Queue<String> msgQueue = new LinkedList<String>();
	public static final List<BufferedWriter> bwList = new ArrayList<>();

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(12345);
			
			//������ ������ ������
			new Thread(new ServerSender()).start();
			
			while(true) {
				System.out.println("���� �����...");
				Socket s = ss.accept();
				System.out.println(s.getRemoteSocketAddress() + "�����...");
				
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
				bwList.add(bw);
				
				//������ �д� ������
				new Thread(new ServerReader(s)).start();
			}
			
		} catch (IOException e) {
			System.out.println("���� ����...�Ф�");
			e.printStackTrace();
		}

	}

}
