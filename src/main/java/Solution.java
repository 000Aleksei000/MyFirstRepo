import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tHello \t i am alexey \t i am 25 y.o. \t O my God \t you are beautiful."));
    }

    public static String getPartOfString(String string) {
        String [] strings = string.split("\t");
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < strings.length-1; i++){
            result.append(strings[i].trim() + " ");
        }
        return result.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
