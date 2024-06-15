package com.hcltech.Excercisesday2;

public class Email extends Document {
    private String sender;
    private String recipient;
    private String title;

    // Constructor
    public Email(String sender, String recipient, String title, String text) {
        super();  // Call superclass constructor to initialize text field
        this.sender = sender;
        this.recipient = recipient;
        this.title = title;
        setText(text);  // Set text content using inherited setText method
    }

    // Accessor methods
    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public String getTitle() {
        return title;
    }

    // Mutator methods
    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    // Override toString method to concatenate all text fields
    @Override
    public String toString() {
        return "Sender: " + sender + "\nRecipient: " + recipient + "\nTitle: " + title + "\n" + getText();
    }
    public static void main(String[] args) {
        Email email = new Email("Lavanya", "Pravalli", "subject", "Hello");
        System.out.println("Email details:");
        System.out.print(email);
    }
}

