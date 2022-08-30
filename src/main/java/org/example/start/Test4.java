package org.example.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

        Dog dog = context.getBean("myPet", Dog.class);
        dog.say();

        Dog dog1 = context.getBean("myPet", Dog.class);
        dog1.say();

        context.close();
    }
}
