package org.example.springcourse;

import org.springframework.stereotype.Component;

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

    public void doMyInit() {
        System.out.println("Doing initialization!");
    }

    public void doMyDestroy() {
        System.out.println("Doing destroy!");
    }
}
