package JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
public class EX1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  try {
	            // Establish connection
	            Connection con = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/pra",
	                "root",
	                "Nithin@2005"
	            );
    
	            System.out.println("Connection Successful!");

	            con.close();

	        } catch (Exception e) {
	            System.out.println(e);
	        }
		
		
	}

}
