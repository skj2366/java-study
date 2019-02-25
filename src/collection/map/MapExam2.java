package collection.map; //2019.02.25

import java.util.HashMap;
import java.util.Set;

public class MapExam2 {
	public static void main(String[] args) {
		HashMap<String,String> map = new HashMap<>();
		map.put("이름","홍길동");
		map.put("나이","33");
		map.put("주소","전라도 광주");
		map.put("직업","도적");
		System.out.println(map);
		
		Set<String> keys = map.keySet(); //키값 뽑아 내기 1. keys 선언 with keyset 
		System.out.println(keys.size()); //keys의 사이즈 출력.	
		for(String key:keys) {
			System.out.println(key + " : " + map.get(key)); 
			// keys를 String key에 집어넣고 출력.
		}  // 제일 쉬운 방법이지만 잘 안쓰이고 Iterator 패턴을 주로 사용한다.
		

		
	}
}
