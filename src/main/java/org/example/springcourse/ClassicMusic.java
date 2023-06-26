package org.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicMusic implements Music {

    private List<String> classicPlaylist = new ArrayList<>();

    {
        classicPlaylist.add("Весна");
        classicPlaylist.add("Лето");
        classicPlaylist.add("Зима");
    }

    @Override
    public List<String> getSongs() {
        return classicPlaylist;
    }
}
