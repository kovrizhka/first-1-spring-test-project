package ru.kovrizhkin.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    public String getName() {
        return this.name;
    }
    public int getVolume() {
        return this.volume;
    }


    private List<Music> genreList;



    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    public String playMusic() {
        Random random = new Random();

        return "Now playing: " + genreList.get(random.nextInt(genreList.size())).getSong()
                + " with volume " + this.volume;
    }
}
