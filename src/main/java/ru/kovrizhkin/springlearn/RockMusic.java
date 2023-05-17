package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;


public class RockMusic implements Music{
    @Override
    public String getSong() {
        return "Ich will";
    }
}
