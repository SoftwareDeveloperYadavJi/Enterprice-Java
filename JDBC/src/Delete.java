import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Delete {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "root";
        String query = "delete from students where Name ='Nitin'";

        // Load and register the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the INSERT query
        int rowsAffected = st.executeUpdate(query);
        System.out.println("Rows affected: " + rowsAffected);

        // Close the statement and connection
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}
