package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.RaiseTicket;
import com.entity.UserMain;



public class TicketDAO 
{
public static EntityManager em=JPARepository.getEntityManager();

public static List<UserMain> getAdminList()
{
	Query q=em.createQuery("select p from UserMain p where p.usertype='admin'");
	List<UserMain> adminList=q.getResultList();
	return adminList;
	
}
public static List<RaiseTicket> getOpenList(String username)
{
	Query s=em.createQuery("select p from RaiseTicket p where p.status='open' and  p.byusername ='"+username+"'");
	List<RaiseTicket> adminList=s.getResultList();
	return adminList;
	
}
public static List<RaiseTicket> getAssignedList(String username)
{
	Query s=em.createQuery("select p from RaiseTicket p where  p.toadminname ='"+username+"'");
	List<RaiseTicket> assignList=s.getResultList();
	return assignList;
	
}


public static boolean addTicket(RaiseTicket te) 
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

