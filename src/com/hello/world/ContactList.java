package com.hello.world;

public class ContactList {
	private String username;
	private String email;
	
	public ContactList(String username, String email){
		this.username = username;
		this.email = email;
	}
	public void setUserName(String username) {
		this.username = username;
	}
	public String getUserName() {
		return username;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
}
