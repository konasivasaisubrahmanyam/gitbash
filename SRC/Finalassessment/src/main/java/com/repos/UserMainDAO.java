package com.repos;


import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;
import com.entity.RaiseTicket;
import com.entity.UserMain;
import com.entity.UserProfile;

public class UserMainDAO {

	private static EntityManager em=JPARepository.getEntityManager();
	public static List<UserMain> getDetails(){
		Query q=em.createQuery("select p from UserMain p");
		List<UserMain> l=q.getResultList();
		return l;
	}
	public static List<UserProfile> getProfile(String username ){
		Query q=em.createQuery("SELECT p FROM UserProfile p WHERE p.username='"+username+"'");
		List<UserProfile> profile=q.getResultList();
		return profile;
	}
	public static List<RaiseTicket> getTicket(String username ){
		Query q=em.createQuery("SELECT p FROM RaiseTicket p WHERE p.byusername='"+username+"'");//jpql
		List<RaiseTicket> ticket=q.getResultList();
		return ticket;
	}
	public static boolean addPerson(UserMain um) {

		EntityTransaction t= em.getTransaction();

		try {
			t.begin();
			em.persist(um);			
			t.commit();
			return true;
			}
		catch(Exception e) {
			return false;
		}
	}
	public static boolean addStatus(RaiseTicket um) {

		EntityTransaction t= em.getTransaction();

		try {
			t.begin();
			em.persist(um);			
			t.commit();
			return true;
			}
		catch(Exception e) {
			return false;
		}
	}
    public static void update(RaiseTicket p) {
   	 EntityTransaction t= em.getTransaction();
   	 try {
   	 t.begin();
   	 em.merge(p);
   	 t.commit();
   	 }
   	 catch(Exception e) {
   		 throw e;
   	 }
    }
	public static List<RaiseTicket> getValues() {
	 	  Query q =em.createQuery("Select p from RaiseTicket p" );//JPAQL
			  List<RaiseTicket> l=q.getResultList();
			  
			  return l;
	   }
	}


