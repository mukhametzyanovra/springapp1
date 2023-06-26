package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("muicPlayer", MusicPlayer.class);
        musicPlayer.playMusic(Style.ROCK);
        musicPlayer.playMusic(Style.CLASSIC);

        context.close();
    }
}