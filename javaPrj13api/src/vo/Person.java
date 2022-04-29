package vo;

public class Person {
	
	//필드에 맞게 생성자
		public Person(String name, int age, double height, double weight, char gender) {
			super();
			this.name = name;
			this.age = age;
			this.height = height;
			this.weight = weight;
			this.gender = gender;
		}
	
	//필드
	//이름, 나이, 키, 몸무게, 성별
	private String name;
	private int age;
	private double height;
	private double weight;
	private char gender;
	
	//getter/setter
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public char getGender() {
		return gender;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	//toString
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + ", gender="
				+ gender + "]";
	}

}
