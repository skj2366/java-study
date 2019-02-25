package collection.list;//2019.02.25

import java.util.ArrayList;
import java.util.List;

public class CustomList {

	private String[] values;
	
	public CustomList() {
		values = new String[0]; //ArrayList 처럼 쓰기 위하여 [0]으로 선언.
	}
	
	public void add(String value) {
		String[] tmp = this.values;
		this.values = new String[this.values.length+1];
		for(int i=0;i<tmp.length;i++) {
			this.values[i] = tmp[i];
		}
		this.values[this.values.length-1] = value;
	}
	
	public int size() {
		return this.values.length;
	}
	
	public String toString() {
		String r = "[";
		for(String str : this.values) {
			r += str +",";
		}
		r = r.substring(0,r.length() -1); // 마지막의 ,를 없애는 법 !
		r += "]";
		return r;
	}
	
	
	public static void main(String[] args) {
		CustomList cl = new CustomList();
		System.out.println(cl.size());
		cl.add("str");
		cl.add("str");
		System.out.println(cl.size());
		System.out.println(cl);
		
		List<String> list = new ArrayList<>();
		list.add("str");
		list.add("str");
		System.out.println(list.size());
		System.out.println(list);
		System.out.println(list.indexOf("str"));
		System.out.println(list.lastIndexOf("str"));
		
		System.out.println("----------------------");
		//System.out.println(cl.indexOf(new String("str")));
	}
}
