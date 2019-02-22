package collection.list;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall1 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<3;i++) {
			int ranNum = (int)(Math.random()*9+1);
			if(numList.indexOf(ranNum)!=-1) {
				i--;
			}else {
				numList.add(ranNum);
			}
		}
		
		//System.out.println("numList : " + numList);
		
		
		int[] nums = new int[3];
	
//		for(int i=0;i<nums.length;i++) {
//			nums[i] = Integer.parseInt(numStrs[i]);
//			if(numList.indexOf(nums[i])!= -1) {
//				
//				if(numList.indexOf(nums[i]) ==i) {
//					System.out.println("1S");
//				}else {
//					System.out.println("1B");					
//				}
//				
//			}	
//		}
		//////////위에가 내가 푼 문제 //////////////////
		///밑에가 선생님이 푼 문제 //////////////////////
		int bCnt = 0;
		int sCnt = 0;
		Scanner scan = new Scanner(System.in);
		while(sCnt !=3) {
			bCnt = 0;
			sCnt = 0;
			
			System.out.println(",를 구분자로 숫자 3개를 입력해주세요.");
			String numStr = scan.nextLine();
			System.out.println("입력하신 숫자는 : " + numStr);
			String[] numStrs = numStr.split(",");
			
			for(int i=0;i<nums.length;i++) {
				nums[i] = Integer.parseInt(numStrs[i]);
				if(numList.indexOf(nums[i])!=-1) {
					if(numList.indexOf(nums[i]) == i) {
						sCnt ++;
					}else {
						bCnt ++;
					}
				}
			}
			if(sCnt + bCnt == 0) {
				System.out.println("아웃");
			}else {
				System.out.println(sCnt + "S " + bCnt + "B");
			}
		}
		System.out.println("끝");
		scan.close();
	}
}
//String[] numStr = scan.nextLine().split(",");