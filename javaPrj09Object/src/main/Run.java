package main;

import java.util.Scanner;

import practice.MyClass01;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("Run Ŭ������ main �޼ҵ� ȣ���..");
		System.out.println("=============================");
		
		//��ü ���� (MyClass01 Ŭ���� ������ �̿��ؼ� ��ü)
//		MyClass01 mc01 = new MyClass01();	//type : MyClass01(Ŭ������ Ÿ���̴�...!!)
		//��ü�� �޼ҵ� ȣ��(MyClass01 Ŭ���� ������ myMethod01 ȣ��)
//		mc01.myMethod01();
//		mc01.myMethod02();
		
		//��ü����
		MyClass01 mc = new MyClass01();	//������ �ϱ� ���� �������� ���� �ؼ�
		//������ >> ���Ӱ� ������(new), (MyClass01()�̶�� Ÿ���� ��ü��) MyClass01()�̶�� Ŭ������ �����ؼ�.
		//���� >> MyClass01�̶�� Ÿ���� �������� mc�� ������(���� ����)
		mc.name = "������";
		mc.age = 26;
		mc.introduce();
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in); //Scanner ��ü�� ����
//		//Scanner��� class file�� ���� ��(new) ��ü�� ����ڴ�
//		sc.nextInt();		//Scanner class�� nextInt()��� �Լ� ���ڴ�~~~
		
		//�������� vs ��ü����
		
		//<��ü����>
		
		//�ؾ
		/*
		 * class : �ؾ Ʋ
		 * ��ü(== Object == instance(ȭ ��Ų��...)) : �ؾ
		 */
		
		//����,,,���赵....
		/*
		 * class : ���Ե�
		 * ��ü : ���赵�� �̿��ؼ� ������� ��ǰ
		 */
		
		//�Ƹ�����Ʈ
		//ö�� ����
		
		/*
		 * <��ü����>
		 * ���Һ���...
		 * [ī���� ����]
		 * -�г���			//������(����)
		 * -�ñ� : 9õ��		
		 * -�ֹ��޴� ���		//�޼ҵ�
		 * -��� ���
		 * 
		 * [�ֹ� ����]
		 * -�г���
		 * -�ñ� : ����
		 * -���� ����
		 * -���� �ǳױ�
		 * 
		 * ���� �޴���(==class)�� ������ ö��, ����(==��ü, object)���� ī�並 �...
		 * 
		 */
		
		
		/*
		 * <��������>
		 * 1. �մ��� ����
		 * 2. �ֹ� ����
		 * 2-1 (�ֹ� ����ϰ� ����, �Ʒ� ���� �������� ����)
		 * 3. ���
		 * 3-1 (�ܾ׺���, �մ��� �θ�..����.,,,�׷��� �Ʒ� ���� ���� ����, ������ �ֹ����� ���)
		 * 4. ���� ����
		 * 5. ���� �ǳ�
		 * >>����������(���ܻ����� �� ����....�޴��� �ʹ� ���....)
		 */
		
		
	}//main

}//class