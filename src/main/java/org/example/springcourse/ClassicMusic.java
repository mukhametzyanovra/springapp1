package org.example.springcourse;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class ClassicMusic implements Music {

    private ClassicMusic() {

    }

    public static ClassicMusic getClassicalMusic() {
        return new ClassicMusic();
    }

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
