package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 * 1.Print a square pattern of stars using nested loops.
	Input:
	Enter the number of rows: 5
	Output:
 	*****
 	*****
 	*****
 	*****
 	*****
 */
public class SquarePattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the numbers of rows: ");
		int rows = sc.nextInt();

		for (int i = 0; i < rows; i++) {//navigate to next row
			for(int j=0; j<rows; j++) {//complete each row
				System.out.print("*");//print * in same line
			}
			System.out.println();//next line
		}
		sc.close();
	}

}
