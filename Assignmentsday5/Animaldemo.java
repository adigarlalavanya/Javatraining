package com.hcltech.Assignmentsday5;

import java.util.Scanner;

public class Animaldemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Spider
        System.out.println("Enter the name of insect:");
        String spiderName = scanner.nextLine();
        Spider spider = new Spider(spiderName);
        spider.walk();
        spider.eat();

        // Cat 
        System.out.print("Enter the name of the cat: ");
        String catName = scanner.nextLine();
        Cat cat = new Cat(catName);
        cat.walk();
        cat.eat();
        cat.play();

        // Fish
        System.out.print("Enter the name of the fish: ");
        String fishName = scanner.nextLine();
        Fish fish = new Fish();
        fish.setName(fishName);
        fish.walk();
        fish.eat();
        fish.play();

        scanner.close();
    }
}