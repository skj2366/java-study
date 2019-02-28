package db.board2; //2019.02.28

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class Testtt {

	
//	public static void main(String[] args) {
//		ConTest ct = new ConTest();
//		ct.call();
//		ct.close();
//		
//		ConTest ct2 = ct;
//		ct = null;
//		System.out.println("ct : " + ct);
//		System.out.println("ct2 : " + ct2);
//		//복제된게 없어지지 않는다 !
//	}
	
	
	public static void main(String[] args) {
		String sql = "select * from board_info";
		Connection con = DBCon.getCon();
		System.out.println(" │ 연결성공");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println(" │ ====================");
			//ResultSet.next(rs.next)가 없으면 시야가 1번 row의 위에있어서 rs.next가 한번쯤은 꼭 나와야한다.
			List<BoardInfoVO> biList = new ArrayList<>();
			
			while(rs.next()) {
				BoardInfoVO bi = new BoardInfoVO();
				bi.setBiNum(rs.getInt("bi_num"));
				bi.setBiTitle(rs.getString("bi_title"));
				bi.setBiContent(rs.getString("bi_content"));
				bi.setBiCredat(rs.getString("bi_credat"));
				bi.setBiCnt(rs.getInt("bi_num"));
				bi.setBiCretim(rs.getString("bi_cretim"));
				bi.setBiIsactive(rs.getString("bi_isactive"));
				//System.out.print(" │ ");
				//System.out.println(bi); //ArrayList와 BoardInfoVO[] 로 bi 전체의 값을 받을수있다.
				biList.add(bi);
			}
			for(BoardInfoVO bi : biList) {
				System.out.print(" │ ");
				System.out.println(bi);
			}
			System.out.println(" │ ====================");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		DBCon.close();//DBcon.con은 null값이 들어가지만
		System.out.println(" │ " + con);//여기서의 con은 이미 메모리생성되서 복사된 상태라서 null값이 안나옴.
	}//여기서 con이 죽어서 딱히 안죽여도 되긴하지만 ,11번 라인이 메인위에 존재하면 죽여줘야한다.
	
}
