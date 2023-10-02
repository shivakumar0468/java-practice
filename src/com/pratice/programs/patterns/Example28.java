package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 
	2 4 
	3 6 9 
	4 8 12 16 
	5 10 15 
	6 12 
	7 

 */
public class Example28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		int temp = 1;
		for (int i = 1; i <= n / 2 + 1; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(temp * j + " ");
			}
			System.out.println();
			temp++;
		}
		for (int i = 1; i <= n / 2; i++) {
			for (int j = 1; j <= n / 2 + 1 - i; j++) {
				System.out.print(temp * j + " ");
			}
			System.out.println();
			temp++;
		}
		sc.close();
	}

}
