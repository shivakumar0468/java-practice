package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 * 5 4 3 2 1 
 * 4 3 2 1
 * 3 2 1 
 * 2 1 
 * 1 
 * 1 
 * 2 1
 * 3 2 1 
 * 4 3 2 1
 * 5 4 3 2 1 
 */
public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Enter the no of rows: ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		for(int i=1;i<=n;i++) {
			for(int j=i;j>0;j--) {
				System.out.print(j);
				
			}
			System.out.println();
		}
		sc.close();
	}

}
