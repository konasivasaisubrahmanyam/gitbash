package sqlcon;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class ReadOperation {
	   public static void main(String n[]) {
			Connection connection = SqlServerConnection.getConnection();
	    	try {
				Statement statement = connection.createStatement();
				ResultSet rs=statement.executeQuery("select * from patient");
				ResultSetMetaData metadata =rs.getMetaData();
				byte c=(byte)metadata.getColumnCount();
				for(int i=1;i<=c;i++) {
					System.out.printf("%20s",metadata.getColumnName(i));
				}
				System.out.println("\n<....................................................................>");
				while(rs.next()) {
					System.out.printf("\n%19d %20s %21s",rs.getInt(1),rs.getString(2),rs.getString(3));
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	   }
	}
