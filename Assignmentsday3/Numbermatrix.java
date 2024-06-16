package com.hcltech.Assignmentsday3;

public class Numbermatrix {
    public static void main(String[] args) {
        // Define a 3x4 matrix
        int[][] matrix = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
        };

        // Iterate through the matrix to print each element
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println(); // Move to the next line after printing each row
        }
    }
}
