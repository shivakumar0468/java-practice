package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 *  1 
	2 7 
	3 8 13 
	4 9 14 19 
	5 10 15 20 25 
 */
public class Example12 {
	public void shape(int n) {
		for (int i = 1; i <= n; i++) {
			int temp = i;
			for (int j = i; j >= 1; j--) {
				System.out.print(temp + " ");
				temp = temp + n;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example12 obj = new Example12();
		obj.shape(n);
		sc.close();
	}

}
