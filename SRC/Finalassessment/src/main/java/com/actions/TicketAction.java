package com.actions;

import java.time.LocalDate;

import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.entity.RaiseTicket;
import com.entity.UserMain;
import com.forms.RaiseTicketForm;
import com.forms.UserMainForm;
import com.repos.TicketDAO;
import com.repos.UserMainDAO;

public class TicketAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub	
		RaiseTicketForm tf=(RaiseTicketForm) form;
		System.out.println(tf.toString());
		RaiseTicket te=new RaiseTicket();
		te.setSubject(tf.getSubject());
		
		te.setDescription(tf.getDescription());
		te.setStatus("open");
		UserMainForm ufe= (UserMainForm) request.getSession().getAttribute("user");
		
		System.out.println("In TicketAction,"+request.getSession().getAttribute("user"));
		te.setByusername(ufe.getUsername());	
		LocalDate localDate = LocalDate.now();
        
        //Get LocalDate from SQL date
        java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
        te.setDateraised(sqlDate);
        List<UserMain> list=TicketDAO.getAdminList();
         System.out.println(list);
        Random random=new Random();
		int r=random.nextInt(list.size());
		System.out.println(r);
		System.out.println(list.get(r).getUsername());
		//te.setToadminname(list.get(r).getUsertype());
		te.setToadminname(list.get(r).getUsername());
		System.out.println(te.toString());
       
      
		System.out.println(te);
		
	    if(TicketDAO.addTicket(te))
	    {
	    	System.out.println(te);
	    	
	    	return mapping.findForward("Tickets");
	    }
	    return mapping.findForward("error");
		
		
	}
	
	

}
