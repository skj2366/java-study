package db.board2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		BoardService bs = new BoardService();
		List<BoardInfoVO> biList = bs.selectBoard(); //BoardService.selectBoard()의 biList를 생명연장시킨다.변수명은 상관없음.
		System.out.println(biList);
	}
}
