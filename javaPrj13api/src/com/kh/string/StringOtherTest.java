package com.kh.string;

public class StringOtherTest {
	
	//���ڿ� ���� 3����
	
	//1. String
	//2. StringBuffer
	//3. StringBuilder
	
	public void test() {
		//String
		//�� ���ڿ��� ��ĥ �� ���ο� ���ڿ��� ����
		String str = new String("zzz");
		String str2 = "zzz";
		
		//StringBuffer
		//���ڿ� �ٷ� ���������
		//�� ���ڿ��� ��ĥ �� ������ �Ϳ� �ٿ��ִ´�
		//thread(�ϲ۰�����) safe
		StringBuffer sb = new StringBuffer("buffer~~");
		sb.append("123");		//�ڿ��� ���� ��
		sb.insert(0, "zzz");	//�տ��� ���� ���� insert�� offset�� 0���� �ξ ����
		System.out.println(sb);
		
		//StringBuilder
		//���ڿ� �ٷ� ���������
		//�� ���ڿ��� ��ĥ �� ������ �Ϳ� �ٿ��ִ´�
		//thread unsafe
		StringBuilder sbd = new StringBuilder("builder~~~~~");
		sbd.append("123");
		System.out.println(sbd);
	}

}//class
