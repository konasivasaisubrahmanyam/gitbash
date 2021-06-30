package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.entity.Dept;
import com.entity.Person;

public class OrganizationDAO {
	 private static EntityManager em=JPARepository.getEntityManager();

	  public static List<Dept> getDept() {
		  Query q =em.createQuery("Select p from Dept p");  //JPQL
		  List<Dept> l=q.getResultList();
		  return l;
	  }
}