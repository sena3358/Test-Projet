package mg.teste;

<<<<<<< Updated upstream
import java.lang.reflect.Method;
=======
import java.io.IOException;
import java.lang.ModuleLayer.Controller;
import java.lang.reflect.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.Annotation;
import java.util.List;

import com.monframework.annotation.*;
import com.monframework.finder.ClassFinder;
>>>>>>> Stashed changes

import com.monframework.annotation.HandleUrl;
public class Main {
<<<<<<< Updated upstream
    public static void main(String[] args) {
        Class<?> clazz = Teste.class;
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(HandleUrl.class)) {
                HandleUrl ann = m.getAnnotation(HandleUrl.class);
                System.out.println("Méthode " + m.getName() + " gère l'URL : " + ann.value());
            }
=======
    public static void main(String[] args) throws ClassNotFoundException, IOException {

        // Class<?> clazz = Teste.class;
        // for (Method m : clazz.getDeclaredMethods()) {
        //    if (m.isAnnotationPresent(HandleUrl.class)) {
        //        HandleUrl ann = m.getAnnotation(HandleUrl.class);
        //        System.out.println("Méthode " + m.getName() + " gère l'URL : " + ann.value());
        //    }
        // }
        // Class<?>[] classes = {
        //     Class.forName("mg.teste.Uno"),
        //     Class.forName("mg.teste.Dos"),
        //     Class.forName("mg.teste.Tres")
        // };

        // for (Class<?> clazzs : classes) {
        //     if (clazzs.isAnnotationPresent(MyController.class)) {
        //         System.out.println("La class " + clazzs.getSimpleName() + " est un @MyController");
        //     }
        // }

        // AnnotationUtils.checkAnnotation(classes, MyController.class);

        Path classesRoot;
        if (args.length >= 1) {
            classesRoot = Paths.get(args[0]).toAbsolutePath();
        } else {
            classesRoot = Paths.get("target/teste-framework-1.0.0/").toAbsolutePath();
        }

        List<String> annotated = ClassFinder.findClassesAnnotatedWithControleur(classesRoot);
        if (annotated.isEmpty()) {
            System.out.println(" (none found)");
        } else {
            annotated.forEach(s -> System.out.println(" - " + s));
>>>>>>> Stashed changes
        }
    }
}