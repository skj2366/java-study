package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BoardService {

	public void selectBoard() {
		String sql = "select * from board_info";
		try {
			PreparedStatement ps =DBCon.getCon().prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			System.out.println(" │ 번호        제목");
			while(rs.next()) {
				System.out.print(" │ ");
				System.out.print(rs.getString("bi_num"));
				System.out.print(" . ");
				System.out.println(rs.getString("bi_title"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	
	public void insertBoard(String title, String content) {
		String sql = "INSERT INTO BOARD_INFO(BI_NUM,BI_TITLE,BI_CONTENT,BI_CREDAT,BI_CRETIM)";
		sql += "VALUES (SEQ_UI_NUM.nextval,?,?,"
				+ "TO_CHAR(SYSDATE,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
		try {
			PreparedStatement ps =DBCon.getCon().prepareStatement(sql);
			
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println(" │ 정상적으로 게시물이 등록되었습니다.");
			}else {
				System.out.println(" │ 게시물 등록에 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	
	public void updateBoard(String title,String content, int num) {
		String sql = "UPDATE BOARD_INFO SET BI_TITLE = ?, BI_CONTENT = ? WHERE BI_NUM = ?";
		try {
			PreparedStatement ps =DBCon.getCon().prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			ps.setInt(3,num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println(" │ 정상적으로 수정되었습니다.");
			}else {
				System.out.println(" │ 게시물 수정에 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
	
	public void deleteBoard(int num) {
		String sql = "DELETE BOARD_INFO WHERE BI_NUM = ?";
		try {
			PreparedStatement ps =DBCon.getCon().prepareStatement(sql);
			ps.setInt(1,num);
			int cnt = ps.executeUpdate();
			if(cnt==1) {
				System.out.println(" │ " + num + "번 게시물이 정상적으로 삭제되었습니다.");
			}else {
				System.out.println(" │ 삭제를 실패하였습니다.");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
	}
}
