package JDBC;

import java.sql.*;

public class PreparedStatementExm {
    static String name = "root";
    static String password = "8158767Lexx.";
    static String URL = "jdbc:mysql://localhost:3306/cities";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(URL, name, password);
             Statement statement = connection.createStatement();) {
            String cityId = "1' or 1 = '1";
            //String cityId = "1";
            //ResultSet resultSet = statement.executeQuery("select * from city where id = '" + cityId +"';" );
            /*while (resultSet.next()){
                System.out.println("name = " + resultSet.getString(2));
                System.out.println("country id = " + resultSet.getInt(3));
                System.out.println("population = " + resultSet.getInt(4));
                System.out.println("---------------------------------");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }*/
            PreparedStatement preparedStatement = connection.prepareStatement("select * from city where id = ?");
            preparedStatement.setString(1, cityId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println("name = " + resultSet.getString(2));
                System.out.println("country id = " + resultSet.getInt(3));
                System.out.println("population = " + resultSet.getInt(4));
                System.out.println("---------------------------------");
            }
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
