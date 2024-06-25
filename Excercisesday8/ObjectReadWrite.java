package com.hcltech.Excercisesday8;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Date;

public class ObjectReadWrite {

    public static void main(String[] args) {
        // Objects to write to file
        Date currentDate = new Date();
        Double pi = Math.PI;
        Long population = 7910000000L; // Approximate current world population

        // File path
        String filePath = "objects.txt";

        // Write objects to file
        writeObjectsToFile(filePath, currentDate, pi, population);

        // Read objects back from file
        Object[] readObjects = readObjectsFromFile(filePath);

        // Display read objects
        System.out.println("Date object read from file: " + readObjects[0]);
        System.out.println("Double object read from file: " + readObjects[1]);
        System.out.println("Long object read from file: " + readObjects[2]);
    }

    // Method to write objects to file
    private static void writeObjectsToFile(String filePath, Date date, Double value, Long number) {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            File file = new File(filePath);
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            bw.write(date.getTime() + "\n");
            bw.write(value + "\n");
            bw.write(number + "\n");

            System.out.println("Objects written to file successfully.");
        } catch (IOException e) {
            System.err.println("Error writing objects to file: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }
    }

    // Method to read objects from file
    private static Object[] readObjectsFromFile(String filePath) {
        FileReader fr = null;
        BufferedReader br = null;
        Object[] objects = new Object[3];

        try {
            File file = new File(filePath);
            fr = new FileReader(file);
            br = new BufferedReader(fr);

            objects[0] = new Date(Long.parseLong(br.readLine()));
            objects[1] = Double.parseDouble(br.readLine());
            objects[2] = Long.parseLong(br.readLine());

            System.out.println("Objects read from file successfully.");
        } catch (IOException | NumberFormatException e) {
            System.err.println("Error reading objects from file: " + e.getMessage());
        } finally {
            try {
                if (br != null) br.close();
                if (fr != null) fr.close();
            } catch (IOException e) {
                System.err.println("Error closing file: " + e.getMessage());
            }
        }

        return objects;
    }
}
