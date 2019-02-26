package collection.list;//2019.02.26

import java.util.ArrayList;
import java.util.List;

class Cat{
	private String name;
	private int age;
	private Integer ageInteger;
	
	public Cat() {
		super();
	}
	
	public Cat(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + ", ageInteger =" + ageInteger + "]";
	}	
}
class Sham extends Cat{
	
}

public class CatList {

	public static void main(String[] args) {
		Cat cat = new Cat();
		System.out.println(cat);
		System.out.println("---------------");
		List<Cat> catList = new ArrayList<>();
//		catList.add(new Sham());
//		Cat cat2 = new Sham();
//		catList.add(cat2); //시험에 나와용 .
		
		for(int i = 0;i<10;i++) {
			//고양이 이름은 냥이1~냥이10
			//나이는 랜덤으로 1살부터 30살까지
			Cat c = new Cat(); // or cat = new Cat();
			c.setName("냥이" + (i+1));
			c.setAge((int)(Math.random()*30)+1);
			catList.add(c);
		}
		//반복문을 사용해서 위에서 생성된 고양이들을 출력해주세요.
		
		for(Cat c : catList) {
			System.out.println(c);
//			System.out.println(c.getAge());
//			System.out.println(c.getName());
		}
		//향상된 for문을 사용하지 않는다면 ? 밑소스
		for(int i=0;i<10;i++) {
			Cat c = new Cat();
			c = catList.get(i);
			System.out.println(c);
		}
	}
}
