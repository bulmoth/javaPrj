package ifelse;

import java.util.Scanner;

public class N1068 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int input = sc.nextInt();
		
		System.out.print("����� ������ : ");
		if(90<=input && input<100) {
			System.out.println("A");
		}else if(70<=input && input<90){
			System.out.println("B");
		}else if(40<=input && input<70){
			System.out.println("C");
		}else if(0<=input && input<40){
			System.out.println("D");
		}else {
			System.out.println("�߸��� ���� �Դϴ�.");
		}
		
		
	}

}
