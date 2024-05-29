
//A) Write a Java Program to delete details of students whose initial character of their name is ‘S’.
import java.sql.*;

public class slip4_A {
    public static void main(String[] args) throws Exception {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        Connection con = DriverManager.getConnection("Jdbc:Odbc:cdj2");
        Statement st = con.createStatement();
        int k = st.executeUpdate("DELETE * FROM student WHERE name LIKE 'S%'");
        if (k > 0) {
            System.out.println("record deleted" + k);
        } else {
            System.out.println("record not deleted");
        }
        st.close();
        con.close();
    }
}
