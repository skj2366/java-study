package db; //2019.02.26

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionTest {
	
//	static void exceptionTest() throws Exception {
//		
//	}
	
	
	public static void main(String[] args) {
//		try {
//			exceptionTest();
//		} catch (Exception e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "osfu";
		String pwd = "12345678";
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement(); 
			//java.sql.statement; createStatement의 데이터타입은 Statement 
			String sql = "select * from board";
			ResultSet rs = stmt.executeQuery(sql);//execute 실행하다. executeQuery의 데이터 타입은 ResultSet 
			while(rs.next()) {//while은 ()안의 조건이 false가 나오면 while 끝 
				System.out.print(rs.getString("TITLE"));
				System.out.print(rs.getString("REG_DATE"));
				System.out.print(rs.getString("CONTENT"));
				System.out.println("");
			}
			System.out.println("연결성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
}
