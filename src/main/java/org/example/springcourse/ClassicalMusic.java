package org.example.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music {

    private ClassicalMusic() {

    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    @Override
    public String getSong() {
        return "Времена года";
    }

    public void doMyInit() {
        System.out.println("Doing initialization!");
    }

    public void doMyDestroy() {
        System.out.println("Doing destroy!");
    }
}
