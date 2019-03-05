package oop.inter;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExam {

	public ArrayList<String> selectArrayList(){
		return new ArrayList<>();
		
	}
	
	public LinkedList<String> selectLinkedList(){
		return new LinkedList<>();
		
	}
	
	public List<String> selectList(){ // List 데이터타입으로 선언해서 ArrayList, LinkedList 둘다 사용 가능.
		return new ArrayList<>();
	}
}
