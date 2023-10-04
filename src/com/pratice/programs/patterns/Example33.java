package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  5 
	4 5 4 
	3 4 5 4 3 
	2 3 4 5 4 3 2 
	1 2 3 4 5 4 3 2 1 
	2 3 4 5 4 3 2 
	3 4 5 4 3 
	4 5 4 
	5 

 */
public class Example33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = n; i >= 1; i--) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		for (int i = 2; i <= n; i++) {
			for (int j = i; j <= n; j++) {
				System.out.print(j + " ");
			}
			for (int k = n - 1; k >= i; k--) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
		sc.close();
	}

}
