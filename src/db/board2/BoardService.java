package db.board2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;

public class BoardService {

	public List<BoardInfoVO> selectBoard(){
		String sql = "select * from board_info";
		Connection con = DBCon.getCon();
		System.out.println(" │ 연결성공");
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println(" │ ====================");
			
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
			
				biList.add(bi);
			}
			System.out.println(" │ ====================");
			return biList;
		} catch (SQLException e) {
			e.printStackTrace();
		}finally { // return biList;가 실행되면 밑에있던 DBCon.close()가 실행되지 않아서 
					// 강제로 실행될수있게 finally!!
			DBCon.close();
		}
		return null;
	}
}
