package com.pratice.programs.patterns;

/*
 * 14. Print Right Pascal’s Triangle using nested loops.
Input:
Enter the number of rows: 4
Output:
*
* *
* * *
* * * *
* * *
* *
*

 */
import java.util.Scanner;

public class RightPascalsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = n; i >= -n; i--) {
			for (int j = n; j >= Math.abs(i); j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}
}
