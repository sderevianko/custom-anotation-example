package tester;

import classpointer.ClassPointer;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tester {

    public void searchMethodsName() {
        Method[] methods;
        Class cla;

        String property = System.getProperty("user.dir");
        Path path = Paths.get(property, "\\src\\test");
        File directory = path.toFile();

        try {
            for (File fil : directory.listFiles()) {
                String str = fil.getName();
                int pos = str.lastIndexOf(".");

                if (pos > 0) {
                    str = str.substring(0, pos);
                }

                cla = Class.forName("test." + str);

                if (cla.isAnnotationPresent(ClassPointer.class)) {
                    try {
                        methods = cla.getMethods();
                        System.out.println("Class name : " + str);
                        for (Method method : methods) {
                            System.out.println("Method name : " + method.getName());
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }  catch (Exception e) {
            e.printStackTrace();
        }
    }
}
