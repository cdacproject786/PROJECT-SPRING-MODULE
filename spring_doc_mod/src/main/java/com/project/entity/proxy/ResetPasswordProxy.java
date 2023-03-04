package com.project.entity.proxy;

public class ResetPasswordProxy {
	
	private String email;
	private String pwd;
	public ResetPasswordProxy() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResetPasswordProxy(String email, String pwd) {
		super();
		this.email = email;
		this.pwd = pwd;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
