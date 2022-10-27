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
		
		//한바퀴 돌며 제일 작은거 찾기(인덱스 구하기)
		//맨 앞에다 넣기
		
		//위 작업을 반복
		
		for(int n=0; n<arr.length; n++) {
			int minIdx = n;
			for(int i=n; i<arr.length; i++) {
				if(arr[minIdx] > arr[i]) {
					//minIdx 갱신
					minIdx = i;
				}
			}
			
			//맨 앞에 넣기
			int temp = arr[minIdx];
			arr[minIdx] = arr[n];
			arr[n] = temp;
		}
	}

	public static void bubbleSort(int[] arr) {
		
		//숫자 맨 앞부터 2개씩 비교(인접한 2개 요소 == i번째 요소, i+1번째 요소)
		//만약에, 자리가 이상하면(==왼쪽이 오른쪽보다 더 크다(==i번째 요소 > i+1번째 요소)) 둘이 자리 바꿈
		
		//위 작업을 반복
		
		
		//int i = 0; //0 ~ arr.length-2
		
		for(int n=0; n<arr.length-1; ++n) {
			for(int i = 0; i<arr.length-1-n; ++i) {
				if(arr[i] > arr[i+1]) {
					//swap(자리바꿈)
					int temp = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}
	}

}//class
