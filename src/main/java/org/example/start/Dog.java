package org.example.start;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import javax.annotation.PostConstruct;

//@Component
public class Dog implements Pet {

    public Dog() {

    }

    @PostConstruct
    private void init(){
        System.out.println("Class Dog, init method called");
    }

    @PreDestroy
    private void destroy() {
        System.out.println("Class Dog destroy method called");
    }

    @Override
    public void say() {
        System.out.println("Bark");
    }
}
