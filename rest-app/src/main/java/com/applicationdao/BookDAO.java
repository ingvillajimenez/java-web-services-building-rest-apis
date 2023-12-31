package com.applicationdao;

import java.util.ArrayList; // class ArrayList
import java.util.List; // interface List

import com.applicationentities.Book; // class Book

public class BookDAO {

    public static List<Book> getAllBooks() {

        List<Book> result = new ArrayList<Book>();

        result.add(new Book("ISBN101", "The Adventures of Tom Sawyer", "Mark Twain", (float) 10.25));
        result.add(new Book("ISBN102", "To Kill a Mockingbird", "Harper Lee", (float) 8.50));
        result.add(new Book("ISBN103", "All the Light We Cannot See", "Anthony Doerr", (float) 9.50));
        result.add(new Book("ISBN104", "Little Women", "Louisa May Alcott", (float) 8.75));

        return result;
    }
}

// Jq download link
// https://stedolan.github.io/jq