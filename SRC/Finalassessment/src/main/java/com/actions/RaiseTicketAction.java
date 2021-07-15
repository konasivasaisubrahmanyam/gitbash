package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.RaiseTicket;
import com.entity.UserMain;
import com.entity.UserProfile;
import com.forms.RaiseTicketForm;
import com.forms.UserMainForm;
import com.repos.UserMainDAO;


public class RaiseTicketAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		UserMainForm umf=(UserMainForm)form;
		List<RaiseTicket> l=UserMainDAO.getTicket(umf.getUsername());
	    request.getSession().setAttribute("ticket", l);
		
		return mapping.findForward("success");
	}

}
