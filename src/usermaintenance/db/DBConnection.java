package usermaintenance.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection connect() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql:///usermaintenance";
            conn = DriverManager.getConnection(url, "root", "");
            return conn;
        } 
        catch (Exception e) 
        {
            System.out.println("JDBCStatementDemo..." + e);
        }
        return conn;
    }
}
