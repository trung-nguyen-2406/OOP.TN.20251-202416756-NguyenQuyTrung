package com.hust.kstn.test;

import com.hust.kstn.models.BookAuthor;
import com.hust.kstn.models.Book;

public class BookTest {
    public static void main(String[] args) {
        BookAuthor author1 = new BookAuthor("J.K. Rowling", 1965, "British author, best known for the Harry Potter series.");
        BookAuthor author2 = new BookAuthor("George R.R. Martin", 1948, "American novelist and short story writer, known for A Song of Ice and Fire.");
        BookAuthor[] authors = {author1, author2};

        Book book = new Book("Fantasy Anthology", "Fantasy", 29.99, 5, authors);
        System.out.println(book);
        
    }
}
