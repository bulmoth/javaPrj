package person.main;

import person.obj.Person;

public class PersonArrayMain {

	public static void main(String[] args) {
		
		//��ü �迭
		//class �� ���� ����
		//��ü ������ ����
		//�������� ��ü�� �迭�� ����

		System.out.println("PersonArrayMain Ŭ������ main �޼ҵ� ȣ��� ...");
		System.out.println("=========================================");
		
		/////////////////////////////�迭�� �̿��ؼ� ����
		//5���� ��ü(person Ÿ��) �� ������ ������
		Person[] pArr = new Person[5];

		for(int i=0; i<5; i++) {
			pArr[i] = new Person();
		}
		
//		pArr[0] = new Person();
//		pArr[1] = new Person();
//		pArr[2] = new Person();
//		pArr[3] = new Person();
//		pArr[4] = new Person();
		
		pArr[0].name = "�ǿ�";
		pArr[1].name = "����";
		pArr[2].name = "�ǻ�";
		pArr[3].name = "�ǻ�";
		pArr[4].name = "�ǿ�";
		
		pArr[0].introduce();
		pArr[1].introduce();
		pArr[2].introduce();
		pArr[3].introduce();
		pArr[4].introduce();
		
		
		////////////////////////////�迭 ���� �׳� ����
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		Person p4 = new Person();
//		Person p5 = new Person();
//		
//		p1.name = "�ǿ�";
//		p2.name = "����";
//		p3.name = "�ǻ�";
//		p4.name = "�ǻ�";
//		p5.name = "�ǿ�";
//		
//		p1.introduce();
//		p2.introduce();
//		p3.introduce();
//		p4.introduce();
//		p5.introduce();
		
		
		
		
		
		
	}//main

}//class
