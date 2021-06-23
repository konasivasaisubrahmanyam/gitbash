package sqlcon;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertRows {
   public static void main(String n[]) {
	   Connection connection = SqlServerConnection.getConnection();
   	try {
   	        Scanner sc=new Scanner(System.in);	
		    PreparedStatement ps= connection.prepareStatement("insert into patient values(?,?,?)");
   		    do {
   		  
            System.out.println("Enter sno");
            int sno=Integer.parseInt(sc.next());
            if(sno<=0)
            	break;
            System.out.println("Enter Name");
            String name = sc.next();
            System.out.println("Enter City");
            String city=sc.next();
            ps.setInt(1, sno);
            ps.setString(2, name);
            ps.setString(3, city);
            ps.execute();
   		    }while(true);
            
   	}
   	catch(SQLException e) {
   		e.printStackTrace();
   	}
   	
   }
}
