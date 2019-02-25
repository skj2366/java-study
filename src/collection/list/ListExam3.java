package collection.list;//2019.02.25

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam3 {

	public static void main(String[] args) {
//		ArrayList<String> al =  new ArrayList<>();
//		LinkedList<String> ll = new LinkedList<>();
//		Vector<String> v = new Vector<>();
		
		List<String> al =  new ArrayList<>();
		List<String> ll = new LinkedList<>();
		// 순서 없음, 앞 뒤의 인자(?)를 기억해서 링크처럼 연결되어서 위치를 알수있음.
		List<String> v = new Vector<>();  // 세가지 리스트들은 모드 implements 로 List를 받고있다 .
		//Vector List는 현재는 사용하지 않음.
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
		al.add("1");
		ll.add("1");
		v.add("1");
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
		al.add("2");
		ll.add("2");
		v.add("2");
		
		System.out.println(al);
		System.out.println(ll);
		System.out.println(v);
		
		
	}
}
