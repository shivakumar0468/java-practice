package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1 
	2 6 
	3 7 10 
	4 8 11 13 
	5 9 12 14 15 
 */
public class Example27 {
	public void shape(int n) {
		int  k=1;

		for (int i =1;i<=n;i++) {
			k=i;
			for (int j = 1; j <=i; j++) {
				System.out.print(k + " ");
				k=k+n-j;

			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		Example27 obj = new Example27();
		obj.shape(n);
		sc.close();
	}

}
