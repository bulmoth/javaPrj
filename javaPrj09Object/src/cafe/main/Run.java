package cafe.main;

import cafe.employee.CounterEmp;
import cafe.employee.KitchenEmp;

public class Run {

	public static void main(String[] args) {
		
		//��ü�� �޼ҵ� ���
		//��ü�� ������(����) ���� ����

		System.out.println("cafe open ~~~~");
		System.out.println("==========================");
		
		
		CounterEmp ce = new CounterEmp();
		KitchenEmp ke = new KitchenEmp();
		
		ce.order();
		ce.calc();
		ke.cook();
		ke.complete();
		
		ce.nick = "�ɿ���";
		ke.nick = "������";
		
		System.out.println("ī���� ���� �г��� : " + ce.nick);		//String �⺻�� null...String �� �������̾�..��..!������
		System.out.println("�ֹ� ���� �г��� : " + ke.nick);
		
		//int : 0
		//float : 0.0f
		//char : �ƽ�Ű�ڵ� 0��
		//boolean : false
		//String : null //���ڿ� == ���� �迭 // �迭 == ��ü // int[] == ��ü // char[] == ��ü
		//������ : null
		//String �� Ŭ������......������
		
		
		
		
		
		
	}//main

}//class
