package com.kh.main;

public class Run3 {

	public static void main(String[] args) {

		//������ �迭
		//2���� �迭
		
		//�迭 ���� ���� = ������ �迭 ����
		int[][] a = new int[3][];
		
		a[0] = new int[4];
		a[0][0] = 10;
		a[0][1] = 20;
		a[0][2] = 30;
		a[0][3] = 40;
		
		//����� for���� �̿��ؼ� ����������
		//�� ĭ�� �����ؾ߸� ����� ����,,,�ļ��θ�������...����
		
		for(int i=0; i<a[0].length;i++) {
			System.out.println(a[0][i]);
		}
		System.out.println(a.length);	
		
	}

}
