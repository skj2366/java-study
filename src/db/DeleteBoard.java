package db; //2019.02.27

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteBoard {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		Connection con = null;
		try {	
			String sql = "DELETE BOARD_INFO WHERE BI_NUM =?";
			con = DriverManager.getConnection(url, id, pwd);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setInt(1,4);
			
			int cnt = ps.executeUpdate();
			if(cnt == 1) {
				System.out.println(cnt+ " 개, 정상적으로 삭제되었습니다.");
			}else {
				System.out.println(cnt + "개, 정상적으로 삭제되지 않아습니다.");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("정상적으로 삭제되었습니다.");
		}
		
		
		
	}
}
