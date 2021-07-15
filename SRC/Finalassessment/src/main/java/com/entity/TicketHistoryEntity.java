package com.entity;

import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tickethistory")
public class TicketHistoryEntity
{
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sno", updatable = false, nullable = false)
	private int sno;
	@Column
	private int ticketid;
	@Column
	private String message;
	@Column
	private java.sql.Date timestamp;
	public TicketHistoryEntity() {}
	
	public TicketHistoryEntity(int sno, int ticketid, String message, Date timestamp) {
		super();
		this.sno = sno;
		this.ticketid = ticketid;
		this.message = message;
		this.timestamp = timestamp;
	}

	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	public java.sql.Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(java.sql.Date timestamp) {
		this.timestamp = timestamp;
	}

	@Override
	public String toString() {
		return "TicketHistoryEntity [sno=" + sno + ", ticketid=" + ticketid + ", message=" + message + ", timestamp="
				+ timestamp + "]";
	}

	
	
	
}
