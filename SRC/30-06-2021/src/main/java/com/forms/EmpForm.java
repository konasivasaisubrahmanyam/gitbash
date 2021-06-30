package com.forms;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.entity.Dept;

public class EmpForm extends ActionForm{
  private Integer empno;
  private String city;
  private String name;
  private List<Dept> departments;
  private Integer deptno;

 public EmpForm() {}

public EmpForm(Integer empno, String city, String name) {
	super();
	this.empno = empno;
	this.city = city;
	this.name = name;
}
public Integer getEmpno() {
	return empno;
}
public void setEmpno(Integer empno) {
	this.empno = empno;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

public List<Dept> getDepartments() {
	return departments;
}

public void setDepartments(List<Dept> departments) {
	this.departments = departments;
}

public Integer getDeptno() {
	return deptno;
}

public void setDeptno(Integer deptname) {
	this.deptno = deptname;
}

@Override
public String toString() {
	return "EmpForm [empno=" + empno + ", city=" + city + ", name=" + name + ", departments=" + departments
			+ ", deptno=" + deptno + "]";
}


}