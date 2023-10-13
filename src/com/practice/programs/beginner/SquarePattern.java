package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 2.Print a hollow square pattern of stars using nested loops.
Input:
Enter the number of rows: 5
Output:
*****
* *
* *
* *
*****

 */
public class SquarePattern {
	public void shape(int n){
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == 1 || i == n) {
					System.out.print("*");

				} else {
					System.out.print(" ");
				}

			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the stars in each side of square: ");
		int n = sc.nextInt();
		SquarePattern obj=new SquarePattern();
		obj.shape(n);
		
		sc.close();

	}

}
