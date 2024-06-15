package com.hcltech.Excercisesday2;

public class Document {
    private String text;

    // Constructor
    public Document() {
        this.text = "";  // Initialize text to an empty string
    }

    // Method to set the text content
    public void setText(String text) {
        this.text = text;
    }

    // Method to get the text content
    public String getText() {
        return text;
    }

    // Override toString method to return the text content
    @Override
    public String toString() {
        return text;
    }

    public static void main(String[] args) {
        Document doc = new Document();
        doc.setText("This is the document.");
        System.out.println(doc);
    }
}
