package temp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BWprac {
	
	public void test4(){
		
		//파일 객체 생성
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		
		//스트림 생성
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))){
			
			bw.append("\n이게됨?");
			bw.append("\n헬로월드");
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("IO에서 예외 발생");
		}
		
		
	}

}
