package method01;

import java.util.Scanner;

public class MyClass {

	public void test() {
		System.out.println("�ȳ��ϼ���");
		
		Scanner sc = new Scanner(System.in);	//Scanner���� ����, sc�� �����
		int x = sc.nextInt();
		
		judge(x);	//judge��� method�� �����϶�	//x��� ���� ������,,,
		
		
		
	}//test
	
	public void judge(int x) {	//judge(x)�� ������ �� �̸��� ��
		//���� �Ǵ�
		if(x>0) {
			System.out.println("���");
		}else if(x<0) {
			System.out.println("����");
		}else {
			System.out.println("zero");
		}
	}//judge	//method�� -> �� method�� ȣ���ߴ� ������ ���ư�
	
	
}//class
