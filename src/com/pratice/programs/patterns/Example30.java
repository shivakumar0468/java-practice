package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 10 11 20 21 

	2 9 12 19 22 
	
	3 8 13 18 23 
	
	4 7 14 17 24 
	
	5 6 15 16 25 


 */
public class Example30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (j % 2 == 0) {
					System.out.print((n * (j)) + i + 1 + " ");
				} else {
					System.out.print((n * (j + 1)) - i + " ");
				}

			}
			System.out.println("\n");
		}

		sc.close();
	}

}
