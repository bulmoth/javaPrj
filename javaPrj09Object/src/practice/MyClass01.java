package practice;

public class MyClass01 {

	//��ü ����
	//��ü�� �޼ҵ� ȣ��
	public String name;		//Heap ������ ����
	public int age;
	
	
	/*
	 * �������� vs �ʵ�(==�ν��Ͻ�����==��������==Ŭ��������==�������)
	 * -���� ���� �̸��� ����� �� �ִ�.
	 * -�޼ҵ� �ȿ����� ���������� ���õȴ�.
	 * -this.������ ���� ���ָ� �ʵ� �� ���õȴ�.
	 */
	
	public void introduce() {
		String name = "������������";
		this.name = "�޼ҵ� �ȿ��� ���� �̸�������";		//Stack ������ ����		//this : ���� ��ü(��������)
		System.out.println("�ȳ� ���� MyClass01 Ÿ���̾�");
		System.out.println("�� �̸��� " + name);
		System.out.println("�� ���̴� " + age);
	}
	
	public void myMethod01() {
		System.out.println("MyClass01 �� myMethod01 ȣ���,,");
	}
	
	public void myMethod02() {
		System.out.println("MyClass01 �� myMethod02 ȣ���....");
	}
	
	
	
}
