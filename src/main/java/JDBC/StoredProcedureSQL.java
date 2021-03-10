package JDBC;

import java.sql.*;

public class StoredProcedureSQL {
     static String url = "jdbc:mysql://localhost:3306/cities";
     static String name = "root";
     static String password = "root";

     public static void main(String[] args) {
          try (Connection connection = DriverManager.getConnection(url, name, password);
               Statement statement = connection.createStatement()) {
               statement.execute("DROP table if exists users");
               statement.executeUpdate("CREATE TABLE IF NOT EXISTS users(id MEDIUMINT NOT NULL AUTO_INCREMENT,name VARCHAR(30) not null, PRIMARY key(id));");
               statement.executeUpdate("insert into users (name) value ('Ivan');");
               statement.executeUpdate("insert into users (name) value ('Igor');");

               //first storedProcedure
               /*CallableStatement callableStatement = connection.prepareCall("{call UsersCount(?)}");
               callableStatement.registerOutParameter(1,Types.INTEGER);
               callableStatement.execute();
               System.out.println(callableStatement.getInt(1));
               System.out.println("----------------------------");*/

               CallableStatement callableStatement = connection.prepareCall("{call getName(?)}");
               callableStatement.setInt(1, 2);
               if(callableStatement.execute()){
                    ResultSet resultSet = callableStatement.getResultSet();
                    while (resultSet.next()){
                         System.out.println(resultSet.getString("name"));
                    }
               }

          } catch (SQLException throwables) {
               throwables.printStackTrace();
          }
     }
}
