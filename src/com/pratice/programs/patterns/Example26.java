package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  5 5 5 5 5 
	4 5 5 5 5 
	3 4 5 5 5 
	2 3 4 5 5 
	1 2 3 4 5 

 */
public class Example26 {
	public void shape(int n ) {
		for (int i = n; i > 0; i--) {
			for (int j = i; j < n; j++) {
				System.out.print(j + " ");

			}
			for (int k = n - i; k < n; k++) {
				System.out.print(5 + " ");

			}
			System.out.println();

		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example26 obj = new Example26();
		obj.shape(n);
		sc.close();
	}

}
