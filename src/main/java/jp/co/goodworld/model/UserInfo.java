package jp.co.goodworld.model;

import com.sun.istack.internal.NotNull;

public class UserInfo {

	// The Force.com JPA provider only supports annotating fields. Don't annotate
	// the getter and setter properties below.

	@NotNull
	private String userId;
	@NotNull
	private String passWd;


	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassWd() {
		return passWd;
	}

	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}





}
