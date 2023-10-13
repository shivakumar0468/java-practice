package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 3.Print a right triangle pattern of stars using nested loops.
Input:
Enter the number of rows: 5
Output:
*
**
***
****
*****
 */
public class RightAngleTriangle {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		RightAngleTriangle obj = new RightAngleTriangle();
		obj.shape(n);

		
		sc.close();
	}

}
