package com.forms;

import org.apache.struts.action.ActionForm;

public class PersonForm extends ActionForm{
	private int sno;
	private String name;
	private String place;
	public int getSno() {
		return sno;
	}
	public void setSno(int sno) {
		this.sno = sno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	
	

}
