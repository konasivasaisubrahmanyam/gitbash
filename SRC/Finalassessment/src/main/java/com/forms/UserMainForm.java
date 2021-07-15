package com.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class UserMainForm extends ActionForm{
	
	private String username;
	private String password;
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if (username == null || username.length() < 1) {
	        errors.add("userName", new ActionMessage("error.userName.required"));
	    }
	    if (password == null || password.length() < 5) {
	        errors.add("password", new ActionMessage("error.password.required"));
	    }
	    return errors;
	}
	public UserMainForm() {}
	public UserMainForm(String username, String password) {
		super();
		this.username = username;
		this.password = password;
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
	@Override
	public String toString() {
		return "UserMainForm [username=" + username + ", password=" + password + "]";
	}
	
	

}
