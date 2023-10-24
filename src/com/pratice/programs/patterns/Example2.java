package com.pratice.programs.patterns;

/*
 * 1
   22
   333
   4444
   55555

 */
import java.util.Scanner;

public class Example2 {
	
	public void shape(int n) {
		for (int i = 0; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of rows: ");
		int n = sc.nextInt();

		Example2 obj = new Example2();
		obj.shape(n);
		sc.close();
	}
}
