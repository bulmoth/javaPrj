package main;

public class Test {
	
	MyException me  = new MyException();
	
	public void test() throws Exception {
		
		//���ܸ� ���� ���� �߻���Ű��
		
//		try {
//			throw new Exception();	//������. Exception ��ü��
//		}catch(Exception e) {
//			System.out.println("���� ����");
//		}
		
		throw new Exception();	//Throwable Ÿ���� ��ü(����)�� ���� �� ����
		
	}
	
	public void methodA() throws Exception {
		System.out.println("Method A ȣ���");
		try {
			methodB();
		}catch(Exception e) {
			throw me;
		}
		
		System.out.println("Method A ����");
	}
	
	public void methodB() throws Exception {
		System.out.println("Method B ȣ���");
		methodC();
		System.out.println("Method B ����");
	}
	
	public void methodC() throws Exception {
		System.out.println("Method C ȣ���");
		int x = 1 / 0;
		System.out.println("Method C ����");
	}

}//class
