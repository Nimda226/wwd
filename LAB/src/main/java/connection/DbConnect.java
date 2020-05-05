package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {
    public  Connection getConnect(String dbUrl, String password, String userName) throws ClassNotFoundException, SQLException {
            Class.forName("org.postgresql.Driver");
            System.out.println("PostgreSQL JDBC Driver successfully connected");
            return DriverManager.getConnection(dbUrl, userName, password);
    }
}
