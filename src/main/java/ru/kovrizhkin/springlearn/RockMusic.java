package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class RockMusic implements Music{

    private ArrayList<String> rockMusicList = new ArrayList<>() {{
        add("Ich will");
        add("Shadow moses");
        add("Attack");
    }};
    @Override
    public ArrayList<String> getSong() {
        return this.rockMusicList;
    }


}
