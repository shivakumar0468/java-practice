package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 6.Print a pyramid pattern of stars using nested loops.
Input:
Enter the number of rows: 5
Output:
    *
   ***
  *****
 *******
*********

 */
public class PyramidalPattern {
	public void shape(int n) {
		int m = n - 1;
		int star = 1;

		for (int i = 0; i < n; i++) {
			for (int j = m; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 0; k < star; k++) {
				System.out.print("*");

			}
			star += 2;
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows :");
		int n = sc.nextInt();
		PyramidalPattern obj =new PyramidalPattern();
		obj.shape(n);
		sc.close();
	}

}
