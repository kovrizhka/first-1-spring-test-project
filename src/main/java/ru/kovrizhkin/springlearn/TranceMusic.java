package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

@Component
public class TranceMusic implements Music{

    @Override
    public String getSong() {
        return "Armin van Buuren";
    }
}
