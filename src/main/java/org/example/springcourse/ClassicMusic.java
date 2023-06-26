package org.example.springcourse;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class ClassicMusic implements Music {

    @Override
    public String getSong() {
        return "Времена года";
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing initialization!");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing destroy!");
    }
}
