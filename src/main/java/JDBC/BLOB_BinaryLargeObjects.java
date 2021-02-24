package JDBC;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.*;

public class BLOB_BinaryLargeObjects {
    static String Url = "jdbc:mysql://localhost:3306/cities";
    static String name = "root";
    static String password = "8158767Lexx.";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(Url, name, password);
             Statement statement = connection.createStatement()) {
            //statement.executeUpdate("create table if not exists Users (id mediumint not null auto_increment, name VARCHAR(30) NOT NULL, imj BLOB, PRIMARY KEY (id));");
            /*BufferedImage image = ImageIO.read(new File("C:\\Users\\1\\OneDrive\\Рабочий стол\\MyFirstRepo\\Smile.jpeg"));
            Blob blob = connection.createBlob();
            try(OutputStream outputStream = blob.setBinaryStream(1)) {
                ImageIO.write(image, "jpeg", outputStream);
            }
            PreparedStatement preparedStatement = connection.prepareStatement("insert into users (name, imj) values (?,?);");
            preparedStatement.setString(1, "Ivan");
            preparedStatement.setBlob(2,blob);
            preparedStatement.execute();
        } catch (SQLException | IOException sqlException) {
            sqlException.printStackTrace();
        }*/


            ResultSet resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()){
                Blob blob = resultSet.getBlob("imj");
                BufferedImage image2 = ImageIO.read(blob.getBinaryStream());
                File outputFile = new File("C:\\Users\\1\\OneDrive\\Рабочий стол\\MyFirstRepo\\saved.png");
                ImageIO.write(image2, "png", outputFile);
            }
        } catch (SQLException | IOException sqlException) {
            sqlException.printStackTrace();
        }
    }
}
