package person.main;

import person.obj.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		System.out.println("PersonMain Ŭ������ main �޼ҵ� ȣ��� ...");
		System.out.println("====================================");
		
		// Person Ŭ������ �̿��ؼ�, ��ü�� ����
		//������ ��ü�� ������ ����Ұ���. �׷��ϱ� ����ϱ� ���ؼ� ��򰡿� ��Ƶΰڴ�(������ ��´�)...!
		Person p1 = new Person();	//Ŭ������ Ÿ���� �� �� ����
		
		System.out.println("��ü �� ����� ���� Ȯ�� ::: " + p1);		//�ּҰ��� � �ٸ� ������� ������,,,��ü�� ������ �ִ� ������ id
		
		//��ü�� ������ ��������~~~
		p1.walk();
		p1.say();
		p1.eat();
		
		//p1.name �� �ֱ�
		p1.name = "�̸�";
		System.out.println("p1.name ::: " + p1.name);
		
		//�ٸ� �� �ֱ�
		p1.age = 26;
		p1.birth = "971121";
		p1.gender = 'F';
		p1.location = "����";
		p1.skin = "Ȳ����";
		p1.weight = 50;
		p1.height = 160;
		
		p1.introduce();
		
		
		
		
	}//main

}//class
