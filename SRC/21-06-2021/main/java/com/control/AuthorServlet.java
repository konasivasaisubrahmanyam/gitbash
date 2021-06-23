package com.control;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.AuthorDAO;
import com.model.Book;
import com.model.Employe;
import com.model.EmployeDAO;

/**
 * Servlet implementation class AuthorServlet
 */
@WebServlet("/author.do")
public class AuthorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AuthorServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setAttribute("Authorlist", AuthorDAO.getBook());
		RequestDispatcher rd=request.getRequestDispatcher("Author.jsp");
		rd.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		int bookid =Integer.parseInt(request.getParameter("bookid"));
		   String name = request.getParameter("name");
		 int price = Integer.parseInt(request.getParameter("price"));
		 System.out.println(request.getParameter("authorid"));
		 int authorid =	Integer.parseInt(request.getParameter("authorid"));
		 int pages = Integer.parseInt(request.getParameter("pages"));
		   Book p=new Book(bookid,name,price,authorid,pages);
		   if(AuthorDAO.insert(p))
			   response.sendRedirect("author.do");
		   else
			   response.getWriter().print("went weird re check for expected results");
	}
	}


