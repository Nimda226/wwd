import connection.DBConnect;
import queries.Query;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Application {
//    static final String DB_URL = "jdbc:postgresql://localhost:5432/products";
    static final String SERVER_URL = "jdbc:postgresql://localhost:5432/";
    static final String USER = "postgres";
    static final String PASS = "Raf226raf";
    static DBConnect dbConnect = new DBConnect();


    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {
        System.out.print("Введите название базы данных для названия: ");
        String nameOfDb = reader.readLine();
        Connection dbConnection = dbConnect.createAndConnectToDb(SERVER_URL, USER, PASS, nameOfDb);
        Query.createTable(dbConnection);
    }
}