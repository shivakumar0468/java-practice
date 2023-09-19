package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *      
    1 
   1 1 
  1 2 1 
 1 3 3 1
 */
public class Example13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Entervthe no of rows: ");
		int n = sc.nextInt();

		for (int i = 0; i <n; i++) {
			for (int j = n; j > i; j--) {
				System.out.print(" ");
			}
			int temp = 1;
			for (int k = 1; k <= i; k++) {
				System.out.print(temp+" ");
				temp = temp * (i - k) / (k);
			}
			System.out.println();
		}
		sc.close();
	}

}
