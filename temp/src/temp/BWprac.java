package temp;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BWprac {
	
	public void test4(){
		
		//���� ��ü ����
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		
		//��Ʈ�� ����
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f, true))){
			
			bw.append("\n�̰Ե�?");
			bw.append("\n��ο���");
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("IO���� ���� �߻�");
		}
		
		
	}

}
