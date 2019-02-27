package db; //2019.02.27

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ConnectionTest2 {
	
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT BI_NUM, BI_TITLE, BI_CONTENT"
					+ " ,BI_CREDAT, BI_CRETIM, BI_CNT"
					+ " ,BI_ISACTIVE FROM BOARD_INFO";
			ResultSet rs = stmt.executeQuery(sql);
			List<HashMap<String,String>> rowList = new ArrayList<>();
			
			while(rs.next()) {
				HashMap<String,String> row =new HashMap<>();
				
				String biTitle = rs.getString("BI_TITLE");
				String biNum = rs.getString("BI_NUM");
				String biContent = rs.getString("BI_CONTENT");
				String biCredat = rs.getString("BI_CREDAT");
				String biCretim = rs.getString("BI_CRETIM");
				String biCnt = rs.getString("BI_CNT");
				String biIsactive = rs.getString("BI_ISACTIVE");
	
				row.put("biNum",biNum);
				row.put("biTitle",biTitle);
				row.put("biContent",biContent);
				row.put("biCredat",biCredat);
				row.put("biCretim",biCretim);
				row.put("biCnt",biCnt);
				row.put("biIsactive",biIsactive);
				rowList.add(row);
			}
			for(int i=0;i<rowList.size();i++) {
				System.out.println(rowList.get(i));
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
