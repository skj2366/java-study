package collection.map;//2019.02.26

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MapExam3 {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
		map.put(1,"가만두지 않겠다.");
		map.put(2,"마지막이다.");
		map.put(3,"음.....");
		
		System.out.println(map);
		HashMap<String,Object> cat = new HashMap<>();//장점 : 플렉시블(유연)하다. 단점  :찾기가 힘들다.
		cat.put("name","냥이1");
		cat.put("age",11);
		//cat.put("kind","샴");
		System.out.println(cat);
		//System.out.println(cat.get("Kind").equals("샴")); //NullPointerException 발생
		
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		//고양이 이름은 냥이1~냥이10
		//나이는 랜덤으로 1살부터 30살까지
		List<HashMap<String,Object>> catList = new ArrayList<>();
		for(int i=0;i<10;i++) {
			
//			HashMap<String,Object> c = new HashMap<>();
//			c.put("name","냥이"+(i+1));
//			c.put("age",(int)(Math.random()*30)+1);
//			catList.add(c);
			
			cat = new HashMap<>(); //위 주석과 이 소스 둘다 사용가능
			cat.put("name","냥이"+(i+1));
			cat.put("age",(int)(Math.random()*30)+1);
			catList.add(cat); 
		}
		
		System.out.println(catList);//가로 출력
		
		for(int i=0;i<10;i++) { // 세로출력
			HashMap<String,Object> c = new HashMap<>();
			c = catList.get(i);
			System.out.println(c);
		}
	}
}
