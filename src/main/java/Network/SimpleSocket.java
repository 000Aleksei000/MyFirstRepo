package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Socket;

public class SimpleSocket {
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
