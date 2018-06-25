package com.project.udacity.my.musicplayer;

import android.graphics.drawable.Drawable;
import android.nfc.Tag;

import java.util.ArrayList;

public class Artist {

    private String name;
    private String bio;
    private Drawable picture;

    public Artist(String name, Drawable picture) {
        setName(name);
        setPicture(picture);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public void setPicture(Drawable picture) {
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }

    public Drawable getPicture() {
        return picture;
    }
}
