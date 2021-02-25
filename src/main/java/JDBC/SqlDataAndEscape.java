package JDBC;

import java.sql.*;
import java.util.Calendar;

public class SqlDataAndEscape {
    static String Url = "jdbc:mysql://localhost:3306/cities";
    static String name = "root";
    static String password = "8158767Lexx.";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Url, name, password);
             Statement statement = connection.createStatement()) {
            statement.execute("DROP table if exists users");
            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users(id MEDIUMINT NOT NULL AUTO_INCREMENT,name VARCHAR(30) not null, dt DATE, PRIMARY key(id));");
            PreparedStatement preparedStatement = connection.prepareStatement("INSERT INTO users (name, dt) values('someName', ?);");
            preparedStatement.setDate(1, new Date(1614265521056L));
            preparedStatement.execute();
            ResultSet resultSet = statement.executeQuery("SELECT dt FROM users WHERE id = 1;");
            while (resultSet.next()){
                System.out.println(resultSet.getDate("dt"));
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
