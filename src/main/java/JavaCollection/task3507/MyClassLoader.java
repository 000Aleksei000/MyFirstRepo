package JavaCollection.task35.task3507;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyClassLoader extends ClassLoader{

    @Override
    public Class<?> findClass(String name) throws ClassNotFoundException {
        Class clazz = null;

        try {
            byte[] buffer = Files.readAllBytes(Paths.get(name));
            return defineClass(null, buffer, 0, buffer.length);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return super.findClass(name);
    }
}