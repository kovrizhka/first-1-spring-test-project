package ru.kovrizhkin.springlearn;

import java.util.ArrayList;

public enum MusicEnumeration implements Music{
    TRANCE, ROCK, CLASSICAL;
    private TranceMusic tranceMusic;
    private RockMusic rockMusic;
    private ClassicalMusic classicalMusic;

    @Override
    public ArrayList<String> getSong() {
        return null;
    }
}
