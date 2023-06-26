package org.example.springcourse;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music {
    private List<String> rockPlaylist = new ArrayList<>();

    {
        rockPlaylist.add("ATTACK");
        rockPlaylist.add("Bury Me");
        rockPlaylist.add("Hyenna");
    }

    @Override
    public List<String> getSongs() {
        return rockPlaylist;
    }
}
