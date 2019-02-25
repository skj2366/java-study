package collection.list;//2019.02.25

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name; //private는 같은 class 내부에서만 사용 가능 .
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
}

public class PersonList {
	public static void main(String[] args) {
		//Person p = new Person();
		//p.name = "abc";// 그래서 여기서 안됨 .(with 4번라인)
		//p.setName("홍길동");
		//System.out.println(p.getName());
		
		List<Person> pList = new ArrayList<>();
		
		//반복문을 사용해서
		//총 10개의 Person을 생성한 뒤
		//pList에 add 하면 됩니다.
		//각 Person의 이름은 이름1~이름10 입니다.
		
		for(int i=0;i<10;i++) {	
			Person p = new Person();
			pList.add(p);
			p.setName("이름" + (i+1));
			//System.out.println(p.getName());
		}
		
		for(int i=0;i<10;i++) {	
			Person p = pList.get(i);
			System.out.println(p.getName());
		}
		
	}
}
