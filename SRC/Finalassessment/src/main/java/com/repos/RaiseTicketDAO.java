package com.repos;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.entity.RaiseTicket;




public class RaiseTicketDAO 
{
public static EntityManager em=JPARepository.getEntityManager();
public static boolean addBook(RaiseTicket te) 
{
  	 EntityTransaction t= em.getTransaction();
  	 try {
  	 t.begin();
     em.persist(te);
  	 t.commit();
  	 return true;
  	 }
  	 catch(Exception e) {
  		 return false;
  	 }
   }
}

