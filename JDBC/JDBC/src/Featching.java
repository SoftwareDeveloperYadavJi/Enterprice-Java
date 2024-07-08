import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Featching {
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/student";
        String username = "root";
        String password = "root";
        String query = "SELECT * from students";

        // Load and register the JDBC driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Establish the connection
        Connection con = DriverManager.getConnection(url, username, password);
        System.out.println("Connection Established successfully");

        // Create a statement
        Statement st = con.createStatement();

        // Execute the SELECT query
        ResultSet rs = st.executeQuery(query);

        // Process the result set
        while (rs.next()) {
            String name = rs.getString("name");
            int age = rs.getInt("age");
            String major = rs.getString("major");

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Major: " + major);
        }

        // Close the result set, statement, and connection
        rs.close();
        st.close();
        con.close();
        System.out.println("Connection Closed....");
    }
}
