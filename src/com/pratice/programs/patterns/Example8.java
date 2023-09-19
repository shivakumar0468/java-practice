package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 * 5
   54
   543
   5432
   54321

 */
public class Example8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n=sc.nextInt();
		
		for(int i=n;i>0;i--) {
			for(int j=n;j>=i;j--) {
				System.out.print(j+" ");
				
			}
			System.out.println();
		}
		sc.close();
	}

}
