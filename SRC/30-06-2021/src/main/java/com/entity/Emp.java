package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp {
@Id
  private Integer empno;
@Column
  private String name;
@Column
  private String city;


@ManyToOne(cascade = CascadeType.ALL)
@JoinColumn(name = "departmentno")
  private  Dept dept;

public Dept getDept() {
	return dept;
}

public void setDept(Dept dept) {
	this.dept = dept;
}

public Emp() {}

public Emp(Integer empno, String name, String city, Integer departmentno) {
	super();
	this.empno = empno;
	this.name = name;
	this.city = city;

}
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "Emp [empno=" + empno + ", name=" + name + ", city=" + city +"]";
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}



}
