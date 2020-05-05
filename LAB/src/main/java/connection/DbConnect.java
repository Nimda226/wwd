package connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class DBConnect {


        public Connection getConnect(String dburl, String password, String username) throws ClassNotFoundException, SQLException {
                Class.forName("org.postgresql.Driver");
                System.out.println("PostgreSQL JDBC Drive successfully connected");
            return DriverManager.getConnection(dburl, username, password);


        }


    }


