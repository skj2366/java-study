package exam.ex03;

public class Dog {
	
	private String name;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) { //get set 메소드 자주사용한다. 그 중 set 메소드.
		this.age = age;
	}

	public int getAge() {
		return this.age;
	}
	
//	public static void main(String[] args) {
//		Dog dog = new Dog();
//		dog.name = "카드";
//		dog.back();
//		dog.setAge(10);
//		System.out.println(dog.age);
//		Dog dog2 = new Dog();
//		dog2.setAge(20);
//		System.out.println(dog2.age);
//	}

}
