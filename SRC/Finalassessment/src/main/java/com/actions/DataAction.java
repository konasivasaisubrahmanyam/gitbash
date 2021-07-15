package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;


import com.entity.RaiseTicket;
import com.forms.RaiseTicketForm;
import com.forms.UserMainForm;

import com.repos.UserMainDAO;




public class DataAction extends DispatchAction{
	
	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");
		RaiseTicketForm umf=(RaiseTicketForm) form;
		System.out.println(umf.getByusername()+"1111");
		 List<RaiseTicket> list=UserMainDAO.getValues();
		 request.setAttribute("people", list);
       return mapping.findForward("success");
	}


	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		RaiseTicketForm person=(RaiseTicketForm)form;
		
		 RaiseTicket p=new RaiseTicket(person.getTicketid(),person.getSubject(),person.getDescription(),person.getByusername(),person.getToadminname(),person.getStatus(),person.getDateraised());
	        if(UserMainDAO.addStatus(p)) {
	        	System.out.println(person.getByusername()+"222");
	        List<RaiseTicket> list=UserMainDAO.getValues();
	        request.setAttribute("people", list);
	        person.setByusername(null);	       
	        person.setDateraised(null);
	        person.setDescription(null);
	        person.setStatus(null);
	        person.setSubject(null);
	        person.getTicketid();
	        person.getToadminname();
	        
			return mapping.findForward("success");
	        }
	        else {
	        	return mapping.findForward("error");
	        }
	}
  
	public ActionForward update(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {

		try {
		    RaiseTicketForm person=(RaiseTicketForm) form;
	        RaiseTicket p=new RaiseTicket(person.getTicketid(),person.getSubject(),person.getDescription(),person.getByusername(),person.getToadminname(),person.getStatus(),person.getDateraised());
	        UserMainDAO.update(p);
	        
			 List<RaiseTicket> list=UserMainDAO.getValues();
		        request.setAttribute("people", list);
		        person.setByusername(null);	       
		        person.setDateraised(null);
		        person.setDescription(null);
		        person.setStatus(null);
		        person.setSubject(null);
		        person.getTicketid();
		        person.getToadminname();
			return mapping.findForward("success");
		}
		catch(Exception e) {
			return mapping.findForward("error");
		}

	}
	

}
