import java.lang.reflect.Method;
import java.sql.SQLOutput;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Амиго и Диего лучшие друзья!"));
        System.out.println(getPartOfString(null));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if(string == null){
            throw  new TooShortStringException();
        }
        String [] s = string.split(" ");
        if(s.length<5){
            throw  new TooShortStringException();
        }
        StringBuilder result = new StringBuilder();
        for(int i = 1; i <5 ; i++){
            result.append(s[i] + " ");
        }
        return result.toString().trim();
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
