package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="dept")
public class Dept {
  @Id
   private Integer departmentno;
  @Column
   private String name;

  @OneToMany(mappedBy = "dept",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
   private Set<Emp> employees;
  public Dept() {}
  public Dept(Integer departmentno,String name) {
	  this.departmentno=departmentno;
	  this.name=name;
  }
public Integer getDepartmentno() {
	return departmentno;
}
public void setDepartmentno(Integer departmentno) {
	this.departmentno = departmentno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Emp> getEmployees() {
	return employees;
}
public void setEmployees(Set<Emp> employees) {
	this.employees = employees;
}

@Override
public String toString() {
	return "Dept [departmentno=" + departmentno + ", name=" + name + ", employees=" + employees + "]";
}

}
