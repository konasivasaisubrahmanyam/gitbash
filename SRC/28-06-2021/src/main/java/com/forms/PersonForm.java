package com.forms;

import org.apache.struts.action.ActionForm;

public class PersonForm extends ActionForm{
	private Integer sno;
	private String name;
	private String place;
	public Integer getSno() {
		return sno;
	}
	public void setSno(Integer sno) {
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
