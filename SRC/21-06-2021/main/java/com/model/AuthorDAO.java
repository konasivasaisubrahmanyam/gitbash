package com.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;




public class AuthorDAO {
	private final static Connection connection=SqlServerConnection.getConnection();
	public static boolean insert( Book e) {
		try {

			PreparedStatement p= connection.prepareStatement("insert into book values(?,?,?,?,?)");
			p.setInt(1, e.getBookid());
			p.setString(2, e.getName());
			p.setInt(3, e.getPrice());
			p.setInt(4, e.getAuthorid());
			p.setInt(5, e.getPages());
			p.execute();
			return true;
		}
		catch(SQLException ex) {
			System.out.println(ex.getMessage());
			return false;
		}
	} 
	public static List<Book>getBook(){
		try      {
	        List<Book> l=new ArrayList<Book>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from book");
		    while(rs.next()) {
		    	Book a=new Book();
		    	a.setBookid(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	a.setPrice(rs.getInt(3));
		    	a.setAuthorid(rs.getInt(4));
		    	a.setPages(rs.getInt(5));
		    	l.add(a);
		    }

		    return l;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
	public static List <Author> getAuth(){
		try      {
	        List<Author> l=new ArrayList<Author>();
		    ResultSet rs=connection.createStatement().executeQuery("select * from author");
		    while(rs.next()) {
		    	Author a=new Author();
		    	a.setAuthorid(rs.getInt(1));
		    	a.setName(rs.getString(2));
		    	
		    	l.add(a);
		    }

		    return l;
		}
		catch(SQLException e) {
			System.out.println(e.getMessage());
			return null;
		}
	}
}


