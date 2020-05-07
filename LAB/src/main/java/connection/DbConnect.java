package connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;


public class DBConnect {

    public Connection createAndConnectToDb(String serverUrl, String userName, String password, String nameOfDb) throws ClassNotFoundException, SQLException {
        Connection serverConnection = connectionToServer(serverUrl, userName, password);
        serverConnection.createStatement().executeUpdate("CREATE DATABASE " + nameOfDb);
        Connection dbConnection = DriverManager.getConnection(serverUrl + nameOfDb, userName, password);
        System.out.println("Connection to " + nameOfDb + " is success!");
        return dbConnection;
    }
    public Connection connectionToServer(String serverUrl, String userName, String password) throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        System.out.println("PostgreSQL JDBC Drive successfully connected");
        return DriverManager.getConnection(serverUrl, userName, password);
    }
}

