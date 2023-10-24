package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 *  10000
	02000
	00300
	00040
	00005
 */
public class Example22 {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print("0");

			}
			System.out.print(i + "");
			for (int k = i; k < n; k++) {
				System.out.print("0");

			}
			System.out.println();

		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example22 obj = new Example22();
		obj.shape(n);
		sc.close();
	}

}
