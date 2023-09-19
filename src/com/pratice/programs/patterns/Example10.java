package com.pratice.programs.patterns;

import java.util.Scanner;
/*
 *  1
	23
	456
	78910
	1112131415

 */
public class Example10{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		int num=1;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(num);
				num=num+1;
			}
			
			System.out.println();
		}
		sc.close();
	}
}
