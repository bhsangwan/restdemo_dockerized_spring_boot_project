package com.myapp.rest;

public class User {

	private String uname;
	private String email;
	
	public User() {
		
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User(String uname, String email) {
		super();
		this.uname = uname;
		this.email = email;
	}
	
	
}
