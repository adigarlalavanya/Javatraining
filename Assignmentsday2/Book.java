package com.hcltech.Assignmentsday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Book {
    protected String isbn;
    protected String title;
    protected double price;

    // Constructor
    public Book(String isbn, String title, double price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price);
    }
}

class Magazine extends Book {
    private String type;

    // Constructor
    public Magazine(String isbn, String title, double price, String type) {
        super(isbn, title, price);
        this.type = type;
    }

    // Method to display magazine details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: " + type);
    }
}

class Novel extends Book {
    private String author;

    // Constructor
    public Novel(String isbn, String title, double price, String author) {
        super(isbn, title, price);
        this.author = author;
    }

    // Method to display novel details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Author: " + author);
    }
}

