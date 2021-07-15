package com.forms;

import org.apache.struts.action.ActionForm;

public class UserProfileForm extends ActionForm {
	private String username;
	private String password;
	private String address;
	private String mobilenumber;
	private String email;
	public UserProfileForm() {}
	public UserProfileForm(String username, String password, String address, String mobilenumber, String email) {
		super();
		this.username = username;
		this.password = password;
		this.address = address;
		this.mobilenumber = mobilenumber;
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "UserProfileForm [username=" + username + ", password=" + password + ", address=" + address
				+ ", mobilenumber=" + mobilenumber + ", email=" + email + "]";
	}
	

}
