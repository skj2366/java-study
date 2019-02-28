package myFolder.baseball;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test {
	
	public static void main(String[] args) {
		String sql = "select * from user_info where ui_id = ?";
		//String sql = "select * from user_info where ui_id = 'dongkeun'";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1, "dongkeun");
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("UI_ID"));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
