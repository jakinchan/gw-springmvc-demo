package jp.co.goodworld.service;

import jp.co.goodworld.model.UserInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
	
	private static final Logger logger = LoggerFactory.getLogger(LoginService.class);

	public UserInfo getUserInfo(String userId,String password) {
		UserInfo userInfo = new UserInfo();
		userInfo.setUserId("admin");
		userInfo.setPassWd("password");
		return userInfo;
	}

}
