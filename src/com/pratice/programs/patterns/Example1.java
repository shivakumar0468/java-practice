package com.pratice.programs.patterns;

/* 
 *1 
  1 2 
  1 2 3 
  1 2 3 4 
  1 2 3 4 5 

 * 
 */
import java.util.Scanner;

public class Example1 {
	public void shape(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();
		Example1 obj = new Example1();
		obj.shape(n);

		
		sc.close();
	}
}
