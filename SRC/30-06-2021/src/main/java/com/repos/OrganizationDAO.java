package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.Dept;
import com.entity.Emp;
import com.entity.Person;

public class OrganizationDAO {
	 private static EntityManager em=JPARepository.getEntityManager();

	  public static List<Dept> getDept() {
		  Query q =em.createQuery("Select p from Dept p");  //JPQL
		  List<Dept> l=q.getResultList();
		  return l;
	  }
	  public static boolean addEmp(Emp p,int dno) {
	    	 EntityTransaction t= em.getTransaction();
	    	 try {
	    	 t.begin();
	    	 Dept d=em.find(Dept.class, dno);
	    	 p.setDept(d);
	    	 em.persist(p);
	    	 t.commit();
	    	 return true;
	    	 }
	    	 catch(Exception e) {
	    		 e.printStackTrace();
	    		 return false;
	    	 }
	     }
}