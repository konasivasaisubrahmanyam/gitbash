package com.control;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;

import java.sql.DriverManager;

import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;

import javax.servlet.annotation.WebServlet;

import javax.servlet.http.HttpServlet;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpServletResponse;

@WebServlet("/signupServlet")

public class signupServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;   

	public signupServlet() {

		super();


	}

	/**

	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    		response.getWriter().append("Served at: ").append(request.getContextPath());

		
	}

	/**

	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)

	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

		// TODO Auto-generated method stub

		//doGet(request, response)

		String email=request.getParameter("email");                                                                           

		String pass=request.getParameter("pass");
		
		String gen=request.getParameter("gen");
		
		String age=request.getParameter("age");
		
		
		
		
		

		PreparedStatement stmt;
           
	

		Connection con;

		RequestDispatcher rd;

		try 

		{

			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

			con=DriverManager.getConnection("jdbc:sqlserver://den1.mssql8.gear.host;databaseName=mssqldatabasedat","mssqldatabasedat","mssqldb@123");
			try {
				String sql="insert into login(email,password,gen,age) values(?,?,?,?)";
				stmt=con.prepareStatement(sql);

				stmt.setString(1,email);

				stmt.setString(2,pass);
				
				stmt.setString(3,gen);
				
				stmt.setString(4,age);
				
				
				
				int row=stmt.executeUpdate();

				if(row>0)

				{

					request.setAttribute("status","Successfully Signed up... Now you can Login.");

					rd=request.getRequestDispatcher("Login.jsp");

					rd.forward(request, response);

				}		

				else

				{

					request.setAttribute("status","Failed to sign up....! Please Try again.");

					rd=request.getRequestDispatcher("signup.jsp");

					rd.forward(request, response);		

				}

			
			} 
			catch (SQLIntegrityConstraintViolationException e) {
				
				} 
			catch (SQLException e) {
				request.setAttribute("status","Signup Failed UserId already exist!!");

				rd=request.getRequestDispatcher("Registration.jsp");

				rd.forward(request, response);
					
				}
		}
			

		catch (Exception e) 

		{

			e.printStackTrace();

		}

		}
}