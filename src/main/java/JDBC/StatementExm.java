package JDBC;

import java.sql.*;

public class StatementExm {
    static String name = "root";
    static String password = "8158767Lexx.";
    static String URL = "jdbc:mysql://localhost:3306/cities";

    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection(URL, name, password);
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate("create table Books (id MEDIUMINT not null auto_increment, name VARCHAR(30), author VARCHAR(30), PRIMARY key(id));");
            //statement.executeUpdate("ALTER TABLE books DROP COLUMN author;");
            //statement.executeUpdate("insert into books (name) values('Inferno');");
            //statement.executeUpdate("insert into books set name = 'Solomon key';");
            ResultSet resultSet = statement.executeQuery("select * from Books;");
            while (resultSet.next()){
                System.out.println(resultSet.getInt(1));
                System.out.println(resultSet.getString(2));
                System.out.println("------------------------------");
            }
        }
    }
}
