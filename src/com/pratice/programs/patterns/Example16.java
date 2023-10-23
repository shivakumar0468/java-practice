package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 *  1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1 

 */
public class Example16 {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();

		}
		for (int i = n - 1; i >= 1; i--) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print(k + " ");

			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example16 obj = new Example16();
		obj.shape(n);
		sc.close();

	}
}