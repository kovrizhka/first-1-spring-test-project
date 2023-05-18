package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class ClassicalMusic implements Music{

    private ArrayList<String> classicalMusicList = new ArrayList<>() {{
        add("Magic Flute");
        add("Rhythm Of The Rain");
        add("Love Story");
    }};

//    public static ClassicalMusic getClassicalMusic() {
//        return new ClassicalMusic();
//    }
//
//    public void doMyInit() {
//        System.out.println("Initialization in progress...");
//    }
//
//    public void doMyDestroy() {
//        System.out.println("I'm destroying");
//    }
    @Override
    public ArrayList<String> getSong() {
        return this.classicalMusicList;
    }
}
