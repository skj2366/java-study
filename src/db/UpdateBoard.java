package db; //2019.02.27

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			String sql = "update board_info\r\n" + 
					"set bi_title = ?,\r\n" + 
					"BI_CONTENT = ? \r\n" + 
					"where bi_num = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1,"제목");
			ps.setString(2,"내용");
			//ps.setString(3, Integer.parseInt("3"));
			ps.setInt(3, 10);
			int cnt = ps.executeUpdate();
			if(cnt == 1) {
				System.out.println("정상적으로 업데이트 되었습니다.");
			}else {
				System.out.println("업데이트에 실패하였습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
