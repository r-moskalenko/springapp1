package com.alish.springcourse;

import java.util.List;
import java.util.ArrayList;

public class MusicPlayer {
    private List<Music> musicList = new ArrayList<Music>();

    private String name;

    private int volume;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public MusicPlayer() {

    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for(Music music:musicList) {
            System.out.println("Playing: " + music.getSong());
        }
    }
}
