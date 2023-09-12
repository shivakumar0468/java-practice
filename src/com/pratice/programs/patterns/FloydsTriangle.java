package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 * 16. Print floyd's triangle using nested loops.
Input:
Enter the number of rows: 5
Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15

 */
public class FloydsTriangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows:");
		int n = sc.nextInt();
		int i, j;
		for (i = 1; i <= 5; i++) {
			for (j = 1; j <= i; j++) {
				System.out.print(n);
				n++;
			}
			System.out.println("\n");
		}
		sc.close();
	}

}
