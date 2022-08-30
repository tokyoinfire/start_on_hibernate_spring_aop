package org.example.start;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(MyConfig.class);

        Person person = context.getBean("personBean", Person.class);

        Pet cat = context.getBean("catBean", Cat.class);
        cat.say();
        person.callYourPet();
        context.close();
    }
}
