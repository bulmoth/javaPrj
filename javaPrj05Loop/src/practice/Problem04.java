package practice;

import java.util.Scanner;

public class Problem04 {

	public static void main(String[] args) {

		//������ �Է¹ް�, �Է¹��� ������ ����Ѵ�. �� �۾��� ��� �ݺ��Ѵ�. ��, �Է¹��� ������ 0�̶�� ���α׷� ����.
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("������ �Է��ϼ��� : ");
			int input = sc.nextInt();
			if(input == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			System.out.println(input);
			
		}
		
	
		
	}

}
