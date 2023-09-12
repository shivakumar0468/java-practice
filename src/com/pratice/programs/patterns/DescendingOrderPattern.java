package com.pratice.programs.patterns;

/*
 * 17. Print descending order pattern using nested loops.
Input:
Enter the number of rows: 5
Output:
5
5 4
5 4 3
5 4 3 2
5 4 3 2 1
 */
import java.util.Scanner;

public class DescendingOrderPattern {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
		sc.close();
	}
}
