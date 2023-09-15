package com.pratice.programs.patterns;

import java.util.Scanner;

public class Example6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				if (k < i) {
					System.out.print(k + " ");
				} else {
					System.out.print(k);
				}

			}
			System.out.println();
		}
		sc.close();
	}

}
