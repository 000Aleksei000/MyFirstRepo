package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyConnector {
    public static void main(String[] args) throws IOException, InterruptedException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Socket socket = new Socket();
        socket.connect(new InetSocketAddress(InetAddress.getLocalHost(),8085), 2000);
        PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
        BufferedReader socketReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String s;
        while ((s = reader.readLine())!= null){
            writer.println(s);
            Thread.sleep(100);
            System.out.println(socketReader.readLine());
        }
    }
}
