package db.board; //2019.02.27

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBCon {

	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";//final은 대문자로 선언한다.
	private static final String USER = "osfu";
	private static final String PASSWORD = "12345678";
	private static Connection con;
	DBCon(){
		
	}
	
	public static Connection getCon() {
//		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//		} catch (ClassNotFoundException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
		if(con==null) {
			try {
				con = DriverManager.getConnection(URL, USER, PASSWORD);//통신사 가입 및 통화 시작
				System.out.println(" │ getCon() Complete");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println(" │ getCon() Error");
			}
		}
		return con;
	}
	
	public static void close() {
		if(con!=null) {
			try {
				con.close();//통화 종료
				System.out.println(" │ close Complete");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		con = null;//통신사 해지
		System.out.println(" │ " + con);
	}
	
	public static void main(String[] args) {
		getCon();
		close();
	}
}
