package collection.list;

import java.util.List;
import java.util.ArrayList;
class Person2{
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}

public class PersonList2 {
	
	public static void main(String[] args) {
//		Person2 p = new Person2();
//		Person2 p2 = p;
//		
////		p.setName("hong");
////		p.setName("black");
////		
////		System.out.println(p.getName());
////		System.out.println(p2.getName()); // 참조하는 주소가 같아져서 black 출력됨.
////		
////		p2.setName("222");
////		System.out.println(p.getName());
////		System.out.println(p2.getName()); // 이것도 마찬가지라서 둘다222가 출력.
//		
//		p2 = new Person2();
//		p2.setName("hong");
//		System.out.println(p.getName());
//		System.out.println(p2.getName());
		
		/////////////////////////////////////////////////////////
		
//		List<Person2> pList = new ArrayList<>();
//		Person2 p =new Person2();
//		for(int i=0;i<10;i++) {
//			p.setName("홍길동"+i);
//			pList.add(p);
//		}
//		for(int i=0;i<10;i++) {
//			Person2 p2 = pList.get(i);
//			System.out.println(p2.getName());
//		} // => 출력시 홍길동9만 10번 출력 . Person2 p = new Person2(); 가 for 밖에있어서 setName의 값들이 같은 방향을 바라보게 되어서 ?? 아니면 getName의 값들이 같은 메모리들을 바라보고 있어서 ... 암튼 그럼.
		
		List<Person2> pList = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Person2 p =new Person2(); // 얘가 뽀인트.
			p.setName("홍길동"+i);
			pList.add(p);
		}
		for(int i=0;i<10;i++) {
			Person2 p2 = pList.get(i);
			System.out.println(p2.getName());
		}//=> 홍길동 0 부터 9까지 출력.
		
		
	}
}
