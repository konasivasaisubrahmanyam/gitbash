package com.data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeDAO {

	private final static Connection connection=SqlServerConnection.getConnection();
	public static boolean insert(Employe p) {
		try {
			
			PreparedStatement preparedStatement=connection.prepareStatement("insert into employee values(?,?,?)");
			preparedStatement.setInt(1, p.getSno());
			preparedStatement.setString(2, p.getName());
			preparedStatement.setString(3, p.getPlace());
			preparedStatement.execute();
			return true;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	} 
	
	public static List<Employe> getEmploye(){
		
try      {
	        List<Employe> l=new ArrayList<Employe>();
		    ResultSet rs=connection.createStatement().executeQuery("select  * from employee");
		    while(rs.next()) {
		    	Employe p=new Employe();
		    	p.setSno(rs.getInt(1));
		    	p.setName(rs.getString(2));
		    	p.setPlace(rs.getString(3));
		    	l.add(p);
		    }
		    
		    return l;
		}
		catch(SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	


}
