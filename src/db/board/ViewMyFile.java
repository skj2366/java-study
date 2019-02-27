package db.board;

import java.sql.Connection;
import java.util.Scanner;

public class ViewMyFile {

	public static void main(String[] args) {
		System.out.println("==============================");
		System.out.println("환영 합니다.");
		System.out.println("아래에서 아이디를 입력하세요");
		System.out.println("==============================");
		Scanner scan = new Scanner(System.in);
		String cmd = "";
		
		do {
			System.out.print("아이디 : ");
			String id = scan.nextLine();
			if(id.equals("osfu")) {
				System.out.print("비밀번호 : ");
				String pwd = scan.nextLine();
				if(pwd.equals("12345678")) {
					
					System.out.println("환영합니다. " + id + "님, 즐거운 시간 되십니오." );
					System.out.println("1. 게시물 등록");
					System.out.println("2. 게시물 삭제");
					System.out.println("3. 게시물 조회");
					System.out.println("4. 게시물 수정");
					System.out.println("q. 종료");
					System.out.println("원하시는 번호를 눌러주세요.");
					System.out.print("번호 : ");
					
					do {
						cmd = scan.nextLine();
						if("1".equals(cmd)) {
							System.out.println("게시물 등록에 들어오셨습니다.");
							System.out.println("제목을 적어주세요");
							String cmdTitle = scan.nextLine();
							System.out.println("Title : " + cmdTitle);
						}else if("2".equals(cmd)) {
							System.out.println("게시물 삭제에 들어오셨습니다.");
							System.out.print("삭제할 게시물의 번호를 입력해주세요 : ");
						}else if("3".equals(cmd)) {
							System.out.println("게시물 조회에 들어오셨습니다.");
						}else if("4".equals(cmd)) {
							System.out.println("게시물 수정에 들어오셨습니다.");
						}else {
							if(!"q".equals(cmd)){
								System.out.println("없는 메뉴입니다.");
							}
						}
					}while(!"q".equals(cmd));
					
		
				} else {
					System.out.println("비밀번호가 틀렸습니다.");
					
				}
			}else {
				System.out.println("없는 아이디 입니다!!");		
			}
		}while(!"q".equals(cmd));	
		
		System.out.println("프로그램을 종료합니다.");
		
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
