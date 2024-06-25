package com.hcltech.Excercisesday8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileLineByLine {

    public static void main(String[] args) {
        String filePath = "/home/adigarla/eclipse-workspace/training/src/line.txt"; // file path

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
        	//if file is not found it gives message
            System.out.println("An error occurred while reading the file.");
        }
    }
}
