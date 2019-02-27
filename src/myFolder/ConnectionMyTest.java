package myFolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionMyTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Insert your ID and Password.");
		System.out.print("ID : ");
		String userID = scan.nextLine();
		System.out.print("Password : ");
		String userPwd = scan.nextLine();
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = userID;
		String pwd = userPwd;
		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String id = "osfu";
//		String pwd = "12345678";
//		
		
		System.out.println("--------------BaseBall Game ver_0.0.1------------------");
		System.out.println("--------------Loading................------------------");
		
		try {
			int biNum = 1;
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO";
			//String op = "Create user ssss identified by 12345678";
			
			String op = "INSERT INTO BOARD_INFO(BI_NUM, BI_TITLE, BI_CONTENT, BI_CREDAT, BI_CRETIM)"
					+ " VALUES (" + biNum + ",'게시물4번','게시물 내용4',TO_CHAR(SYSDATE,'YYYYMMDD'),TO_CHAR(SYSDATE,'HH24MISS'))";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			try {
				stmt.execute(op);
				System.out.println("execute complete");
			}catch(SQLException e1) {
				System.out.println("execute fail...");
			}
			
			stmt.executeQuery(sql);
			
//			while(rs.next()) {//while은 ()안의 조건이 false가 나오면 while 끝 
//				System.out.print(rs.getString("BI_NUM"));
//				System.out.print(rs.getString("BI_TITLE"));
//				System.out.println("");
//			}
			//rs.getObject();
//			try {
//				//stmt.execute(op);
//				//stmt.execute("GRANT DBA TO ssss");
			
//			} catch (SQLException e1) {
//				System.out.println("Fail");
//			}
			
			
			
			System.out.println("Connection Complete.");
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Connection Fail...");
			System.out.println("Confirm ID and Password.");
		}
		
	}

}
