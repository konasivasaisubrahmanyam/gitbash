package com.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee")
public class Person {
	@Id
	private Integer sno;
	@Column
	private String name;
	@Column
	private String place;
	
	public Person() {}
	public Person(Integer sno, String name, String place) {
		super();
		this.sno = sno;
		this.name = name;
		this.place = place;
	}
	
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

	@Override
	public String toString() {
		return "Person [sno=" + sno + ", name=" + name + ", place=" + place + "]";
	}
	
	

}
