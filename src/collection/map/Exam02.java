package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class Exam02 {

	public static void main(String[] args) {
		List<String> intList = new ArrayList<>();
		intList.add("1");
		intList.add("2");
		intList.add("3");
		for(int i=0;i<intList.size();i++) {
			System.out.println(intList.get(i));
		}
		
		Map<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","22");
		map.put("주소","서울");
		map.put("특기","술푸기");
		//////////////Iterator 패턴////////////////////
		Iterator<String> it = map.keySet().iterator();
		
		while(it.hasNext()) {
			String key = it.next();
			System.out.println("key : " + key);
			System.out.println("value : " + map.get(key));
			
		}
		//////////////Iterator 패턴 끝//////////////////
		
		////////////출력////////////////////////////
		/*key : 이름
		value : 홍길동
		key : 주소
		value : 서울
		key : 나이
		value : 22
		key : 특기
		value : 술푸기*/
	}
}
