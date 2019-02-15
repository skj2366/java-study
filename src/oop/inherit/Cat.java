package oop.inherit;

public class Cat extends Animal {
	Cat(int age, String type){
		this.age = age;
		this.type = type;
	}
	
	public static void main(String[] args) {
		Cat cat = new Cat(6, "샴");
		cat.eat();
		cat.sleep();
		cat.run();
		Dog dog = new Dog(9,"포메라니안");
		dog.eat();
		dog.sleep();
		dog.run();
		
		Animal dog2 = new Dog(9,"가을");
		dog2.eat();
		dog2.sleep();
		dog2.run();
		
		//Dog dog = new Animal(); => 불가능 ! 
	
	}
	
}
