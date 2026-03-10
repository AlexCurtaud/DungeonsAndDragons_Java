package DB;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DatabaseConnection {

    public static Connection mySqlConnection() {
        Properties props = new Properties();
        Connection con = null;

        try(InputStream input = DatabaseConnection.class
                .getClassLoader()
                .getResourceAsStream("ConnectionInfo.properties")) {


            props.load(input);

            String URL = props.getProperty("URL");
            String USER = props.getProperty("USER");
            String PASSWORD = props.getProperty("PASSWORD");

            con = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connected to the DB");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return con;
    }


}
