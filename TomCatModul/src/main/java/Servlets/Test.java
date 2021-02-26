package Servlets;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;

public class Test {
    public static void main(String[] args) {
        for(int i = 0 ; i < 5; i++){
            new Thread(){
                @Override
                public void run() {
                    try{
                        URLConnection urlConnection = new URL("http://localhost:8080/SingleThreadServlet").openConnection();
                        urlConnection.getInputStream();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
        }
    }
}
