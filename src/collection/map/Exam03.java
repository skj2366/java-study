package collection.map; // 2019.03.06

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Exam03 {

	static final List<Map<String,String>> LIST;
	static {
		LIST = new ArrayList<>();
		Map<String,String> game = new HashMap<>();
		game.put("이름","슈퍼마리오");
		game.put("가격","30000");
		LIST.add(game);
		game = new HashMap<>();
		game.put("이름","스트리트파이터2");
		game.put("가격","40000");
		LIST.add(game);
		game = new HashMap<>();
		game.put("이름","스트리트파이터3");
		game.put("가격","43000");
		LIST.add(game);		
		
	}
	
	public static Map<String,String> searchGame(String name){
		
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> game = LIST.get(i);
			if(name.equals(game.get("이름"))) {
				return game;
			}
		}
		return null;
	}
	public static List<Map<String,String>> searchGameList(String name){
		List<Map<String,String>> gameList = new ArrayList<>();
		for(int i=0;i<LIST.size();i++) {
			Map<String,String> game = LIST.get(i);
			if(game.get("이름").indexOf(name)!= -1) {
				gameList.add(game);
			}
		}
		return gameList;
	}
	public static void main(String[] args) {
		//System.out.println(LIST.size());
//		for(int i=0;i<LIST.size();i++){
//			if("슈퍼마리오".equals(LIST.get(i).get("이름"))) {
//				System.out.println(LIST.get(i));
//			}
//		}
		/////밑에가 쌤님 답//////////////////////
//		for(int i=0;i<LIST.size();i++) {
//			Map<String,String> gameMap = LIST.get(i);
//			if(gameMap.get("이름").equals("슈퍼마리오")) {
//				System.out.println(gameMap);
//			}
//		}
		/////////////////////////////////////
		Scanner scan = new Scanner(System.in);
		System.out.print("게임검색 : ");
		String gameScan = scan.nextLine();
//		Map<String,String> game = searchGame(gameScan);
//		if(game==null) {
//			System.out.println("야 없다 니가 사라");
//		}else {
//			System.out.println(game);
//		}
		List<Map<String,String>> gameList = searchGameList(gameScan);
		if(gameList.size()==0) {
			System.out.println("검색 결과 없음");
		}else {
			System.out.println(gameList);
		}
				
		
	}
}
