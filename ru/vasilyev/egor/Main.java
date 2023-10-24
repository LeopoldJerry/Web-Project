package ru.vasilyev.egor;

import Configs.MyConfig;
import ru.vasilyev.egor.Entities.Cat;
import ru.vasilyev.egor.Entities.Dog;
import ru.vasilyev.egor.Entities.Parrot;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean("dog");
        Parrot parrot = context.getBean("parrot-kesha", Parrot.class);

        System.out.println(cat.getClass());
        System.out.println(dog.getClass());
        System.out.println(parrot.getClass());


    }
}