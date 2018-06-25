package com.project.udacity.my.musicplayer;

import android.graphics.drawable.Drawable;

import java.util.ArrayList;

public class Album {

    private String name;
    private Drawable cover;
    private ArrayList<String> songs;

    public Album(String name, Drawable cover) {
        setName(name);
        setCover(cover);
    }
    public Album(String name, Drawable cover, ArrayList<String> songs) {
        setName(name);
        setCover(cover);
        setAllSongs(songs);
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setCover(Drawable cover) {
        this.cover = cover;
    }

    public String getName() {
        return name;
    }
    public Drawable getCover() {
        return cover;
    }

    /**
     * Song array management
     */
    public void setAllSongs(ArrayList<String> songs) {
        this.songs = songs;
    }
    public ArrayList<String> getAllSongs() {
        return songs;
    }
    public void addSong(String song) {
        this.songs.add(song);
    }
    public void setSong(String song, int index) {
        this.songs.set(index, song);
    }
    public String getSong(int index) {
        return this.songs.get(index);
    }
    public int getSongIndex(String song) {
        return this.songs.indexOf(song);
    }
    public void removeSong(int index) {
        this.songs.remove(index);
    }
}
