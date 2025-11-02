package mg.teste;

import java.lang.ModuleLayer.Controller;
import java.lang.reflect.*;
import java.text.Annotation;

import com.monframework.annotation.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {

        // Class<?> clazz = Teste.class;
        // for (Method m : clazz.getDeclaredMethods()) {
        //    if (m.isAnnotationPresent(HandleUrl.class)) {
        //        HandleUrl ann = m.getAnnotation(HandleUrl.class);
        //        System.out.println("Méthode " + m.getName() + " gère l'URL : " + ann.value());
        //    }
        // }
        Class<?>[] classes = {
            Class.forName("mg.teste.Uno"),
            Class.forName("mg.teste.Dos"),
            Class.forName("mg.teste.Tres")
        };

        // for (Class<?> clazzs : classes) {
        //     if (clazzs.isAnnotationPresent(MyController.class)) {
        //         System.out.println("La class " + clazzs.getSimpleName() + " est un @MyController");
        //     }
        // }

        AnnotationUtils.checkAnnotation(classes, MyController.class);
    }
}