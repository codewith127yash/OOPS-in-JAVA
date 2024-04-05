import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class StudentDatabase {

    public static void main(String[] args) throws Exception {
        // Replace with your actual database connection details
        String url = "jdbc:mysql://localhost:3306"; // Assuming MySQL database
        String username = "your_username";
        String password = "your_password";

        Connection connection = null;
        Statement statement = null;

        try {
            // Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection to the database
            connection = DriverManager.getConnection(url, username, password);

            // Create a statement object
            statement = connection.createStatement();

            // Show existing databases (optional)
            // uncomment the following line if you want to see existing databases
            // statement.execute("show databases;");

            // Create database cse28 (assuming it doesn't exist)
            statement.execute("create database cse28;");

            // Use the cse28 database
            statement.execute("use cse28;");

            // Create the student table
            statement.execute("create table student(student_id int primary key, roll_no int, section varchar(20));");

            // Show tables in the current database (optional)
            // uncomment the following line if you want to see tables in cse28
            // statement.execute("show tables;");

            // Corrected insert statement with commas between values
            statement.execute("insert into student (student_id, roll_no, section) values(1, 127, \"CSE28\"), (2, 129, \"CSE28\"), (3, 105, \"CSE28\");");

            // Describe the student table structure
            statement.execute("desc student;");

            // Insert additional data with corrected syntax (optional)
            statement.execute("insert into student (student_id, roll_no, section) values(4, 132, \"IT29\");");

            // Select all data from the student table
            statement.executeQuery("select * from student;");

            System.out.println("Student data inserted and retrieved successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close resources (connection and statement)
            if (connection != null) {
                connection.close();
            }
            if (statement != null) {
                statement.close();
            }
        }
    }
}
