package sqlcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DDL {
    public static void main(String n[]) {
    	Connection connection = SqlServerConnection.getConnection();
    	try {
			Statement statement = connection.createStatement();
			statement.execute("create table patient(sno integer primary key,"
					+ "name varchar(30) not null,"
					+ "city varchar(30) not null)");
			System.out.println("Table created");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
    }
}
