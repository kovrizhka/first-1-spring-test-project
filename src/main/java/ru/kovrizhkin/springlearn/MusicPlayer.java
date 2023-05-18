package ru.kovrizhkin.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MusicPlayer {
//    private List<Music> musicList = new ArrayList<>();
//    private String name;
//    private int volume;
    private MusicEnumeration musicEnumeration;

    private Music music1;
    private Music music2;
    private Music music3;

    @Autowired
    public MusicPlayer(@Qualifier("tranceMusic") Music music1,
                       @Qualifier("rockMusic") Music music2,
                       @Qualifier("classicalMusic") Music music3) {
        this.music1 = music1;
        this.music2 = music2;
        this.music3 = music3;
    }



//    @Autowired
//    public MusicPlayer(@Qualifier("tranceMusic") Music music1,
//                       @Qualifier("rockMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }



//    public void setMusicList(List<Music> musicList) {
//        this.musicList = musicList;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getVolume() {
//        return volume;
//    }
//
//    public void setVolume(int volume) {
//        this.volume = volume;
//    }

    public String playMusic() {
        ArrayList<String> musicList = musicEnumeration.getSong();

    }
}
