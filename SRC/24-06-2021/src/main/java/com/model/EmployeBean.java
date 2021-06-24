package com.model;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ReferencedBean;
import javax.faces.bean.RequestScoped;

import com.data.Employe;
import com.data.EmployeDAO;

@ManagedBean(name="Employe")
@RequestScoped

public class EmployeBean {
  private List<Employe> employe;
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

public List<Employe> getEmploye() {
    this.employe = EmployeDAO.getEmploye();
	return employe;
}

public void setPeople(List<Employe> employe) {
	this.employe = employe;
}

public String store() {
	   Employe employe=new Employe(sno,name,place);
	   EmployeDAO.insert(employe);
	   return "employe";
}

  
}