package org.example.springcourse;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());



        ClassicMusic classicMusic = context.getBean("classicMusic", ClassicMusic.class);
        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
        System.out.println(classicMusic == classicMusic1);

        context.close();
    }
}