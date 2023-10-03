package com.pratice.programs.patterns;

import java.util.Scanner;

public class Example31 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		int temp = 0;

		for (int i = n; i >= 1; i--) {
			for (int j = n; j >= i; j--) {
				System.out.print(j + " ");
				temp = j;
			}
			for (int k = n - i + 1; k < n; k++) {
				System.out.print(temp+" ");
			}
			System.out.println();
		}
		sc.close();

	}
}
