package org.example.start;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        //Pet pet = new Dog();


        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Person person = context.getBean("myPerson", Person.class);

        person.callYourPet();
        System.out.println(person.getLastName());
        System.out.println(person.getAge());

        context.close();

    }
}
