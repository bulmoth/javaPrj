package chap06array;

public class ArrayTest {

	//�迭
	
	/*
	 * �迭 ���� ���� : int[] a; 	//Ÿ��[] ������; 
	 * �迭 ���� 	  : new int[3]; //new Ÿ��[�迭����];
	 * �迭 ����	  : a[0];		//������[�ε���];
	 * 
	 * <�迭 �ʱ�ȭ> : �迭�� �����ϴ� ���ÿ�, ���� �Ҵ�
	 * new int[]{1,2,3,4,5};
	 * {1,2,3,4,5};
	 * 
	 * - �迭�� �ε����� 0���� �����Ѵ�.
	 */
	
	public void test() {
		
		int[] a;			//�迭 ���� ����
		a = new int[3];		//�迭 ���� �� �Ҵ�
		
		//�迭�� �� ��ҿ� �����ϱ�
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
	
	//�迭(double Ÿ��)
	public void test2() {
		double[] doubleArr = new double[3];
		doubleArr[0] = 1.111;
		doubleArr[1] = 2.222;
		doubleArr[2] = 3.333;
		
		System.out.println(doubleArr[0]);
		System.out.println(doubleArr[1]);
		System.out.println(doubleArr[2]);
		
	}
	
	//�迭(String Ÿ��)
	public void test3(){
		String[] strArr = new String[3];
		strArr[0] = "ù��°";
		strArr[1] = "�ι�°";
		strArr[2] = "����°";
		
		System.out.println(strArr[0]);
		System.out.println(strArr[1]);
		System.out.println(strArr[2]);
	}
	
}//class
