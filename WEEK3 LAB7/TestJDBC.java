import java.sql.*;

   public class TestJDBC
   {
       public static void main (String[] args)
       {
           System.out.println("\n\n***** MySQL JDBC Connection Testing *****");
		   Connection conn = null;
           try
           {
			   Class.forName ("com.mysql.cj.jdbc.Driver");
               String userName = "root";
               String password = "mysql123";
               String url = "jdbc:mysql://localhost:3306/csdb";        
               conn = DriverManager.getConnection (url, userName, password);
               System.out.println ("\nDatabase Connection Established...");
			   Statement stmt  = conn.createStatement();
			   String sql = "select * from wtcourse";
			   ResultSet rs = stmt.executeQuery(sql);
			   while (rs.next()) 
			   {
					System.out.println(rs.getInt("Roll") + "\t" + rs.getString("Name") + "\t" + 
                    rs.getInt("Marks")  + "\t" + rs.getString("Grade"));       
			   }
			   System.out.println("\n***** Let terminate the Connection *****");
			   conn.close();
			   System.out.println("\nDatabase connection Closed...");
           }
          catch (Exception ex)
           {
		       System.err.println ("Cannot connect to database server");
			   ex.printStackTrace();
           }        
       }
   }