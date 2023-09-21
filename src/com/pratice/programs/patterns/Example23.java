package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  111111
	111222
	113333
	144444
	555555
 */
public class Example23 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(1 + "");

			}
			System.out.print(i + "");
			for (int k = 1; k <= i; k++) {
				System.out.print(i + "");

			}
			System.out.println();

		}
		sc.close();
	}

}
