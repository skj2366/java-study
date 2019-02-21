package exam.ex05;

import java.util.ArrayList;
import java.util.Scanner;

public class NumGame {//2019.02.21
	
	public static ArrayList<Integer> makeNums() {
		ArrayList<Integer> numsList = new ArrayList<>();
		for(int i=0;i<3;i++) {
			int num = (int)(Math.random()*100)+1;
			numsList.add(num);
		}
		return numsList;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> numList = makeNums();
		for(int i=0;i<numList.size();i++) {
			System.out.println(numList.get(i));
		}
	}
}
