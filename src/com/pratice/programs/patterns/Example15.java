package com.pratice.programs.patterns;

import java.util.Scanner;

public class Example15 {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= n - i + 1; k++) {
				System.out.print(k + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example15 obj = new Example15();
		obj.shape(n);
		sc.close();
	}

}
