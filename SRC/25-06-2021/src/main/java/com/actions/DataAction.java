package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.actions.DispatchAction;

import com.forms.PersonForm;

public class DataAction extends DispatchAction{


	@Override
	public ActionForward unspecified(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Action got invoked");
       return mapping.findForward("success");
	}
  
	public ActionForward store(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		PersonForm person=(PersonForm)form;
		request.setAttribute("sno",person.getSno());
		request.setAttribute("name",person.getName());
		request.setAttribute("place",person.getPlace());
		return mapping.findForward("result");
	}
}
