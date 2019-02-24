package myFolder;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall0 {
	
	public static void main(String[] args) {
		ArrayList<Integer> numList = new ArrayList<>();
		String exitStr = "";
		for(;;) {
			exitStr = "";
			
			for(int i=0;i<3;i++) {
				int ranNum = (int)(Math.random()*9+1);
				if(numList.indexOf(ranNum)!=-1) {
					i--;
				}else {
					numList.add(ranNum);
				}
			}
			System.out.println(",를 구분자로 숫자 3개를 입력해주세요.");
			Scanner scan = new Scanner(System.in);
			String numStr = scan.nextLine();
			System.out.println("입력하신 숫자는 : " + numStr);
			System.out.println("numList : " + numList);
			String[] numStrs = numStr.split(",");
			
			int[] nums = new int[3];
			
			for(int i=0;i<nums.length;i++) {
				nums[i] = Integer.parseInt(numStrs[i]);
				if(numList.indexOf(nums[i])!= -1) {
					
					if(numList.indexOf(nums[i]) == i) {
						System.out.println("1S");
					}else {
						System.out.println("1B");					
					}
					
				}
				
			}
			
			String exitScan = scan.nextLine();
			System.out.println("계속하시겠습니까? 'y' or 'n'");
		}
		
		
	}
}
