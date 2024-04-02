package pres;

import metier.Imetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class PresSpringAnnotations {
    public static void main(String[] args) {
        ApplicationContext context=new
                AnnotationConfigApplicationContext("dao","metier","ext");
        Imetier metier=context.getBean(Imetier.class);
        System.out.println(metier.calcul());
    }
}
