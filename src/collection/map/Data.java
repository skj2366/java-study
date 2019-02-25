package collection.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Data {
	public static void main(String[] args) {
		List<HashMap<String,String>> list = new ArrayList<>();
		for(int i=1;i<=10;i++) {
			HashMap<String,String> hm = new HashMap<>();
			hm.put("name","Rion" +i);
			hm.put("age",""+i);
			list.add(hm);
		}
		System.out.println(list);
	}
}

//데이터 베이스에 접근하면 제일 많이 사용하게될 구조;
