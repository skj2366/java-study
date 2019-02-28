package myFolder.baseball;

import java.util.ArrayList;
import java.util.Scanner;

public class BaseBall {
	
	static int ballCnt;
	
	public static void main(String[] args) {
		System.out.println("한 라운드의 공갯수를 입력해주세요.");
		ballCnt = MakeBallCnt.getBallCnt();
		System.out.println("이번 게임은 공을 "+ballCnt + "개씩 던집니다.");
		ArrayList<Integer> numList = new ArrayList<>();
		
		for(int i=0;i<ballCnt;i++) {
			int ranNum = (int)(Math.random()*9)+1;
			if(numList.indexOf(ranNum)!=-1) {
				i--;
			}else {
				numList.add(ranNum);
			}
		}
		
		int[] nums = new int[ballCnt];
		int bCnt = 0;
		int sCnt = 0;
		int totalCnt = 1;
		Scanner scan = new Scanner(System.in);
		
		while(sCnt!=ballCnt) {
			bCnt = 0;
			sCnt = 0;
			System.out.println(totalCnt + "회말  시작합니다.");
			System.out.println(",를 구분자로 숫자 " + ballCnt + "개를 입력해주세요.");
			System.out.print("입력 숫자 (" + ballCnt + "개) : ");
			String numStr = scan.nextLine();
			String[] numStrs = numStr.split(",");
			
			for(int i=0;i<nums.length;i++) {
				nums[i] = Integer.parseInt(numStrs[i]);
				if(numList.indexOf(nums[i])!=-1) {
					if(numList.indexOf(nums[i])==i) {
						sCnt++;
					}else {
						bCnt++;
					}
				}
			}
			
			if(sCnt + bCnt == 0) {
				System.out.println("OUT");
			} else {
				System.out.println(sCnt + "S " + bCnt + "B");
			}
			totalCnt++;
			System.out.println("---------------------------");
		}
		
		System.out.println("Total : " + (totalCnt - 1));
		System.out.println("----------END-------------");
		scan.close();
		
	}
	

}
