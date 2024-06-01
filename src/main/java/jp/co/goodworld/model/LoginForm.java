package jp.co.goodworld.model;

import jakarta.validation.constraints.NotEmpty;

public class LoginForm {

	// The Force.com JPA provider only supports annotating fields. Don't annotate
	// the getter and setter properties below.

	@NotEmpty
	private String userId;
	
	@NotEmpty
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
