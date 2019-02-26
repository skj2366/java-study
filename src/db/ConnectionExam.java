package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExam {

	public static void main(String[] args) {
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
//			DriverManager.getConnection(url, id, pwd).createStatement();
//			Connection con = DriverManager.getConnection(url, id, pwd);
//			Statement stmt = con.createStatement();
//			String sql = "SELECT * FROM BOARD";
			
			ResultSet rs = DriverManager.getConnection(url, id, pwd).createStatement().executeQuery("SELECT * FROM BOARD");
			while(rs.next()) {//while은 ()안의 조건이 false가 나오면 while 끝 
				System.out.print(rs.getString("TITLE"));
				System.out.print(rs.getString("REG_DATE"));
				System.out.print(rs.getString("CONTENT"));
				System.out.println();
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
