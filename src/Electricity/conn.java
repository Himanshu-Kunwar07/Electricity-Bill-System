package Electricity;
import java.sql.*;


public class conn {
     Connection c ;
     Statement s;
     public conn() {
    	 try {
    		 Class.forName("com.mysql.jdbc.driver");
    		 c = DriverManager.getConnection("jdbc:mysql:///project2","root","");
    		 s = c.createStatement();
    	 }catch(Exception e) {
    		 System.out.println(e);
    	 }
     }
     
}
