package main;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("===== ���� ó�� =====");
		
		//����(�ʹ� ũ��Ƽ�� ���� ���� ����) ~= ����
		
		/*
		 * ����
		 * ������ ����
		 * ��Ÿ�� ����
		 * 
		 * ���� �߻���Ű��
		 * throw
		 */
		
		Test t = new Test();
		MyException me  = new MyException();
		try {	//�߰�ȣ �� �����ض�~~
			t.methodA();
		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println("���� �޼ҵ忡�� Exception catch");
			System.out.println("e �� Ŭ���� ::: " + e.getClass());
			if(e instanceof MyException) {
				System.out.println("��� ���� ���ܴ� MyException Ÿ��");
				me.say();
			}
		}
		
		
		//���� ���� ���� ó���غ� ������
//		try {
//			throw new MyException();
//		}catch(Exception e){
//			System.out.println("���� ���� ���� ����");
//		}
		
		
//		try {
//			t.test();
//		} catch (Exception e) {
//			System.out.println("���θ޼ҵ忡�� Exception�� catch��");
//		}
		
//		System.out.println("�ȳ��ϼ���");
//		
//		try {
//			String str = null;
//			String strSub = str.substring(2, 5);
//			System.out.println(strSub);
//			int x = 1 / 0;
//		}catch(ArithmeticException e) {
//			System.out.println("AE �����");
////			System.out.println(e/*.toString()*/);
////			e.printStackTrace();
//		}catch(Exception e) {
//			System.out.println("���� �����");
//		}
//		
//		
//		System.out.println("���̹���");
		
		
		
		
		
		

	}//main

}//class
