package ru.kovrizhkin.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Random;

@Component
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

    public String playMusic(MusicType musicType) {

        Random random = new Random();
        int index = random.ints(0, 2).findFirst()
                .getAsInt();

        if (musicType.equals(MusicType.CLASSICAL)) {
            ArrayList<String> classicalList = music3.getSong();
            return classicalList.get(index);
        }
        if (musicType.equals(MusicType.ROCK)) {
            ArrayList<String> rockList = music2.getSong();
            return rockList.get(index);
        }
        if (musicType.equals(MusicType.TRANCE)) {
            ArrayList<String> tranceList = music1.getSong();
            return tranceList.get(index);
        }
        return null;
    }
}
