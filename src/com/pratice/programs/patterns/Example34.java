package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 2 3 4 5 
	2 3 4 5 1 
	3 4 5 1 2 
	4 5 1 2 3 
	5 1 2 3 4 

 */
public class Example34 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int j = i;
			for (int k = 1; k <= n; k++) {
				System.out.print(j + " ");
				j++;
				if (j > n)
					j = 1;
			}
			System.out.println();
		}
		sc.close();
	}

}
