package mcdonald.emp;

import java.util.Scanner;

public class CounterEmp {
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	int money;
	
	//�ֹ� �ޱ�
	public String order() {
		System.out.println("�ֹ� �����Կ�~~~");
		//�Է¹ޱ� (�ܹ��� �̸�)
		String ham = this.sc.nextLine();		//�������� sc�� ��ĳ�ʸ� �ޱ� ������,,, this ���ֱ�(�Ⱥٿ��� ��������� ���̴°� ���� ���� �ڵ�...���� �������� ��ü�� ��쿡�� ������ �������....��ĳ�ʴ� �������� ��ĳ�ʴϱ�,,)
		//�ֹ����� �ܹ��� �̸� Ȯ��
		System.out.println(ham + " �ֹ� �޾ҽ��ϴ� ~~~");
		return ham;
	}
	
	//����ϱ�
	public void calc() {
		System.out.println("����ҰԿ�~~~~");
		//��������� �� �ޱ� (���ڿ��� �Է¹ޱ�)
		String price = this.sc.nextLine();
		//�� �޾ҽ��ϴ� ����ϱ�
		System.out.println(price + " �� �޾ҽ��ϴ�~~~~");
	}
	

}
