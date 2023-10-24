package com.pratice.programs.patterns;
/*
 * 			    5 
			   4 5 
			  3 4 5 
			 2 3 4 5 
			1 2 3 4 5 
 */
import java.util.Scanner;

public class Example19 {
	
	public void shape(int n) {
		for (int i = n; i >= 1; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int k = i; k <= n; k++) {
				System.out.print(k + " ");

			}
			System.out.println();

		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example19 obj = new Example19();
		obj.shape(n);
		sc.close();
	}

}
