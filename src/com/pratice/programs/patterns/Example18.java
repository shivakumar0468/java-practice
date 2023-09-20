package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 2 3 4 5 
	 2 3 4 5 
	  3 4 5 
	   4 5 
	    5 
	    5 
	   4 5 
	  3 4 5 
	 2 3 4 5 
	1 2 3 4 5 

 */
public class Example18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = i; k <= n; k++) {
				System.out.print(k+" ");
			}
			System.out.println();

		}
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");

			}
			for (int k = i; k <= n; k++) {
				System.out.print(k+" ");
			}
			System.out.println();

		}
		sc.close();
	}

}
