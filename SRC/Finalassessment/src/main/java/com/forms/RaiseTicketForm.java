package com.forms;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

import com.entity.UserMain;



public class RaiseTicketForm extends ActionForm
{
	private int ticketid;
	private String subject;
	private String description;
	private String byusername;
	private String toadminname;
	private String status;
	private java.sql.Date dateraised;
	
	
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
	    ActionErrors errors = new ActionErrors();
	    if (subject == null || subject.length() < 10) {
	        errors.add("subject", new ActionMessage("error.subject.required"));
	    }
	    if (description == null || description.length() < 10) {
	        errors.add("description", new ActionMessage("error.description.required"));
	    }
	    return errors;
	}
	public RaiseTicketForm() {};
	
	public RaiseTicketForm(int ticketid, String subject, String description, String byusername, String toadminname,
			String status, java.sql.Date dateraised) {
		super();
		this.ticketid = ticketid;
		this.subject = subject;
		this.description = description;
		this.byusername = byusername;
		this.toadminname = toadminname;
		this.status = status;
		this.dateraised = dateraised;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		ticketid = ticketid;
	}
	public String getByusername() {
		return byusername;
	}
	public void setByusername(String byusername) {
		this.byusername = byusername;
	}
	public String getToadminname() {
		return toadminname;
	}
	public void setToadminname(String toadminname) {
		this.toadminname = toadminname;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public java.sql.Date getDateraised() {
		return dateraised;
	}
	public void setDateraised(java.sql.Date dateraised) {
		this.dateraised = dateraised;
	}
	@Override
	public String toString() {
		return "RaiseTicketForm [subject=" + subject + ", description=" + description + "]";
	}
	
	

}
