package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBallRewrite {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			int ranNum = (int)(Math.random()*9)+1;
			
			if(numList.indexOf(ranNum)!=-1) {
				i--;
			}else {
				numList.add(ranNum);
			}
		}
		System.out.println(numList);
		
		Scanner scan = new Scanner(System.in);
		//String[] scanStr = scan.nextLine(split(","));
	}
	
}
