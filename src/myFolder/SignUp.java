package myFolder;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import myFolder.baseball.DBCon;

public class SignUp {

//	public static void signUp(String user, String pwd) {
//		boolean blUser  = compareUser(user);
//		String sql = "INSERT INTO USER_INFO(UI_NUM, UI_ID, UI_PWD)"
//				+ " VALUES (SEQ_UI_NUM.nextval,?,?)";
//		if(blUser == true) {
//			System.out.println("아이디 사용 가능");
//			try {
//				PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
//				ps.setString(1,user);
//				ps.setString(2, pwd);
//				int cnt = ps.executeUpdate();
//				if(cnt == 1) {
//					System.out.println("아이디 생성 완료");
//					System.out.println("새로운 아이디로 접속해 주세요");
//				}else {
//					System.out.println("아이디 생성 실패.");
//				}
//			} catch (SQLException e) {
//				//e.printStackTrace();
//				System.out.println("아이디 생성 실패.");
//			}
//		} else {
//			System.out.println("중복된 아이디 입니다.");
//		}
//	}
	
	public static void signUp2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==============회원가입===============");
		System.out.print("ID : ");
		String id = scan.nextLine();
		
		boolean blUser  = compareUser(id);
		
		String sql = "INSERT INTO USER_INFO(UI_NUM, UI_ID, UI_PWD)"
				+ " VALUES (SEQ_UI_NUM.nextval,?,?)";
		if(blUser == true) {
			System.out.println("아이디 사용 가능");
			String pwd = comparePassword();

			try {
				PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
				ps.setString(1,id);
				ps.setString(2, pwd);
				int cnt = ps.executeUpdate();
				if(cnt == 1) {
					System.out.println("아이디 생성 완료");
					System.out.println("새로운 아이디로 접속해 주세요");
				}else {
					System.out.println("아이디 생성 실패.");
				}
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("아이디 생성 실패.");
			}
		} else {
			System.out.println("중복된 아이디 입니다.");
		}
	}
	
//	public static String signIn(String userId,String pwd) {
////		Scanner scan = new Scanner(System.in);
////		System.out.println("ID :");
////		String userTmp = scan.nextLine();
////		System.out.println("PWD : ");
////		String pwdTmp = scan.nextLine();
//		String sql = "SELECT * FROM USER_INFO WHERE UI_ID = ?";
//		String pwdTmp = "";
//		
//		try {
//			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
//			ps.setString(1,userId);
//			ResultSet rs = ps.executeQuery();
//			while(rs.next()) {
//				pwdTmp = rs.getString("UI_PWD");
//			}
//			
//			if(pwd.equals(pwdTmp)) {
//				System.out.println("접속완료");
//				System.out.println("환영합니다." + userId + "님");
//			}else {
//				System.out.println("비밀번호를 확인해주세요.");
//			}
//		} catch (SQLException e) {
//			//e.printStackTrace();
//			System.out.println("");
//		}
//		return userId;
//		
//	}
	
	public static String signIn2() {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String userTmp = scan.nextLine();
		System.out.print("PWD : ");
		String pwd = scan.nextLine();
		String pwdTmp = "";
		String sql = "SELECT * FROM USER_INFO WHERE UI_ID = ?";
				
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1,userTmp);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				pwdTmp = rs.getString("UI_PWD");
			}
			
			if(pwd.equals(pwdTmp)) {
				System.out.println("접속완료");
				System.out.println("환영합니다." + userTmp + "님");
				scan.close();
				//System.out.println("스캔 종료");
			}else {
				System.out.println("아이디 및 비밀번호를 확인해주세요.");
				userTmp = signIn2();
			}
		} catch (SQLException e) {
			//e.printStackTrace();
			System.out.println("Error");
		}
		return userTmp;
		
	}
	
	public static boolean compareUser(String userId) {
		String sql = "SELECT * FROM USER_INFO WHERE UI_ID = ?";
		String id = "";
		try {
			PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
			ps.setString(1,userId);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				id = rs.getString("UI_ID");
			}
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			DBCon.close();
		}
		
		if(userId.equals(id)) {
			return false;
		} else {
			return true;
		}
	}
	
	public static String comparePassword() {
		Scanner scan = new Scanner(System.in);
		System.out.print("PASSWORD : ");
		String pwd = scan.nextLine();
		if(pwd.equals("q")) {
			System.out.println("회원가입 초기화면으로 돌아갑니다.");
			signUp2();
		}
		System.out.print("CONFIRM PASSWORD : ");
		String pwdConfirm = scan.nextLine();
		if(pwdConfirm.equals("q")){
			System.out.println("회원가입 초기화면으로 돌아갑니다.");
			signUp2();
		}

		if(pwdConfirm.equals(pwd)) {
			System.out.println("비밀번호 일치");
			return pwd;
		}else {
			System.out.println("비밀번호 불일치");
			pwd = comparePassword();
		}
		return pwd;
	}
	
	public static void signOut() {
		
	}
	
	public static void deleteAccount() {
		Scanner scan = new Scanner(System.in);
		System.out.println("==============회원탈퇴===============");
		System.out.print("ID : ");
		String id = scan.nextLine();
		
		boolean blUser  = compareUser(id);
		
		String sql = "DELETE USER_INFO WHERE UI_ID = ?";
		if(blUser == false) {
			System.out.println("존재 하는 계정입니다.");
			String pwd = comparePassword();

			try {
				PreparedStatement ps = DBCon.getCon().prepareStatement(sql);
				ps.setString(1,id);
				ps.setString(2, pwd);
				int cnt = ps.executeUpdate();
				if(cnt == 1) {
					System.out.println("아이디 제거 완료");
					System.out.println("그동안 감사했습니다.");
				}else {
					System.out.println("아이디 제거 실패.");
				}
			} catch (SQLException e) {
				//e.printStackTrace();
				System.out.println("아이디 제거 실패.");
			}
		} else {
			System.out.println("없는 계정입니다.");
		}
	}
	
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		//========회원가입==============
//		System.out.print("생성할 아이디 입력: ");
//		String id = scan.nextLine();
//		System.out.print("비밀번호 : ");
//		String pwd = scan.nextLine();
//		signUp(id,pwd);
		//========회원가입 끝 ============
		//========로그인  ===============
//		System.out.print("ID : ");
//		String id = scan.nextLine();
//		System.out.print("비밀번호 : ");
//		String pwd = scan.nextLine();
//		signIn(id,pwd);
//		System.out.println(signIn(id,pwd));
		//======== or ===============
		//signIn2();
		//========로그인  끝=============
		Scanner scan = new Scanner(System.in);
		System.out.println("Hello, World");
		String titleScan = "";
		do {
			System.out.println("원하시는 메뉴를 선택해주세요.");
			System.out.println("1. Sign in");
			System.out.println("2. Sign out(미구현)");
			System.out.println("3. Sign up");
			System.out.println("4. Delete Account");
			System.out.println("5. Exit");
			titleScan = scan.nextLine();
			if("1".equals(titleScan)) {
				signIn2();
			}else if("2".equals(titleScan)) {
				System.out.println("미구현 되었습니다. 프로그램 끄세요 그냥");
			}else if("3".equals(titleScan)) {
				signUp2();
			}else if("4".equals(titleScan)) {
				deleteAccount();
			}else {
				System.out.println("존재하지 않는 메뉴입니다.");
			}
		}while("q".equals(titleScan));
		
	}
}
