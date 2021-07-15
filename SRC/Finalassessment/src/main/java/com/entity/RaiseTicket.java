package com.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class RaiseTicket
{
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name = "ticketid", updatable = false, nullable = false)

	private int ticketid;
	@Column
	private String subject;
	@Column
	private String description;
	@Column
	private String byusername;	
	@Column
	private String toadminname;
	@Column
	private String status;
	@Column
	private java.sql.Date dateraised;
	
	public RaiseTicket() {}
	

	public RaiseTicket(int ticketid, String subject, String description, String byusername, String toadminname,
			String status, Date dateraised) {
		super();
		this.ticketid = ticketid;
		this.subject = subject;
		this.description = description;
		this.byusername = byusername;
		this.toadminname = toadminname;
		this.status = status;
		this.dateraised = dateraised;
	}


	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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


	public java.sql.Date getDateraised() {
		return dateraised;
	}


	public void setDateraised(java.sql.Date dateraised) {
		this.dateraised = dateraised;
	}
	




}
