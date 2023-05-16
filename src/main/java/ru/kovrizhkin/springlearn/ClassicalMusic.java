package ru.kovrizhkin.springlearn;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("Initialization in progress...");
    }

    public void doMyDestroy() {
        System.out.println("I'm destroying");
    }
    @Override
    public String getSong() {
        return "Magic flute";
    }
}
