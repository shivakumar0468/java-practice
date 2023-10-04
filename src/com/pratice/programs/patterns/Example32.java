package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 
	1 2 
	1 2 3 
	1 2 3 5 
	1 2 3 5 8 

 */
public class Example32 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int a = 0;
			int b = 1;
			for (int j = 1; j <= i; j++) {
				int c = a + b;
				System.out.print(c + " ");
				a = b;
				b = c;

			}
			System.out.println();
		}
		sc.close();
	}

}
