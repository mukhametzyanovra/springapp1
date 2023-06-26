package org.example.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    private ClassicMusic classicMusic;

    private RockMusic rockMusic;

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
