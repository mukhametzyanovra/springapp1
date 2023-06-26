package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MusicPlayer {

    private ClassicMusic classicMusic;

    private RockMusic rockMusic;

    @Autowired
    public MusicPlayer(ClassicMusic classicMusic, RockMusic rockMusic) {
        this.classicMusic = classicMusic;
        this.rockMusic = rockMusic;
    }

    public String playMusic() {
        return "Playing: " + classicMusic.getSong();
    }

//    public void playMusicList() {
//        for (Music musicElement : musicList) {
//            System.out.println("Playing: " + musicElement.getSong());
//        }
//    }
}
