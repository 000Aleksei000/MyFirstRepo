

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

/*
Составить цепочку слов
*/
//C:\Users\1\OneDrive\Рабочий стол\Test.txt

//india.colorado.edu 13

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Socket socket = new Socket()) {
            socket.connect(new InetSocketAddress("india.colorado.edu", 13), 2000);
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            String s = " ";
            while ((s = reader.readLine())!=null){
                System.out.println(s);
            }
        }
    }
}
