package com.hust.kstn.models;


public class Book extends Media {
    private BookAuthor[] authors;
    private int numOfTokens;

    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        super(title, cost, category);
        this.numOfTokens = numOfTokens;
        this.authors = authors;
    }

    public BookAuthor[] getAuthors() {
        return authors;
    }
    public int getNumOfTokens() {
        return numOfTokens;
    }
    @Override
    public String toString() {
        return super.toString()
            + "[" + this.numOfTokens + "]"
            + "\nAuthors: " + java.util.Arrays.toString(this.authors);
    }
}
