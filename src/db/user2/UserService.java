package db.user2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.board.DBCon;
import db.user.UserInfoVO;

public class UserService {

	public List<UserInfoVO> selectUser(UserInfoVO uivo){
		String sql = "SELECT * FROM USER_INFO WHERE 1=1 ";// 아무조건 검색 안됐을때 WHERE절 단독 실행은 안되므로 1=1 처럼 아무 의미 없는 참조건으로 넣어주면 무조건 TRUE.
		if(uivo!=null) {
			if(uivo.getUiId()!=null) {
				sql += "AND UI_ID = ?";
			}
			if(uivo.getUiName() != null) {
				sql += "AND UI_NAME = ?";
			}
		}
		Connection con = DBCon.getCon();
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			int cnt = 1;
			if(uivo!=null) {
				if(uivo.getUiId()!=null) {
					ps.setString(cnt++, uivo.getUiId());
				}
				if(uivo.getUiName()!=null) {
					ps.setString(cnt++, uivo.getUiName());
//					if(uivo.getUiId()==null) {
//						ps.setString(1, uivo.getUiName());
//					}else {
//						ps.setString(2, uivo.getUiName());
//					} // 옛날에 쓰던 방법 .
				}
			}
			ResultSet rs = ps.executeQuery();
			List<UserInfoVO> uiList = new ArrayList<>();
			while(rs.next()) {
				UserInfoVO ui = new UserInfoVO();
				ui.setUiNum(rs.getInt("ui_num"));
				ui.setUiName(rs.getString("ui_name"));
				ui.setUiId(rs.getString("ui_id"));
				ui.setUiPwd(rs.getString("ui_pwd"));
				ui.setUiEmail(rs.getString("ui_email"));
				uiList.add(ui);
			}
			return uiList;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
