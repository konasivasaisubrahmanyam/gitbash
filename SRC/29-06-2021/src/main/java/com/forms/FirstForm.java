package com.forms;

import org.apache.struts.action.ActionForm;

public class FirstForm extends ActionForm{
	String message="this class is instantiated";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	

}
