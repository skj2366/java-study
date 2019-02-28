package db.board2;//2019.02.28 재귀호출.

import java.util.Scanner;

public class Exam {

	public static int getBornYear() {
		Scanner scan = new Scanner(System.in);
		System.out.println("당신의 나이를 입력해주세요.");
		int bornYear = 2019;
		try {
			bornYear -= Integer.parseInt(scan.nextLine()) - 1;
		} catch (Exception e) {
			System.out.println("숫자로 입력해주세요.");
			bornYear = getBornYear(); //내가 나를 호출했다 = 재귀호출.
		}
		return bornYear;
	}

	public static void main(String[] args) {
		int bornYear = getBornYear();
		System.out.println("당신은 " + bornYear + "생 입니다.");
	}
}
