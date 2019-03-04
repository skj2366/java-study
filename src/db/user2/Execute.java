package db.user2;

import java.util.List;

import db.user.UserInfoVO;

public class Execute {
	
	public static void main(String[] args) {
		UserService us = new UserService();
		UserInfoVO uivo = new UserInfoVO();
		uivo.setUiId("hong");
		uivo.setUiName("홍길동");
		List<UserInfoVO> uiList = us.selectUser(uivo);
		System.out.println(uiList);
	}
}
