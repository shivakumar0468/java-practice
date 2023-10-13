package com.practice.programs.beginner;

import java.util.Scanner;
/*
 * 4.Print an inverted right triangle pattern of stars using nested loops.
Input:
Enter the number of rows: 5
Output:
*****
****
***
**
*

 */
public class InvertedRightAngleTriangle {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n :");
		int n = sc.nextInt();
		InvertedRightAngleTriangle obj = new InvertedRightAngleTriangle();
		obj.shape(n);

		
		sc.close();
	}

}
