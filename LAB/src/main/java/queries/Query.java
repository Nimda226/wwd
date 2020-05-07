package queries;

import java.sql.Connection;
import java.sql.SQLException;

public class Query {
    public static void deleteDatabase(String nameOfDb, Connection connection){
        try {
            connection.createStatement().executeQuery("DROP DATABASE " + nameOfDb);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public static void createTable(Connection dbcon){
        try {
            dbcon.createStatement().executeQuery("CREATE TABLE customers\n" +
                    "(\n" +
                    "    Id SERIAL PRIMARY KEY,\n" +
                    "    FirstName CHARACTER VARYING(30),\n" +
                    "    LastName CHARACTER VARYING(30),\n" +
                    "    Email CHARACTER VARYING(30),\n" +
                    "    Age INTEGER\n" +
                    ");");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
