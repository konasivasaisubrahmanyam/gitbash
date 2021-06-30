package com.forms;

import org.apache.struts.action.ActionForm;

import com.entity.Dept;
import com.entity.Emp;

public class OrganizationForm extends ActionForm {
	private Emp emp;
	private Dept dept;
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}



}
