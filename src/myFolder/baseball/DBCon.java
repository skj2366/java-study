package myFolder.baseball;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	private static final String USER = "BASEBALLSERVER";
	private static final String PASSWORD = "12345678";
	private static Connection con;
	
	DBCon(){
		
	}
	
	public static Connection getCon() {
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL,USER,PASSWORD);
				//System.out.println("getCon() Complete");
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("getCon() Error");
			}
		}
		return con;
	}	
	
	public static void close() {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con = null;
		//System.out.println("접속해제");
	}
	
}
