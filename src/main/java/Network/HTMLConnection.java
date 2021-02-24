package Network;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HTMLConnection {
    public static void main(String[] args) throws IOException {
        URLConnection urlConnection = new URL("http://www.google.com").openConnection();
        Scanner scanner = new Scanner(urlConnection.getInputStream());
        scanner.useDelimiter("\\Z");
        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }
        System.out.println("----------------------------------------------");
        Map<String , List<String>> headerHtml = urlConnection.getHeaderFields();
        for(Map.Entry<String, List<String>> twice : headerHtml.entrySet()){
            System.out.println(twice.getKey() + twice.getValue());
        }
    }
}
