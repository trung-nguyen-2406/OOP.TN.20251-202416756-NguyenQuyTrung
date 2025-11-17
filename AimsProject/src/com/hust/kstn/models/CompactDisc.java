package com.hust.kstn.models;

public class CompactDisc {
    private static int nbCompactDiscs = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private String[] directors = new String[10];
    private String[] artists = new String[10];
    private Track[] tracks = new Track[20];
    public CompactDisc(String title, String category, double cost, String[] directors, String[] artists, Track[] tracks) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.directors = directors;
        this.artists = artists;
        this.tracks = tracks;
        this.id = ++nbCompactDiscs;
    }
    public int totalLength() {
        int total = 0;
        if (tracks == null) {
            System.out.println("This CD has no tracks");
            return total;
        }
        for (Track track : tracks) {
            total += track.getLength();
        }
        return total;
    }
    public boolean addTrack(Track track) {
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] == null) {
                tracks[i] = track;
                return true;
            }
        }
        System.out.println("The track list is full");
        return false;
    }
    public boolean removeTrack(Track track) {
        if (tracks == null) {
            System.out.println("This CD has no tracks");
            return false;
        }
        for (int i = 0; i < tracks.length; i++) {
            if (tracks[i] == track) {
                tracks[i] = null;
                return true;
            }
        }
        System.out.println("Track not found");
        return false;
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
