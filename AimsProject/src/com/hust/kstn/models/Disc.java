package com.hust.kstn.models;

public class Disc extends Media {
    private String[] directors = new String[5];

    public Disc(String title, String category, double cost, String[] directors) {
        super(title, cost, category);
        this.directors = directors;
    }

    @Override
    public String toString() {
        return super.toString()
                + "[" + java.util.Arrays.toString(this.directors) + "]";
    }

    public String[] getDirectors() {
        return directors;
    }
}
