package practice;

import java.util.Scanner;

public class Problem05 {

	public static void main(String[] args) {

		//������ �Է¹ް�, 1���� �Է¹��� ������ ����ϴ� ���α׷��� ���弼��. ��, ¦���� ������� �ʴ´�.
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
//		for(int i=1; i <= input; i=i+1) {
//			if(i%2 == 1) {
//				System.out.println(i);
//			}
//		}
		
		//�Է�
		
		//�ݺ���(1~�Է°�, 1�� �����ϸ鼭)
		for(int x=1; x<=input; x=x+1) {	//�����Ŀ��� +1�� �ƴ϶� +2��� �Ἥ �ذ��ϱ�
			// if�� �̿��ؼ� Ȧ���� ����ϰ�
			if(x % 2 == 0) {	//¦��
				continue;
			}
			System.out.println(x);
		}
		
		
		
		
	}

}
