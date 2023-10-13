package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 5.Print a diamond pattern of stars using nested loops.
Input:
Enter the number of rows: 5
Output:
  *
 ***
*****
 ***
  *
 */
public class DiamondPattern {
	public void shape(int n) {
		int x = n / 2 + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if ((j >= x) != false && j <= n - x + 1) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			if (i <= n / 2) {
				x--;
			} else {
				x++;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		DiamondPattern obj = new DiamondPattern();
		obj.shape(n);
		sc.close();

	}
}