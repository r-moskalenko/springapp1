package com.alish.springcourse;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {

    }

    public void doMyInit() {
        System.out.println("do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("do my destruction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    public static ClassicalMusic getClassicalMusic() {
        return new ClassicalMusic();
    }
}
