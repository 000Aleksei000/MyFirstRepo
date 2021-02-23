package Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExm {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8091);
            Socket socket = serverSocket.accept()){
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream());
            writer.write("hello");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
