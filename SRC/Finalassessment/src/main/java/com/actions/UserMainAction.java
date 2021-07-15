package com.actions;

import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import com.entity.UserMain;
import com.forms.UserMainForm;
import com.repos.UserMainDAO;

public class UserMainAction extends Action {
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		RequestDispatcher rd;
		UserMainForm umf=(UserMainForm)form;
		
		List<UserMain> list=UserMainDAO.getDetails();

		for (UserMain x : list) {

			if(umf.getUsername().equals(x.getUsername()) && (x.getUsertype().equals("admin")))
			{
				request.getSession().setAttribute("user", umf);
				return mapping.findForward("admin");

			}
			else if(umf.getUsername().equals(x.getUsername()) && (x.getUsertype().equals("user"))) 
			{
				request.getSession().setAttribute("user", umf);
				return mapping.findForward("user");
			}
		}
	
		return mapping.findForward("error");

	}

}




