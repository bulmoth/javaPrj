package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestFile {
	
	public void test(){	//fis�� ���ܸ� ������ ������, read()�� ���ܸ� ����....���� ������ ���� �� ����
		
		//���� ��ǲ ��Ʈ��
		
		//���� ��ü
		File f = new File("C:\\dev\\abc.txt");	//������ ��, ���� ���� ��������� �� (���)
		
		boolean result = f.isFile();
		System.out.println(result);
		
		//���Ͽ��� ������ �б�
		//1. ����
		//2. ��ǲ ��Ʈ��(���α׷��� �����̶� ��ǲ) (FileInputStream)
		
		//����
		//1. ���ڰ� �ƴ϶� ���ڷ� �о�� >> char�� ĳ�����ؼ�...������� ó��
		//2. �ѱ��ڹۿ� ������
		
//		FileInputStream fis = new FileInputStream(f);
//		int data = fis.read();		//������ �� ù���� ù����...�� int���� ����
		FileReader fr = null;
		try {
			fr = new FileReader(f);	//FileNotFoundException
			
			int data;
			while((data = fr.read()) != -1) {	//IOException
//				int data = fr.read();
//				//������ �������� ������ �ݺ� ����
//				if(data == -1) {
//					break;
//				}
				System.out.print((char)data);
			}
		}catch(FileNotFoundException fe) {
			System.out.println("������ ��ã��,,,��");
		}catch (IOException e) {
			System.out.println("����� ���� �߻�~!");
		}finally {
			//���ܰ� �߻����ο� ��� ���� ������ ������ �Ǿ�� �ϴ� �ڵ� �ۼ�
			try {fr.close();} catch (IOException e) {System.out.println("close �� ���� �߻�");}
		}
		
	
		
	}
	
	public void test2() {
		
		System.out.println("���Ͽ� �۾� �Է��ϱ�");
		
		String str = new Scanner(System.in).nextLine();		//System.in : inputStream�� ����..System Ŭ������ �ִ� static ����
		//���Ͽ��ٰ� �۾� ����
		
		//1. ���� ���� ���(���� ��ü ����)
		
		
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		//2. �����̶� ����(�����̶� ����� ��Ʈ��)
		FileWriter fw = null; 		//finally���� close �ؾ��ϹǷ�, ���⼭ ���� //���������� null�� �ʱ�ȭ ������...
		try {
			fw = new FileWriter(f);
			//3. ��Ʈ�� �̿��ؼ� ������ ����
			fw.write(str);
			fw.flush();		//stream �ȿ�, ���� �ȿ� ���۵��� ���� �����͵��� �������� �� �־ ���ִ� �۾� >> flush���ָ� ���Ϸ� ���޵�. �����ֱ�
		} catch (IOException e) {
			System.out.println("����� ���� �߻� ~!");
		}finally {
			try {fw.close();} catch (IOException e) {e.printStackTrace();}
		}
		
		
	}
	
	/*
	 * ������Ʈ�� Ȱ���ؼ� �Է¹ޱ�
	 * (BufferedReader) : ���ڿ� ó���ҰŴϱ� Reader ���Ű�, Buffer �� ����ϰ� ����
	 */
	public void test3() {
		
		//���� ��ü ����
		String path = "C:\\dev\\abc.txt";
		File f = new File(path);
		
		//��Ʈ�� ����
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String s = null;
			while((s = br.readLine()) != null) {
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("���� ��ã��");
		} catch (IOException e) {
			System.out.println("�дٰ� ������");
		} 
		
	}
	
	//BufferedWriter ����غ���...�ǽ���
	public void test4() {
		
	}

}//class
