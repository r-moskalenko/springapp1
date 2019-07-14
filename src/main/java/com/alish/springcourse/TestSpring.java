package com.alish.springcourse;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        ClassicalMusic classicalMusic = context.getBean("musicBean1",ClassicalMusic.class);

        System.out.println(classicalMusic.getSong());

//        MusicPlayer musicPlayer1 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        MusicPlayer musicPlayer2 = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean equal = musicPlayer1 == musicPlayer2;
//
//        System.out.println(equal);
//
//        System.out.println(musicPlayer1);
//
//        System.out.println(musicPlayer2);
//
//        musicPlayer1.setVolume(10);
//
//        System.out.println("volume:");
//
//        System.out.println(musicPlayer1.getVolume());
//
//        System.out.println(musicPlayer2.getVolume());

        context.close();
    }
}
