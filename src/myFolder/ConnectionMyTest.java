package myFolder;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class ConnectionMyTest {
	
	public static void main(String[] args) {
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Insert your ID and Password.");
//		System.out.print("ID : ");
//		String userID = scan.nextLine();
//		System.out.print("Password : ");
//		String userPwd = scan.nextLine();
//		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		String id = userID;
//		String pwd = userPwd;
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "ssss";
		String pwd = "12345678";
		
		
		System.out.println("--------------BaseBall Game ver_0.0.1------------------");
		System.out.println("--------------Loading................------------------");
		
		try {
			Connection con = DriverManager.getConnection(url, id, pwd);
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM USER_INFO";
			//String op = "Create user ssss identified by 12345678";
			
			ResultSet rs = stmt.executeQuery(sql);
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
