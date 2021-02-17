package JavaCollection.task35.task3507;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.URLDecoder;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashSet;
import java.util.Set;

/* 
ClassLoader - что это такое?
*/
public class Solution {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedEncodingException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Set<? extends Animal> allAnimals = getAllAnimals(Solution.class.getProtectionDomain().getCodeSource().getLocation().getPath() + Solution.class.getPackage().getName().replaceAll("[.]", "/") + "/data");
        System.out.println(allAnimals);
    }

    public static Set<? extends Animal> getAllAnimals(String pathToAnimals) throws ClassNotFoundException, UnsupportedEncodingException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        if (!pathToAnimals.endsWith("\\") && !pathToAnimals.endsWith("/"))
            pathToAnimals = pathToAnimals + "/";
        File files = new File(URLDecoder.decode(pathToAnimals, "UTF-8"));
        Set<Animal> animalsSet = new HashSet<>();
        for(File s : files.listFiles()){
            Class clazz = new MyClassLoader().loadClass(s.getAbsolutePath());
            Class [] interfaces = clazz.getInterfaces();
            for(Class inter : interfaces){
                if(inter.toString().contains("Animal")){
                    Constructor [] constructors = clazz.getConstructors();
                    for(Constructor constructor1 : constructors){
                        if(constructor1.toString().contains("()")){
                            animalsSet.add((Animal) constructor1.newInstance());
                        }
                    }
                }
            }
        }

        //System.out.println(clazz.getName());
        return animalsSet;
    }
}
