package collection.list;

import java.util.ArrayList;

public class SearchList {//2019.02.21
	
	public static void main(String[] args) {
		ArrayList<Integer> intList = new ArrayList<>();
		for(int i=1;i<=5;i++) {
			intList.add(i);
		}
		System.out.println(intList.indexOf(7));
	}

}
