package sqlcon;


	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;

	public class Sql {

	   public static void main(String[] args)  {

		   
		   
				try {
					Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
					DriverManager.getConnection("jdbc:sqlserver://den1.mssql8.gear.host;databaseName=mssqldatabasedat",
							"mssqldatabasedat","mssqldb@123");
					
					
					System.out.println("Connection established");
					}
					catch (SQLException e)
						{
							e.printStackTrace();
					
						} 
					catch (ClassNotFoundException e)
						{
					// TODO Auto-generated catch block
							e.printStackTrace();
						}


				}


	
	   }
