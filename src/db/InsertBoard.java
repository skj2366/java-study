package db; //2019.02.27

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url,id,pwd);
			con.setAutoCommit(false);
			String title = "게시물제목!!!~!";
			String content = "블라블라블라";
			String sql = "insert into board_info";
			sql += "(bi_num, bi_title, bi_content, bi_credat, bi_cretim)";
			//sql += "values(1,'" + title+ "','" + content +"',TO_CHAR(SYSDATE,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
			sql += "values(5,?,?,TO_CHAR(SYSDATE,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, title);
			ps.setString(2, content);
			int cnt = ps.executeUpdate();// 정상적으로 들어가게 된다면 1이 출력된다.신기방기
			System.out.println(cnt);
			if(cnt==1) {
				System.out.println("정상적으로 1개가 입력되었습니다.");
			} else if(cnt == 0) {
				System.out.println("몰라 안들어 갔는데?");
			}
			
			//con.rollback();
			con.close();
				
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
//		finally {
//			try {
//				if(con!=null) {
//					con.close();
//				}
//			} catch (SQLException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
		
	}
}
