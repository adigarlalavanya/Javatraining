package com.hcltech.Assignmentsday1;

public class Pattern {

	public static void main(String[] args) {
		
		//for loop
		int rows=3;
		for(int i=1;i<=rows;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		//using while loop
       /* int i = 1;
        while (i <= rows) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }*/
	}

}
