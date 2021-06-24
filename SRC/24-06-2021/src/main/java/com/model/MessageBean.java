package com.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;

@ManagedBean(name="mb")
@ReferencedBean
public class MessageBean {
	private String message="India India India";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

}
