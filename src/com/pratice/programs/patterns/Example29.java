package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 
	2 6 
	3 7 10 
	4 8 11 13 
	5 9 12 14 15 
 */
public class Example29 {
	public void shape(int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				if (j % 2 == 0) {
					System.out.print(1 + j * n - (j - 1) * j / 2 + i - j + " ");
				} else {
					System.out.print(1 + j * n - (j - 1) * j / 2 + i - j + " ");
				}

			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example29 obj = new Example29();
		obj.shape(n);
		sc.close();
	}

}
