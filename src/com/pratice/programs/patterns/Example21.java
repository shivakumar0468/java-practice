package com.pratice.programs.patterns;

import java.util.Scanner;

/*
 * 	1 
	1 0 
	1 0 1 
	1 0 1 0 
 */
public class Example21 {
	
	public void shape(int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2 + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example21 obj = new Example21();
		obj.shape(n);
		sc.close();
	}

}
