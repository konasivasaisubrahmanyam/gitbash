package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.TicketHistoryEntity;
import com.forms.UserMainForm;
import com.repos.AdminDAO;

public class HistoryAction extends Action
{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
	List<TicketHistoryEntity> history=AdminDAO.getHistoryDetails();
	System.out.println(history);
	System.out.println();
	request.getSession().setAttribute("details", history);
		return mapping.findForward("adminhistory");
	}

}
