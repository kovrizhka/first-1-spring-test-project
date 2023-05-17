package ru.kovrizhkin.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
    private List<Music> musicList = new ArrayList<>();
    private String name;
    private int volume;
    private Music music;
    private RockMusic rockMusic;
    private TranceMusic tranceMusic;

    @Autowired
    public MusicPlayer (RockMusic rockMusic, TranceMusic tranceMusic) {
        this.rockMusic = rockMusic;
        this.tranceMusic = tranceMusic;
    }



    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String playMusic() {
        return "Now playing: " + tranceMusic.getSong();
    }
}
