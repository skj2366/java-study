package collection.map;//2019.0306

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exam01 {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","22");
		map.put("주소","서울");
		
		Map<String, String> map1 = new HashMap<>();
		map1.put("이름","2길동");
		map1.put("나이","23");
		map1.put("주소","대구");
		
		Map<String, String> map2 = new HashMap<>();
		map2.put("이름","3길동");
		map2.put("나이","24");
		map2.put("주소","대전");
		
		List<Map<String,String>> mapList = new ArrayList<>();
		mapList.add(map);
		mapList.add(map1);
		mapList.add(map2);
		
		System.out.println(mapList.get(1).get("이름"));
		
	}
}
