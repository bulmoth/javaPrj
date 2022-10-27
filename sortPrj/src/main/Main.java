package main;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//sort (bubble)
		
		int[] arr = new int[] {10, 8, 3, 5, 1};

		System.out.println(Arrays.toString(arr));
		//bubbleSort(arr);
		selectionSort(arr);
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void selectionSort(int[] arr) {
		
		//�ѹ��� ���� ���� ������ ã��(�ε��� ���ϱ�)
		//�� �տ��� �ֱ�
		
		//�� �۾��� �ݺ�
		
		for(int n=0; n<arr.length; n++) {
			int minIdx = n;
			for(int i=n; i<arr.length; i++) {
				if(arr[minIdx] > arr[i]) {
					//minIdx ����
					minIdx = i;
				}
			}
			
			//�� �տ� �ֱ�
			int temp = arr[minIdx];
			arr[minIdx] = arr[n];
			arr[n] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {
		
		//���� �� �պ��� 2���� ��(������ 2�� ��� == i��° ���, i+1��° ���)
		//���࿡, �ڸ��� �̻��ϸ�(==������ �����ʺ��� �� ũ��(==i��° ��� > i+1��° ���)) ���� �ڸ� �ٲ�
		
		//�� �۾��� �ݺ�
		
		
		//int i = 0; //0 ~ arr.length-2
		
		for(int n=0; n<arr.length-1; ++n) {
			for(int i = 0; i<arr.length-1-n; ++i) {
				if(arr[i] > arr[i+1]) {
					//swap(�ڸ��ٲ�)
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}//class
