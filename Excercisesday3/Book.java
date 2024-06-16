package com.hcltech.Excercisesday3;

class Book {
    private String isbn;
    private String title;
    private String author;
    private double price;

    // Parameterized constructor
    public Book(String isbn, String title, String author, double price) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }

    // Method to calculate discounted price
    public double discountedPrice(double discountPercent) {
        double discountAmount = (discountPercent / 100) * price;
        return price - discountAmount;
    }
}

