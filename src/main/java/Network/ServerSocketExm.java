package Network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSocketExm {
    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8091);
            Socket socket = serverSocket.accept();
            BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()))){
            PrintWriter writer = new PrintWriter(socket.getOutputStream(),true);
            writer.println("hello");
            String s = " ";
            while ((s = reader.readLine()) != null){
                writer.println("you've send " + s);
                System.out.println(s);
                if (s.equals("exit")) {
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
