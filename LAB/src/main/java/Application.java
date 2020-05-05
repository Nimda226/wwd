import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Application {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/products";
    static final String USER = "postgres";
    static final String PASS = "Raf226raf";

    public static void main(String[] args) {
        try {
            //Здесь мы указываем название драйвера для базы данных
            Class.forName("org.postgresql.Driver");
           //Отлавливаем ошибку если такого драйвера не существует
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }
        //При успешно подключении драйвера выведется следующее сообщение
        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection;

        try {
            //Устанавливаем соединение
            /**
             * @params адрес до базы данных, название юзера базы данных, и пароль
             */
            connection = DriverManager.getConnection(DB_URL, USER, PASS);
            //Отлавилваем ошибку при попытке подключения к БД
        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }
        //Если подключение не null то мы подключилиси
        if (connection != null) {
            System.out.println("You successfully connected to database now");
        //Иначе выведется сообщение об ошибке
        } else {
            System.out.println("Failed to make connection to database");
        }
    }
}
