package com.hust.kstn.models;


public class Book {
    private static int nbBooks = 0;
    private int id;
    private String title;
    private String category;
    private double cost;
    private BookAuthor[] authors;
    private int numOfTokens;

    public Book(String title, String category, double cost, int numOfTokens, BookAuthor[] authors) {
        this.title = title;
        this.category = category;
        this.cost = cost;
        this.numOfTokens = numOfTokens;
        this.authors = authors;
        this.id = ++nbBooks;
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

    public BookAuthor[] getAuthors() {
        return authors;
    }
    public int getNumOfTokens() {
        return numOfTokens;
    }
    @Override
    public String toString() {
        return "Book[" + this.id + "][" 
            + this.title + "][" 
            + this.cost + "][" 
            + this.category + "]["
            + this.numOfTokens + "]"
            + "\nAuthors: " + java.util.Arrays.toString(this.authors);
    }
}
