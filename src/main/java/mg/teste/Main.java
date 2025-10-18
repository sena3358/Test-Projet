package mg.teste;

import java.lang.reflect.Method;

import com.monframework.annotation.HandleUrl;
public class Main {
    public static void main(String[] args) {
        Class<?> clazz = Teste.class;
        for (Method m : clazz.getDeclaredMethods()) {
            if (m.isAnnotationPresent(HandleUrl.class)) {
                HandleUrl ann = m.getAnnotation(HandleUrl.class);
                System.out.println("Méthode " + m.getName() + " gère l'URL : " + ann.value());
            }
        }
    }
}