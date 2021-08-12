package com.labs.songr;

import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private double length;
    private int trackNumber;
    @ManyToOne
    private Album songAlbum;

    public Song(){};



    public Song(String title, double length, int trackNumber, Album songAlbum) {
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.songAlbum = songAlbum;
    }

    public int getId() {
        return id;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }

    public Album getAlbum() {
        return songAlbum;
    }

    public void setAlbum(Album album) {
        this.songAlbum = album;
    }
}
