package classpointerprocessor;

import classpointer.ClassPointer;

import java.io.File;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ClassPointerProcessor {
    private static final Logger logger = Logger.getLogger(ClassPointerProcessor.class.getName());
    private String fileName;

    public void processClasses() {
        String property = System.getProperty("user.dir");
        Path path = Paths.get(property, "\\src\\test");
        File directory = path.toFile();

        try {
            if (directory.listFiles() == null) {
                return;
            }
            for (File file : directory.listFiles()) {
                fileName = file.getName();
                final int position = fileName.lastIndexOf(".");
                if (position > 0) {
                    fileName = fileName.substring(0, position);
                }
                final Class<?> customClass = Class.forName("test." + fileName);
                getClassMethodsNames(customClass);
            }
        }  catch (Exception e) {
            logger.log(Level.SEVERE, "File not found", e);
        }
    }

    private void getClassMethodsNames(Class<?> customClass) {
        if (customClass.isAnnotationPresent(ClassPointer.class)) {
            try {
                final Method[] methods = customClass.getMethods();
                logger.info("Class name : "+ fileName);
                for (Method method : methods) {
                    logger.info("Method name : " + method.getName());
                }
            } catch (Exception ex) {
                logger.log(Level.SEVERE, "Method not found", ex);
            }
        }
    }
}
