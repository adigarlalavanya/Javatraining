package com.hcltech.Assignmentsday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bookdemo {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        try {
            // Read details for the magazine
            System.out.println("Enter details for the Magazine:");
            System.out.print("ISBN: ");
            String magazineIsbn = reader.readLine();
            System.out.print("Title: ");
            String magazineTitle = reader.readLine();
            System.out.print("Price: ");
            double magazinePrice = Double.parseDouble(reader.readLine());
            System.out.print("Type: ");
            String magazineType = reader.readLine();
            
            Magazine magazine = new Magazine(magazineIsbn, magazineTitle, magazinePrice, magazineType);
            
            // Read details for the novel
            System.out.println("Enter details for the Novel:");
            System.out.print("ISBN: ");
            String novelIsbn = reader.readLine();
            System.out.print("Title: ");
            String novelTitle = reader.readLine();
            System.out.print("Price: ");
            double novelPrice = Double.parseDouble(reader.readLine());
            System.out.print("Author: ");
            String novelAuthor = reader.readLine();
            
            Novel novel = new Novel(novelIsbn, novelTitle, novelPrice, novelAuthor);
            
            // Display details of the magazine
            System.out.println("\nMagazine Details:");
            magazine.displayDetails();
            
            System.out.println(); // For better readability in output
            
            // Display details of the novel
            System.out.println("Novel Details:");
            novel.displayDetails();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


