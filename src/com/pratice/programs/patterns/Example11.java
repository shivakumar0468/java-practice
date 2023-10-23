package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 *  1
	21
	321
	4321
	54321
 */
public class Example11 {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = i; j > 0; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example11 obj = new Example11();
		obj.shape(n);
		sc.close();
	}

}
