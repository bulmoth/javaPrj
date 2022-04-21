package person.main;

import person.obj.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		System.out.println("PersonMain 클래스의 main 메소드 호출됨 ...");
		System.out.println("====================================");
		
		// Person 클래스를 이용해서, 객체를 생성
		//생성한 객체를 앞으로 사용할거임. 그러니까 사용하기 위해서 어딘가에 담아두겠다(변수에 담는다)...!
		Person p1 = new Person();	//클래스도 타입이 될 수 있음
		
		System.out.println("객체 잘 만들어 졌나 확인 ::: " + p1);		//주소값을 어떤 다른 방식으로 보여줌,,,객체가 가지고 있는 고유한 id
		
		//객체를 가지고 여러가지~~~
		p1.walk();
		p1.say();
		p1.eat();
		
		//p1.name 값 넣기
		p1.name = "이름";
		System.out.println("p1.name ::: " + p1.name);
		
		//다른 값 넣기
		p1.age = 26;
		p1.birth = "971121";
		p1.gender = 'F';
		p1.location = "서울";
		p1.skin = "황인종";
		p1.weight = 50;
		p1.height = 160;
		
		p1.introduce();
		
		
		
		
	}//main

}//class
