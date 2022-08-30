package org.example.start;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {
    public Cat() {

    }

    public void say() {
        System.out.println("Meow");
    }
}

