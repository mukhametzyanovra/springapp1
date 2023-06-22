package org.example.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music rapMusic = context.getBean("rapMusic", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(rapMusic);
        musicPlayer.playMusic();
        context.close();
    }
}