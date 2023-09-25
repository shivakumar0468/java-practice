package com.pratice.programs.patterns;

import java.util.Scanner;

public class Example27 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		int  k=1;

		for (int i =1;i<=n;i++) {
			k=i;
			for (int j = 1; j <=i; j++) {
				System.out.print(k + " ");
				k=k+n-j;

			}
			System.out.println();
		}
		sc.close();
	}

}
