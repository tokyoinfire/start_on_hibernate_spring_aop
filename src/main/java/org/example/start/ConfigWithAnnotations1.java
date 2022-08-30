package org.example.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");



        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();

        System.out.println(person.getLastName());
        System.out.println(person.getAge());


        context.close();

    }
}