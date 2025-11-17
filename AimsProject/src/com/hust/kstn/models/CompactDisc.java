package com.hust.kstn.models;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private String[] directors;
    private String[] artists;
    private Track[] tracks;
    public CompactDisc(String title, String category, double cost, String[] directors, String[] artists, Track[] tracks) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.directors = directors;
        this.artists = artists;
        this.tracks = tracks;
        this.id = ++nbCompactDiscs;
    }
    public String getTitle() {
        return title;
    }
    public String getCategory() {
        return category;
    }
    public double getCost() {
        return cost;
    }
    public String[] getDirectors() {
        return directors;
    }
    public String[] getArtists() {
        return artists;
    }
    public Track[] getTracks() {
        return tracks;
    }
    
    @Override
    public String toString() {
        return "CD[" + this.id + "][" 
            + this.title + "][" 
            + this.cost + "][" 
            + this.category + "]"
            + "\nDirectors: " + java.util.Arrays.toString(this.directors)
            + "\nArtists: " + java.util.Arrays.toString(this.artists)
            + "\nTracks: " + java.util.Arrays.toString(this.tracks);
    }
}
