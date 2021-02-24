package JDBC;

//set global time_zone = '+3:00';

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBConnector {
    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "8158767Lexx.";
        String connectionUrl = "jdbc:mysql://localhost:3306/cities";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (Connection connection = DriverManager.getConnection(connectionUrl,userName,password)) {
            System.out.println("we're connected");
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
