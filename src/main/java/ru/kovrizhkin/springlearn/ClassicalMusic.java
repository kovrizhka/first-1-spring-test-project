package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.ArrayList;

public class ClassicalMusic implements Music{
    @PostConstruct
    public void doMyInit() {
        System.out.println("Im initializing...");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Im destroying :(");
    }

    private ArrayList<String> classicalMusicList = new ArrayList<>() {{
        add("Magic Flute");
        add("Rhythm Of The Rain");
        add("Love Story");
    }};
    @Override
    public ArrayList<String> getSong() {
        return this.classicalMusicList;
    }
}
