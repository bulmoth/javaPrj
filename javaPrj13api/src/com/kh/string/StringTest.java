package com.kh.string;

public class StringTest {
	
	public void test() {
		
		//charAt
		//���ڿ����� Ư�� �ε����� '����'�� ������
		String s = "abcdefg";
		
		char ch = s.charAt(0);
		System.out.println("ch = " + ch);
		
	}
	
	public void test2() {
		//compareTo
		//���������� �������� ��, ���̸� ����, ������ 0, �ڸ� ���
		String s = "a";
		String s2 = "d";
		int x = s.compareTo(s2);
		System.out.println(x);
	}
	
	public void test3() {
		//concat
		//���ڿ� ������
		String s = "abc";
		String s2 = "zzz";
		
		String x = s.concat(s2);
		System.out.println(x);
	}
	
	public void test4() {
		//equals
		//���ڿ� ������ ��(��ҹ��� ����)
		String s = "abc";
		String s2 = "abc";
		System.out.println(s.equals(s2));
	}
	
	public void test5() {
		//equalsIgnoreCase
		//���ڿ� ������ �豳(��ҹ��� ����)
		String s = "abc";
		String s2 = "aBc";
		System.out.println(s.equalsIgnoreCase(s2));
	}
	
	public void test6() {
		//length
		//���ڿ��� ���̸� ���������� ����
		String s = "ab c";
		System.out.println(s.length());
	}
	
	public void test7() {
		//replace
		//Ư�� ���ڸ� ���ϴ� ���ڷ� �ٲ���
		String s = "abc1111111123";
		String x = s.replace('1', 'S');
		System.out.println(s); //������ ���ڿ��� �״��
		System.out.println(x); //���� ���� ���ڿ��� ������
	}
	
	public void test8() {
		//substring
		//���ڿ��� Ư�� ������ �߶�
		//�����ε��� ~ ��
		//�����ε��� ~ Ư������
		String s = "abc12345";
//		String x = s.substring(2);
		String x = s.substring(2, 5);
		System.out.println(s);
		System.out.println(x);
	}
	
	public void test9() {
		//toUpperCase
		String s = "abc123";
		String x = s.toUpperCase();
		System.out.println(x);
		String low = test10(x);
		System.out.println(low);
	}
	
	public String test10(String str) {
		//toLowerCase
		return str.toLowerCase();
	}

}//class
