package com.actions;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import java.util.ArrayList;
import java.util.List;
import com.entity.Dept;

import com.forms.EmpForm;

import com.repos.OrganizationDAO;
import com.repos.JPARepository;

public class DeptAction extends Action{
	   static List<Dept> list=OrganizationDAO.getDept();
	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
		EmpForm emp = (EmpForm) form;
	    for(Dept x:list)
        	JPARepository.getEntityManager().refresh(x);
     
	    emp.setDepartments(list);


        request.setAttribute("depts", list);
		return mapping.findForward("success");
	}

}
