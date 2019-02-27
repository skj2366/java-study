package db.board;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class View {

	public static void main(String[] args) {
		System.out.println(" ┌─────────────────────┐");
		System.out.println(" │                     │");
		System.out.println(" │       Welcome       │");
		System.out.println(" │                     │");
		System.out.println(" └─────────────────────┘");
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		System.out.println(" ┌─────────────────────┐");
		
		do {
			System.out.print(" │ ID : ");
			String id = scan.nextLine();
			if(id.equals("osfu")) {
				System.out.print(" │ 비밀번호 : ");
				String pwd = scan.nextLine();
				if(pwd.equals("12345678")) {
					BoardService bs = new BoardService();
					System.out.println(" │ 환영합니다. " + id + "님, 즐거운 시간 되십니오." );
					
					do {
						System.out.println(" │ 1. 게시물 등록");
						System.out.println(" │ 2. 게시물 삭제");
						System.out.println(" │ 3. 게시물 조회");
						System.out.println(" │ 4. 게시물 수정");
						System.out.println(" │ q. 종료");
						System.out.println(" │ 원하시는 번호를 눌러주세요.");
						System.out.print(" │ 번호 : ");
						cmd = scan.nextLine();	
						if("3".equals(cmd)) {
							bs.selectBoard();
						}else if("1".equals(cmd)) {
							System.out.print(" │ 제목 : ");
							String title = scan.nextLine();
							System.out.print(" │ 내용 : ");
							String content = scan.nextLine();
							bs.insertBoard(title,content);
						}else if("2".equals(cmd)) {
							System.out.print(" │ 삭제할 게시물 번호 : ");
							int num = Integer.parseInt(scan.nextLine());
							bs.deleteBoard(num);
						}else if("4".equals(cmd)) {
							System.out.print(" │ 게시물 번호 : ");
							int num = Integer.parseInt(scan.nextLine());
							System.out.print(" │ 제목 : ");
							String title = scan.nextLine();
							System.out.print(" │ 내용 : ");
							String content = scan.nextLine();
							bs.updateBoard(title,content,num);
						}else {
							if(!"q".equals(cmd)) {
								System.out.println(" │ 존재하지않는 번호입니다.");
							}
						}
					}while(!"q".equals(cmd));
					
		
				} else {
					System.out.println(" │ 비밀번호가 틀렸습니다.");
					
				}
			}else {
				System.out.println(" │ 없는 아이디 입니다!!");		
			}
		}while(!"q".equals(cmd));	
		
		System.out.println(" │ 프로그램을 종료합니다.");
		System.out.println(" └─────────────────────┘");
		
//		String url = "jdbc:oracle:thin:@localhost:1521:xe";
//		con = DriverManager.getConnection(url,id,pwd);
	}
}



//if("osfu".equals(id)) { // 이렇게 하면 위와 다르게 id = null; 일때 오류가 안남.
//
//}
//
//String str = null;
//System.out.println(str.equals("osfu")); // => Null point exception 
//System.out.println("osfu".equals(str)); // => false
