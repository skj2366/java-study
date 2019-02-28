package myFolder.baseball;

import java.util.Scanner;

public class MakeBallCnt {

	public static int getBallCnt() {
		Scanner scan = new Scanner(System.in);
		int ballCnt = 0;
		try {
			ballCnt = Integer.parseInt(scan.nextLine());
		} catch(Exception e) {
			System.out.println("숫자를 입력해주세요.");
			ballCnt = getBallCnt();
		}
		return ballCnt;
	}
}
