package com.actions;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.UserProfile;
import com.forms.UserMainForm;
import com.forms.UserProfileForm;
import com.repos.UserMainDAO;
import com.repos.UserProfileDAO;



public class UserProfileAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		UserMainForm umf=(UserMainForm)form;
		UserProfile up=new UserProfile();		
		List<UserProfile> l=UserMainDAO.getProfile(umf.getUsername());
	    request.getSession().setAttribute("profile", l);
		
	
		return mapping.findForward("success");
	}
	

}
 