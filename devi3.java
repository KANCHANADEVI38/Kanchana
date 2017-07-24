package sample;
import java.sql.DriverManager;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.SQLException;
public class devi3{

	
		static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
		   static final String DB_URL = "jdbc:mysql://localhost/STUDENTS";

		   //  Database credentials
		   static final String USER = "username";
		   static final String PASS = "password";
		   
		   public static void main(String[] args) {
		   Connection conn = null;
		   java.sql.Statement stmt = null;
		   try{
		      //STEP 2: Register JDBC driver
		      Class.forName("com.mysql.jdbc.Driver");

		      //STEP 3: Open a connection
		      System.out.println("Connecting to a selected database...");
		      conn = DriverManager.getConnection(DB_URL, USER, PASS);
		      System.out.println("Connected database successfully...");
		      
		      //STEP 4: Execute a query
		      System.out.println("Inserting records into the table...");
		      stmt = conn.createStatement();
		      
		      String sql = "INSERT INTO Registration " +
		                   "VALUES (100, 'Zara', 'Ali', 18)";
		      ((java.sql.Statement) stmt).executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (101, 'Mahnaz', 'Fatma', 25)";
		      ((java.sql.Statement) stmt).executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES (102, 'Zaid', 'Khan', 30)";
		      ((java.sql.Statement) stmt).executeUpdate(sql);
		      sql = "INSERT INTO Registration " +
		                   "VALUES(103, 'Sumit', 'Mittal', 28)";
		      ((java.sql.Statement) stmt).executeUpdate(sql);
		      System.out.println("Inserted records into the table...");

		   }catch(SQLException se){
		      //Handle errors for JDBC
		      se.printStackTrace();
		   }catch(Exception e){
		      //Handle errors for Class.forName
		      e.printStackTrace();
		   }finally{
		      //finally block used to close resources
		      try{
		         if(stmt!=null)
		            conn.close();
		      }catch(SQLException se){
		      }// do nothing
		      try{
		         if(conn!=null)
		            conn.close();
		      }catch(SQLException se){
		         se.printStackTrace();
		      }//end finally try
		   }//end try
		   System.out.println("Goodbye!");
		}//end main
		}//end JDBCExample

	


