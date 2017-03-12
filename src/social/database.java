package social;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class database {
		// JDBC driver name and database URL
		   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost:3306/project";
		   //  Database credentials
		   static final String USER = "root";
		   static final String PASS = "swati";

		   public static Connection createConnection() {
		   	  Connection conn = null;
		      //Statement stmt = null;
		 try{
			 
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");
		   }
		   catch(Exception e) {
			   System.out.println("Error loading the file");
			   System.exit(1);
		   }
		      //STEP 3: Open a connection
		      //System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);
		      
		    
		   //STEP 6: Clean-up environment
		     // rs.close();
		      //stmt.close();
		      //conn.close();
		   }catch(SQLException se1){                      //Handle errors for JDBC
		      se1.printStackTrace();
		   }
		   return conn;
		   }
		   
}


