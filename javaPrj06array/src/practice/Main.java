package practice;

public class Main {

	public static void main(String[] args) {

		//���̰� 10�� �迭 ����, �� ��ҿ� 0���� 9���� ���� ä���ֱ�
		
		int[] a = new int[10];
		
		
		//�� ��ҿ� �� �Ҵ�
		for(int i=0; i<10; i++) {
			a[i] = (i+1)*100;
		}

		//�� ��ҿ� �� ���
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		
		
		
	}//main

}//class
