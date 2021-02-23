package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerThread {
    public static void main(String[] args) {
        try(ServerSocket serverSocket = new ServerSocket(8085);) {
            while (true){
                Socket socket = serverSocket.accept();
                new Thread(new MyServer(socket)).start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class MyServer implements Runnable{
        Socket socket;
        public MyServer(Socket socket){
            this.socket = socket;
        }
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                 PrintWriter printWriter = new PrintWriter(socket.getOutputStream(),true)) {
                String s = " ";
                while (!(s = reader.readLine()).equals("exit")){
                    printWriter.println("you've send " + s);
                    System.out.println(s);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
