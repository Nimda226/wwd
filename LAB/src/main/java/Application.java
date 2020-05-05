import connection.DbConnect;

import java.sql.Connection;
import java.sql.SQLException;

public class Application {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/products";
    static final String USER = "postgres";
    static final String PASS = "Raf226raf";
    static DbConnect dbConnect = new DbConnect();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Connection connect = dbConnect.getConnect(DB_URL, PASS, USER);
    }

}
