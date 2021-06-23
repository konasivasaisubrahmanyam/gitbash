package com.model;

public class Employe {
	   private int sno;
	   private String name;
	   private String place;
	   
	   public Employe() {}
	public Employe(int sno, String name, String place) {
		super();
		this.sno = sno;
		this.name = name;
		this.place = place;
	}
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
