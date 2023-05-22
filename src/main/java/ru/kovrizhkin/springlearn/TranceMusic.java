package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

public class TranceMusic implements Music{

    private ArrayList<String> tranceMusicList = new ArrayList<>() {{
        add("Armin van Buuren");
        add("Dash Berlin");
        add("Paul van Dyk");
    }};

    @Override
    public ArrayList<String> getSong() {
        return this.tranceMusicList;
    }
}
