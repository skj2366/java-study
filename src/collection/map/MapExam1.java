package collection.map;//2019.02.25

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam1 {

	public static void main(String[] args) {
		HashMap<String,String> hm = new HashMap<>();
		// 키에대한 데이터타입, 구성원에대한 데이터타입 두가지를 선언해줘야함.
		hm.put("이름", "홍1길동");
		hm.put("이름", "홍2길동1");
		System.out.println(hm);
		System.out.println(hm.get("이름"));
		
		List<String> ll = new ArrayList<>();
		for(int i=0;i<5;i++) {
			ll.add("이름" + i);
		}
		
//		List<HashMap<String,String>> ll = new ArrayList<>(); //이런것도 가능...
		System.out.println(ll);
		
	}
}
