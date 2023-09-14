package com.pratice.programs.patterns;

/*
 * 18. Print palindromic number pyramid using nested loops.
Input:
Enter the number of rows: 5
Output:
1
212
32123
4321234
543212345

 */
import java.util.Scanner;

public class PalindromicNumberPyramid {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		int z = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = n-1; j>=i; j--) {
				System.out.print(" ");
			}
			for (int k = z; k >= 1; k--) {
				System.out.print(Math.abs(k - i) + 1);
			}
			z += 2;
			System.out.println();
		}
		sc.close();
	}

}
