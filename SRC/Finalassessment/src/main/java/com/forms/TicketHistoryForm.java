package com.forms;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class TicketHistoryForm extends ActionForm
{
 private String message;
 public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if (message == null || message.length() < 10) {
	        errors.add("userName", new ActionMessage("error.userName.required"));
	    }
	    
	    return errors;
	}
public TicketHistoryForm() {}
public TicketHistoryForm(String message) {
	super();
	this.message = message;
}

@Override
public String toString() {
	return "TicketHistoryForm [message=" + message + "]";
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}
 
}
