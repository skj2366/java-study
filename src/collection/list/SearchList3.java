package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchList3 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<6;i++) {
			int tmp = (int)(Math.random()*45)+1;
			numList.add(tmp);
			
		}
		System.out.println(numList);
		
		System.out.println(",를 구분자로 숫자 6개를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		String numStr = scan.nextLine();
		System.out.println("입력하신 숫자는 : " + numStr);
		String[] numStrs = numStr.split(",");
		
		int cnt = 0;
//		for(String str:numStrs) {
//			
//			if(numList.indexOf(Integer.parseInt(str))!= -1) {
//				cnt++;
//			}
//		}
		
		for(int i=0;i<numStrs.length;i++) {
			if(numList.indexOf(Integer.parseInt(numStrs[i]))!= -1) {
				cnt++;
			}
		}
		
		System.out.println("맞춘 갯수는 : " + cnt);
		scan.close();
	}
}
