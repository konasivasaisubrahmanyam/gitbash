package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.model.Employe;
import com.model.EmployeDAO;

/**
 * Servlet implementation class EmployeServlet
 */
@WebServlet("/Employe.do")
public class EmployeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  HttpSession session=request.getSession();
		    ServletContext application=getServletContext();
		    
		    Integer scount=(Integer)session.getAttribute("count");
		    Integer acount=(Integer)application.getAttribute("count");
		    
		    if(scount==null)
		    	session.setAttribute("count", 1);
		    else
		    	session.setAttribute("count",scount+1);
		    
		    if(acount==null)
		    	application.setAttribute("count", 1);
		    else
		    	application.setAttribute("count",acount+1);
		request.setAttribute("Employelist", EmployeDAO.getEmploye());
		RequestDispatcher rd=request.getRequestDispatcher("Employe2.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 int sno =	Integer.parseInt(request.getParameter("sno"));
		   String name = request.getParameter("name");
		  String place = request.getParameter("place");
		   
		   Employe p=new Employe(sno,name,place);
		   if(EmployeDAO.insert(p))
			   response.sendRedirect("Employe.do");
		   else
			   response.getWriter().print("went weird re check for expected results");
	}

}
