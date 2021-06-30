package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.entity.Person;
import com.forms.PersonForm;
import com.repos.PersonDAO;



public class DataAction extends DispatchAction{


	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");

		 List<Person> list=PersonDAO.getPerson();
		 request.setAttribute("people", list);
       return mapping.findForward("success");
	}
  
	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PersonForm person=(PersonForm)form;
		 Person p=new Person(person.getSno(),person.getName(),person.getPlace());
	        if(PersonDAO.addPerson(p)) {
	        List<Person> list=PersonDAO.getPerson();
	        request.setAttribute("people", list);
	        person.setSno(null);	       
	        person.setName(null);
	        person.setPlace(null);
	        
			return mapping.findForward("success");
	        }
	        else {
	        	return mapping.findForward("error");
	        }
	}
	public ActionForward delete(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		try {
			PersonDAO.remove(Integer.parseInt(request.getParameter("id")));
			 List<Person> list=PersonDAO.getPerson();
		        request.setAttribute("people", list);

			return mapping.findForward("success");
		}
		catch(Exception e) {
			return mapping.findForward("error");
		}

	}
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		try {
		    PersonForm person=(PersonForm)form;
	        Person p=new Person(person.getSno(),person.getName(),person.getPlace());
	        PersonDAO.update(p);
	        person.setPlace(null);
	        person.setName(null);
	        person.setSno(null);
			 List<Person> list=PersonDAO.getPerson();
		        request.setAttribute("people", list);

			return mapping.findForward("success");
		}
		catch(Exception e) {
			return mapping.findForward("error");
		}

	}
}
