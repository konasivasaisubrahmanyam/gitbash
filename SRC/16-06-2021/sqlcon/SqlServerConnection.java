package sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

abstract public class SqlServerConnection {

	 private static Connection connection;
	static {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			connection = DriverManager.getConnection("jdbc:sqlserver://den1.mssql8.gear.host;databaseName=mssqldatabasedat",
					"mssqldatabasedat","mssqldb@123");
			
			

		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}  
	  }

	   public static Connection getConnection() {
		   return connection;
	   }
	}
